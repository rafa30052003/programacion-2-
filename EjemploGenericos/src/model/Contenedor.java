package model;

public class Contenedor <T>{
	
	private T obj;
	
	public Contenedor() {
	obj=null;
	}
	
	public T getObj() {
		T objDevuelto=this.obj;
		this.obj=null; //el contenedor vuelve a estar vacio
		return objDevuelto;
	}
	public void setObj(T obj) {
	this.obj = obj;
	}
 	
}

