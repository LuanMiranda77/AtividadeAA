package algoritimosOdenacao;

public class PrimoInterativo {

	private boolean numero(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return num == 1 ? false : true;
	}

	public static void main(String[] args) {
		System.out.println(new PrimoInterativo().numero(9));
	}
}
