package algoritimosOdenacao;

import java.util.List;

public class InsertionSort {

	public static void execute(List<Integer> array) {
		int n = array.size();
		for (int j = 1; j < n; j++) {
			int key = array.get(j);
			int i = j - 1;
			while ((i > -1) && (array.get(i) > key)) {
				array.set(i+1,array.get(i));
				i--;
			}
			array.set(i+1,key);
		}
	}

	public static void main(String a[]) {
		ArrayFunction function = new ArrayFunction(1000000);
		List<Integer>lista =function.quaseOrdenadoArray(function.ordenadoArray());
	
		System.out.println("Lista Antes do Insertion Sort");
		//lista.forEach(e->System.out.println(e + " "));
		
		System.out.println("\n");
		
		execute(lista);

		System.out.println("List Depois Insertion Sort");
		lista.forEach(e->System.out.println(e + " "));
	}
}
