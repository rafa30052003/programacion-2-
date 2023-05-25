import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.connection.Connect;
import model.domain.Autor;
import model.domain.Libro;

public class Ejecutable {

	public static void main(String[] args) {
		Autor a = new Autor ("87654321G", "Miguel", "Cervantes");
		addAutor(a);
	}
	
	public static boolean addAutor(Autor a) {
		boolean result = false;
		String sql = "INSERT INTO autor (dni,nombre,apellidos) VALUES (?,?,?)";
		try {
			Connection miCon = Connect.getConnect();
			PreparedStatement sentence = miCon.prepareStatement(sql);
			sentence.setString(1, a.getDni());
			sentence.setString(2, a.getNombre());
			sentence.setString(3, a.getApellidos());
			sentence.executeUpdate();
			result = true;
		}catch(SQLException se) {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	
		return result;
	}
	// devuelve la lista de libros de un autor 
		public static List <Libro> getLibros(Autor a){
			List <Libro> listLibros = new ArrayList<Libro>();
			String sql = "Select isbn, titulo where a.dni = ?";
			
			try {
				Connection miCon = Connect.getConnect();
				PreparedStatement sentence = miCon.prepareStatement(sql);
				sentence.setString(1, a.getDni());
				ResultSet rs = sentence.executeQuery();
				while(rs.next()) {
					Libro l= new Libro ();
					l.setIsbn(rs.getString("isbn"));
					l.setIsbn(rs.getString("titulo"));
					listLibros.add(l);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return listLibros;
		}
	//dado un dni devuelve el autor
		public static Autor searchAutor (String dni) {
			Autor result = null;
			String sql ="SELECT * FROM autor WHERE dni = ?" ;
			
			try {
				Connection miCon = Connect.getConnect();
				PreparedStatement sentence = miCon.prepareStatement(sql);
				sentence.setString(1, dni);
				ResultSet rs = sentence.executeQuery();
				rs.next();
				result = new Autor();
				result.setDni(rs.getString(1));
				result.setNombre(rs.getNString(2));
				result.setApellidos(rs.getString(3));
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return result;
		}
	//modifique los datos de un autor
		public static boolean updateAutor ( Autor a) {
			boolean valid = false;
			String sql = "UPDATE autor SET nombre = ?, apellidos = ? WHERE autor.dni = ?";
			
			try {
				Connection miCon = Connect.getConnect();
				PreparedStatement sentence = miCon.prepareStatement(sql);
				sentence.setString(1, a.getNombre());
				sentence.setString(2, a.getApellidos());
				sentence.setString(3, a.getDni());
				sentence.executeUpdate();
				valid = true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return valid;
			
		}
	//borre los dator de un autor
		public static boolean deleteAutor (Autor a) {
			boolean valid = false;
			String sql = "DELETE from autor WHERE dni = ?";
			
			try {
				Connection miCon = Connect.getConnect();
				PreparedStatement sentence = miCon.prepareStatement(sql);
				sentence.setString(1, a.getDni());
				sentence.executeUpdate();
				valid = true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return valid;
		}
}
