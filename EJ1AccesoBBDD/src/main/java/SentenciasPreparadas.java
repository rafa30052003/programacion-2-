import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SentenciasPreparadas {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/BDArticulos";
		String user = "root";
		String pass = "";
		
		String sql1 = "UPDATE articulos SET categoria = ?, pais_fabricacion = ?";
		String sql2 = "SELECT * FROM articulos WHERE categoria = ? AND pais_fabricacion = ?";
		String cat = "calzado";
		String pais = "Francia";
		
		try {
			//Paso 1: establecer conexión a base de datos
			Connection miConexion = DriverManager.getConnection(url, user, pass);
		
			//Paso 2: obtener el preparedStatement y asignar valores a los parametros
			//PreparedStatement miPSt = miConexion.prepareStatement(sql1);
			//miPSt.setString(1, cat);
			//miPSt.setString(2, pais);
			
			//Paso 3: Ejecutando la sentencia montada en el paso 2m
			//miPSt.executeUpdate();
			
			
			//Mostrar los articulos por pais y por categoria
			
			PreparedStatement miPSt2 = miConexion.prepareStatement(sql2);
			miPSt2.setString(1, cat);
			miPSt2.setString(2, pais);
			
			ResultSet miRs = miPSt2.executeQuery();
			
			while (miRs.next()) {
				System.out.println(miRs.getInt("codigo")+" "+miRs.getString("descripcion")+" "+ miRs.getDouble("precio")+" "+miRs.getString("categoria")
				+" "+miRs.getString("pais_fabricacion"));
				
			}
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
