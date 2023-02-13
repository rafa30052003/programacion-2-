package model.dataObect;

public class Revista extends Elemento{
	private int nEdicion;
	
	/*
	 * CONSTRUCTORES
	 */
	public Revista(int cod, String titulo, int nEdicion) {
		super(cod, titulo);
		
		this.nEdicion = nEdicion;
		
	}

	public Revista() {
		super();
		nEdicion=-1;
		
	}
	
	/*
	 * GETTER/SETTER
	 */
	public int getnEdicion() {
		return nEdicion;
	}

	public void setnEdicion(int nEdicion) {
		this.nEdicion = nEdicion;
	}
	
	

	
	
	@Override
	public void setTitulo(String titulo) {
		super.setTitulo( "de la revista:"+titulo);
	}
	
	
	
	/*
	 * TO STRING
	 */
	@Override
	public String toString() {
		return 	"\n REVISTA :"+
				"\n Codigo de la Revista: "+super.getCod()+
				"\n Titulo de la Revista: "+super.getTitulo()+
				
				"\n Numero de Edicion: " + nEdicion;
	}

	

	
	
	
}
