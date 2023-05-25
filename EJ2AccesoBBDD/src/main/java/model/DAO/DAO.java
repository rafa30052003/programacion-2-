package model.DAO;

import java.sql.SQLException;
import java.util.List;

import model.domain.Autor;
import model.domain.Libro;

public interface DAO<T> extends AutoCloseable {
	
	List<T>findAll()throws SQLException;
	
	T finfById(String id)throws SQLException;
	
	T save (T entity)throws SQLException;
	
	void delete(T entity)throws SQLException;
	
}
