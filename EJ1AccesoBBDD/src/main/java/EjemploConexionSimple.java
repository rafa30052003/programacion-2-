import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class EjemploConexionSimple {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/BDArticulos";
		String nombre = "root";
		String pwd = "";
		
		String sql1="Select * from articulos where precio >10";
		try {
			//PASO 1: ESTABLECER CONEXION A MI BASE DE DATOS
			Connection miConexion = DriverManager.getConnection(url,nombre,pwd);
			
			//PASO 2: CREAR EL OBJETO STATEMENT
			Statement miSt = miConexion.createStatement();
			
			//PASO 3: EJECUTAR SQL
			ResultSet miRs = miSt.executeQuery(sql1); 
			
			//PASO 4: RECORRER EL RESUL SET
			while(miRs.next()) {
				System.out.println(miRs.getInt("codigo")+" "+ miRs.getString("descripcion")+" "+ miRs.getDouble("precio"));
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}
	
}
