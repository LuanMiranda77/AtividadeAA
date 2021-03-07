package Teste;

import java.util.List;

public class BubbleSort {
	static void execute(List<Integer> arr) {
		int n = arr.size();
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr.get(j - 1) > arr.get(j)) {
					temp = arr.get(j - 1);
					arr.set(j-1, arr.get(j));
					arr.set(j, temp);
				}

			}
		}
	}
	public static void main(String a[]) {
		ArrayFunction function = new ArrayFunction(10);
		List<Integer> lista = function.aleatorioArray(function.ordenadoArray());

		System.out.println("Lista Antes do Insertion Sort");
		// lista.forEach(e->System.out.println(e + " "));

		System.out.println("\n");

		execute(lista);

		System.out.println("List Depois Insertion Sort");
		lista.forEach(e -> System.out.println(e + " "));
	}

}
