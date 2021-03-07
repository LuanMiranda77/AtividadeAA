package algoritimosOdenacao;

import java.util.List;

public class MergeSort {
	private static void merge(List<Integer> arr, int beg, int mid, int end) {

		int l = mid - beg + 1;
		int r = end - mid;

		int leftArray[] = new int[l];
		int rightArray[] = new int[r];

		for (int i = 0; i < l; ++i) {
			leftArray[i] =  arr.get(beg+i);
		}
		for (int j = 0; j < r; ++j) {
			rightArray[j] = arr.get(mid+1+j);
		}

		int i = 0, j = 0;
		int k = beg;
		while (i < l && j < r) {
			if (leftArray[i] <= rightArray[j]) {
				//arr[k] = leftArray[i];
				arr.set(k,leftArray[i]);
				i++;
			} else {
				//arr[k] = rightArray[j];
				arr.set(k,rightArray[j]);
				j++;
			}
			k++;
		}
		while (i < l) {
			//arr[k] = leftArray[i];
			arr.set(k,leftArray[i]);
			
			i++;
			k++;
		}

		while (j < r) {
			//arr[k] = rightArray[j];
			arr.set(k,rightArray[j]);
			j++;
			k++;
		}
	}

	static void execute(List<Integer> arr, int beg, int end) {
		if (beg < end) {
			int mid = (beg + end) / 2;
			execute(arr, beg, mid);
			execute(arr, mid + 1, end);
			merge(arr, beg, mid, end);
		}
	}

	public static void main(String args[]) {
		ArrayFunction function = new ArrayFunction(100);
		List<Integer> lista = function.aleatorioArray(function.ordenadoArray());

		System.out.println("Lista Antes do Insertion Sort");
		// lista.forEach(e->System.out.println(e + " "));

		System.out.println("\n");

		execute(lista,0,lista.size()-1);

		System.out.println("List Depois Insertion SortAAA");
		lista.forEach(e -> System.out.println(e + " "));
	}
}
