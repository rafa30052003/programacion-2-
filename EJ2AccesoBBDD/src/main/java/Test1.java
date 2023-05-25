import java.sql.SQLException;

import model.DAO.AutorDAO;
import model.domain.Autor;

public class Test1 {

	public static void main(String[] args) {
		Autor a = new  Autor("12345678C", "J.R.R", "Tolkien Serrano");
		AutorDAO adao = new AutorDAO();
		try {
			adao.save(a);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
