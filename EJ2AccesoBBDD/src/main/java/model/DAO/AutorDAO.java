package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.connection.Connect;
import model.domain.Autor;

public class AutorDAO implements DAO<Autor>{
	private final static String FINDALL = "Select * from autor";
	private final static String FINDBYID = "Select * from autor where dni = ?";
	private final static String INSERT = " INSERT INTO autor (dni, nombre, apellidos) VALUES (?,?,?)";
	private final static String UPDATE = " UPDATE  autor SET nombre = ?, apellidos = ?,  WHERE dni = ?";
	private Connection conn;
	public AutorDAO(Connection conn) {
		this.conn = conn;
	}
	
	public AutorDAO() {
		this.conn = Connect.getConnect();
	}
	
	public List<Autor> findAll() throws SQLException {
		List<Autor> result = new ArrayList<Autor>();
		
		try(PreparedStatement pst =this.conn.prepareStatement(FINDALL)){//try: para que sea autocloseable
			try(ResultSet rs = pst.executeQuery()){//try: para que sea autocloseable
				while(rs.next()) {
					Autor a = new Autor();
					a.setDni(rs.getString("dni"));
					a.setNombre(rs.getString("nombre"));
					a.setApellidos(rs.getString("apellidos"));
					result.add(a);
				}
			}
			
		}
		
		return result;
	}

	public Autor finfById(String id)throws SQLException {
	Autor result = new Autor();
		
		try(PreparedStatement pst =this.conn.prepareStatement(FINDBYID)){//try: para que sea autocloseable
			pst.setString(1, id);
			try(ResultSet rs = pst.executeQuery()){//try: para que sea autocloseable
				if(rs.next()) {
					result.setDni(rs.getString("dni"));
					result.setNombre(rs.getString("nombre"));
					result.setApellidos(rs.getString("apellidos"));
				}
			}
			
		}
		return result;
	}
	

	public Autor save(Autor entity)throws SQLException {
		Autor result = new Autor();
			if(entity !=null) {
				Autor a = finfById(entity.getDni());
				if(a.getDni().equals("")) {
					try(PreparedStatement pst =this.conn.prepareStatement(INSERT)){
						pst.setString(1, entity.getDni());
						pst.setString(2, entity.getNombre());
						pst.setString(3, entity.getApellidos());
						pst.executeUpdate();
					}
				}
			}else {
				try(PreparedStatement pst =this.conn.prepareStatement(UPDATE)){
					
					pst.setString(1, entity.getNombre());
					pst.setString(2, entity.getApellidos());
					pst.setString(3, entity.getDni());
					pst.executeUpdate();
				}
			}
		return result;
	}

	public void delete(Autor entity) {
		// TODO Auto-generated method stub
		
	}
	
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
