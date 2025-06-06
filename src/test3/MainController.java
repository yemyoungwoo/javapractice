package test3;

import java.util.Scanner;

public class MainController {
	int[] stu_ans = new int[10];
	int[] kor_ans = new int[] { 1, 2, 3, 4, 1, 2, 3, 4, 1, 2 };
	int[] kor_score;

	int n;

	public MainController() {
		Scanner s = new Scanner(System.in);
		System.out.print("stduent no : ");
		n = s.nextInt();
		kor_score = new int[n];
	}

	public int getN() {
		return n;
	}

	public void test() {
		for (int j = 0; j < 10; j++)
			stu_ans[j] = (int) (Math.random() * 4 + 1);

	}

	public void check(int i) {

		int o = 0;
		for (int j = 0; j < 10; j++) {
			if (kor_ans[j] == stu_ans[j]) {
				o++;
				System.out.print("O ");
			} else
				System.out.print("X ");
		}

		System.out.println(" " + (o * 10));
		kor_score[i] = 0 * 10;
	}

	public void result() {
		System.out.println("no kor eng mat tot ave grades");
		System.out.println("------------------------------");
		int m = getN();
		for (int i = 0; i < m; i++) {
			System.out.printf("%3d %3d\n", i, kor_score[i]);
		}
	}
}