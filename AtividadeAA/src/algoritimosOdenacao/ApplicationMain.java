package algoritimosOdenacao;

import java.util.List;

public class ApplicationMain {
	

	public static void main(String a[]) {
		ArrayFunction function = new ArrayFunction(100000);
		List<Integer> lista = function.aleatorioArray(function.ordenadoArray());

		System.out.println("Lista Antes do Sort");
		// lista.forEach(e->System.out.println(e + " "));

		System.out.println("\n");

		BubbleSort.execute(lista);
		
		InsertionSort.execute(lista);
		
		MergeSort.execute(lista,0,lista.size()-1);
		
		QuickSort.execute(lista,0,lista.size()-1);
		
		SelectionSort.execute(lista);

		System.out.println("List Depois Sort");
		lista.forEach(e -> System.out.println(e + " "));
	}

}
