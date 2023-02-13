package list.model;

public class List <T>{
	Node root;
	
	 public void push (T data) {
		 if(data!=null) {
			 Node newNode = new Node<T>(data);
			 if(root==null) {
				 //lista vacia
				 root=newNode;
				 
			 }else {
				 Node aux = root;
				 while (aux.getNext()!=null) {
					aux=aux.getNext();
				}
				 aux.setNext(newNode);
			 }
		 }
	 }
	 
	 public int size() {
		 int result=0;
		 Node aux=root;
		 while (aux!=null) {
			aux=aux.getNext();
			result++;
		}
		 return result;
	 }
	 
	 
	 
	 
	public T get (int index) {
			T result = null;
			if(index >=0 && index < size()) {
				Node<T> aux  = root;
				while (index>0){
					aux=aux.getNext();
					index--;
				}
				result = aux.getData();
			}
			return result;
			
		}
	
	
	
	
	public void remove (int index) {
		if(index >=0 && index < size()) {
			if(index==0) {
				if(root!=null) {
					root=root.getNext();
				}
			}else {
				Node<T> aux  = root;
				Node<T> prev = root;
				while (index>0) {
					prev= aux;
					aux = aux.getNext();
					index--;
				}
				prev.setNext(aux.getNext());
			}
			
		}
	}
	
	
	
	public String toString() {
		String result= "";
		Node aux= root;
		while(aux!=null) {
			result+=aux+"-> ";
			aux=aux.getNext();
		}
		
		return result;
	}
	
	
}
