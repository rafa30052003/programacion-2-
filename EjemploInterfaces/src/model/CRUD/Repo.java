package model.CRUD;

import interfaces.iRepo;
import model.DTO.Bebida;

public class Repo implements iRepo {
	private Bebida [] mibebida = new Bebida [10];
	
	@Override
	public boolean anadirBebida(Bebida b) {
		boolean result= false;
		if(b!=null && isfull()) {
			for (int i = 0; i < mibebida.length && !result; i++) {
				if(mibebida[i]==null) {
					mibebida[i]= b;
					result= true;
				}
			}
		}
		return result;
	}

	@Override
	public String mostrarBebida() {
		String result=" --------------\\n";
		for (Bebida b: mibebida) {
			if(b!= null) {
				result+=b+"\n";
			}
			result+="--------------\n";
		}
		return result;
	}
	 
	
	private boolean isfull() {
		boolean result = false ;
		for (int i = 0; i < mibebida.length && !result; i++) {
			if(mibebida[i]==null) {
				result= true;
			}
		}
		return result;
	}
	
	
	private boolean estaBebida(Bebida c) {
		boolean result = false ;
		for(Bebida b : mibebida) {
			if(b!=null && b.equals(c)){
				result= true; break;
			}
		}
		return result;
	}
}

