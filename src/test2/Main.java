package test2;


public class Main {

	public static void main(String[] args) {
		MainController t = new MainController();
		int m = t.getN();

		for (int i = 0; i < m; i++) {
			t.test();
			t.check(i);
		}
	}
}
