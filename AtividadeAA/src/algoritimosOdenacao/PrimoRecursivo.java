package algoritimosOdenacao;

public class PrimoRecursivo {

	boolean testar(int var) {
		return test(var, var - 1);
	}

	private boolean test(int var, int var2) {
		return var2 == 1 ? true : var % var2 == 0 ? false : test(var, var2 - 1);
	}

	public static void main(String[] args) {
		System.out.println(new PrimoRecursivo().testar(9));
	}
}
