package algoritimosOdenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayFunction  {

	private List<Integer> arrayAux;
	private List<Integer> arrayPrincipal;
	
	public ArrayFunction(int tamanho) {
		arrayPrincipal = new ArrayList<Integer>();
		for (int i = 1; i <= tamanho; i++) {
			this.arrayPrincipal.add(i);
		}
	}

	public List<Integer> ordenadoArray() {
		return arrayPrincipal;
	}

	public List<Integer> insersarArray(List<Integer> array) {
		Collections.reverse(array);
		return array;
	}

	public List<Integer> quaseOrdenadoArray(List<Integer> array) {
		
		 arrayAux = new ArrayList<Integer>();
		 
		 int x = array.size()/2; 
		 
		 for(int i= 0;i<x;i++) {
			 arrayAux.add(array.get(i));
			
		 }
		 
	    for(int i= array.size();i>x;i--) {
			 arrayAux.add(array.get(i-1));
		 }
		return arrayAux;
	}

	public List<Integer> aleatorioArray(List<Integer> array) {
		Collections.shuffle(array);
		return array;
	}

	public static void main(String[] args) {
		ArrayFunction array = new ArrayFunction(1000);
		array.insersarArray(array.ordenadoArray()).forEach(e->System.out.println(e));

	}

}
