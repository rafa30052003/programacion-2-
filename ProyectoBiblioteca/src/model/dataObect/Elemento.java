package model.dataObect;

import java.util.Objects;

public class Elemento {
	
	protected  int cod;
	protected String titulo;
	
	
	
	/*
	 * CONSTRUCTORES
	*/
	
	public Elemento(int cod, String titulo) {
		
		this.cod = cod;
		this.titulo = titulo;
	}
	
	
	
	
	
	public Elemento() {
		this.cod = -1;
		this.titulo = " ";
	}

	
		

	

	/*
	 * GETTERS/SETTERS
	 */
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	public int getCod() {
		return cod;
	}

    public void setCod(int cod) {
		this.cod = cod;
	}

  //METODO EQUALS

   

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Elemento other = (Elemento) obj;
		return Objects.equals(cod, other.cod);
	}



	/*
	 * TO STRING
	 */
	@Override
	public String toString() {
		return "\n Codigo: "+ cod
				+"\n Titulo: "+ titulo;
			    
	}












	




	
	
	
}
