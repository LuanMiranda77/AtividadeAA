package Teste;

import java.util.List;

public class SelectionSort {

	public static void execute(List<Integer> lista) {
		for (int i = 0; i < lista.size()-1; i++) {
			int index = i;
			for (int j = i + 1; j < lista.size(); j++) {
				if (lista.get(j) < lista.get(index)) {
					index = j;
				}
			}
			int menor = lista.get(index);
			lista.set(index, lista.get(i));
			lista.set(i, menor);

		}
	}
	
	//Complexidade de tempo
	//Melhor :? (N ^ 2)
	//Média :? (N ^ 2)
	//Pior: O (n ^ 2)
	//Complexidade do Espaço
	//O (1)

	public static void main(String a[]) {
		ArrayFunction function = new ArrayFunction(100000);
		List<Integer> lista = function.aleatorioArray(function.ordenadoArray());

		System.out.println("Lista Antes do Insertion Sort");
		// lista.forEach(e->System.out.println(e + " "));

		System.out.println("\n");

		execute(lista);

		System.out.println("List Depois Insertion Sort");
		lista.forEach(e -> System.out.println(e + " "));
	}

}
