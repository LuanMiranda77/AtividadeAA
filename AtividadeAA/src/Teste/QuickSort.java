package Teste;

import java.util.List;

public class QuickSort {
	public static int partition(List<Integer> arr, int beg, int end) {

		int left, right, temp, loc, flag;
		loc = left = beg;
		right = end;
		flag = 0;
		while (flag != 1) {
			while ((arr.get(loc) <= arr.get(right)) && (loc != right))
				right--;
			if (loc == right)
				flag = 1;
			else if (arr.get(loc) > arr.get(right)) {
				temp = arr.get(loc);
				arr.set(loc, arr.get(right));
				arr.set(right, temp);
				loc = right;
			}
			if (flag != 1) {
				while ((arr.get(loc) >= arr.get(left)) && (loc != left))
					left++;
				if (loc == left)
					flag = 1;
				else if (arr.get(loc) < arr.get(left)) {
					temp = arr.get(loc);
					arr.set(loc, arr.get(left));
					arr.set(left, temp);
					loc = left;
				}
			}
		}
		return loc;
	}

	static void execute(List<Integer> arr, int beg, int end) {

		int loc;
		if (beg < end) {
			loc = partition(arr, beg, end);
			execute(arr, beg, loc - 1);
			execute(arr, loc + 1, end);
		}
	}
	public static void main(String args[]) {
		ArrayFunction function = new ArrayFunction(10);
		List<Integer> lista = function.aleatorioArray(function.ordenadoArray());

		System.out.println("Lista Antes do Insertion Sort");
		// lista.forEach(e->System.out.println(e + " "));

		System.out.println("\n");

		execute(lista,0,lista.size()-1);

		System.out.println("List Depois Insertion SortAAA");
		lista.forEach(e -> System.out.println(e + " "));
	}

}
