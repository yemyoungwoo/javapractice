package test3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MainController t = new MainController();
		int m = t.getN();
		while (true) {
			System.out.println("1. 국어   2.국어출력    0.exit");
			int menu = sc.nextInt();

			if (menu == 1) {
				for (int i = 0; i < m; i++) {
					t.test();
					t.check(i);
				}
			} else if (menu == 2) {
				t.result();
			} else if (menu == 0) {
				System.out.println("종료");
//				System.exit(0);
				break;
			}
		}
	}
}