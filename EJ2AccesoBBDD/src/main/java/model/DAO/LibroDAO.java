package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.connection.Connect;
import model.domain.Autor;
import model.domain.Libro;

public class LibroDAO implements DAO<Libro> {
	private final static String FINDALL = "Select * from libro";
	private final static String FINDBYID = "Select * from libro where isbn = ?";
	private final static String INSERT = " INSERT INTO libro (isbn, titulo, dni_autor) VALUES (?,?,?)";
	private final static String UPDATE = " UPDATE  libro SET titulo = ?, dni_autor = ?,  WHERE isbn = ?";
	private final static String FINDBYAUTOR="Select * from libro where dni_autor = ?";
	
	private Connection conn;
	public LibroDAO(Connection conn) {
		this.conn = conn;
	}
	
	public LibroDAO() {
		this.conn = Connect.getConnect();
	}

	@Override
	public List<Libro> findAll() throws SQLException {
		List<Libro> result = new ArrayList<Libro>();
		
		try(PreparedStatement pst =this.conn.prepareStatement(FINDALL)){//try: para que sea autocloseable
			try(ResultSet rs = pst.executeQuery()){//try: para que sea autocloseable
				while(rs.next()) {
					Libro l = new Libro();
					l.setIsbn(rs.getString("isbn"));
					l.setTitulo(rs.getString("titulo"));
					AutorDAO adao = new AutorDAO(this.conn);
					Autor a = adao.finfById(rs.getString("dni_autor"));
					l.setA(a);
					result.add(l);
				}
			}
			
		}
		
		return result;
	}

	@Override
	public Libro finfById(String id) throws SQLException {
		Libro result = null;
		
		try(PreparedStatement pst =this.conn.prepareStatement(FINDBYID)){//try: para que sea autocloseable
			pst.setString(1, id);
			try(ResultSet rs = pst.executeQuery()){//try: para que sea autocloseable
				if(rs.next()) {
					Libro l = new Libro();			
					l.setIsbn(rs.getString("isbn"));
					l.setTitulo(rs.getString("titulo"));
					AutorDAO adao = new AutorDAO(this.conn);
					Autor a = adao.finfById(rs.getString("dni_autor"));
					l.setA(a);
					result = l;
					
				
			}
			
		}
		
		
		
		}
		return result;
	}

	@Override
	public Libro save(Libro entity) throws SQLException {
		Libro result = new Libro();
		if(entity !=null) {
			
			Libro a = finfById(entity.getIsbn());
			if(a.getIsbn().equals("")) {
				AutorDAO adao = new AutorDAO(this.conn);
				adao.save(entity.getA());
				try(PreparedStatement pst =this.conn.prepareStatement(INSERT)){
					pst.setString(1, entity.getIsbn());
					pst.setString(2, entity.getTitulo());
					pst.setString(3, entity.getA().getDni());
					pst.executeUpdate();
				}
			}
		}else {
			AutorDAO adao = new AutorDAO(this.conn);
			adao.save(entity.getA());
			try(PreparedStatement pst =this.conn.prepareStatement(UPDATE)){
				
				pst.setString(1, entity.getTitulo());
				pst.setString(2, entity.getA().getDni());
				pst.setString(3, entity.getIsbn());
				pst.executeUpdate();
			}
		}
		return result;
		
	}

	@Override
	public void delete(Libro entity) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
	public List<Libro> findByAutor(Autor a) throws SQLException {
		List<Libro> result = new ArrayList<Libro>();
		AutorDAO adao = new AutorDAO(this.conn);
		Autor _a = adao.finfById(a.getDni());
		if(_a!=null) {
			try(PreparedStatement pst =this.conn.prepareStatement(FINDBYAUTOR)){//try: para que sea autocloseable
				pst.setString(1, a.getDni());
				try(ResultSet rs = pst.executeQuery()){//try: para que sea autocloseable
					while(rs.next()) {
						Libro l = new Libro();
						l.setIsbn(rs.getString("isbn"));
						l.setTitulo(rs.getString("titulo"));
						l.setA(_a);
						result.add(l);
					}
				}
				
			}

		}
		
				
		return result;
	}
	
	
}
