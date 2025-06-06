package test4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Exam e = new Exam();
		int m = e.getN();
		e.ans_sheet();
		while (true) {
			System.out.println("1. 성적처리   2.성적출력    0.exit");
			int menu = sc.nextInt();

			if (menu == 1) {
				for (int i = 0; i < m; i++) {
					e.kor_test();
					e.kor_check(i);
//					e.eng_test();
//					e.eng_check(i);
//					e.mat_test();
//					e.mat_check(i);
				}
			} else if (menu == 2) {
				e.result();
			} else if (menu == 0) {
				System.out.println("종료");
//				System.exit(0);
				break;
			}
		}
	}
}