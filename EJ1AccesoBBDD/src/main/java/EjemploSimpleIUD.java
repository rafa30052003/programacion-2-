import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

public class EjemploSimpleIUD {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/BDArticulos";
		String user = "root";
		String pass = "";
		
		String sql1 = "UPDATE articulos SET precio = precio+precio * 0.1";
		String sql2= "INSERT INTO articulos (codigo, descripcion, precio) VALUES (5,'Camiseta',30)";
		String sql3= "DELETE FROM articulos WHERE descripcion = 'Camiseta'";
		try {
			//Paso 1: establecer conexión a base de datos
			Connection miConexion = DriverManager.getConnection(url, user, pass);
			//Paso 2: crear objeto statement
			Statement miSt = miConexion.createStatement();
			
			//miSt.executeUpdate(sql1);
			
			miSt.executeUpdate(sql2);
			
			//miSt.executeUpdate(sql3);
			
		}catch(SQLIntegrityConstraintViolationException e) {
			System.out.println("Código duplicado");

		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
