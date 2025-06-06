package test4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam {

	ArrayList<Integer> kor_ans = new ArrayList<Integer>();
	ArrayList<Integer> stu_ans = new ArrayList<Integer>();
	ArrayList<Integer> kor_score = new ArrayList<Integer>();

	public Exam() {
	}

	public void ans_sheet() {
		for (int i = 0; i < 10; i++) {
			kor_ans.add((int) (Math.random() * 4 + 1));
		}
	}

	public int getN() {
		Scanner s = new Scanner(System.in);
		System.out.print("stduent no : ");
		int n = s.nextInt();
		return n;
	}

	public void kor_test() {
		stu_ans.clear();
		for (int j = 0; j < 10; j++) {
			stu_ans.add((int) (Math.random() * 4 + 1));
		}
	}

	public void kor_check(int i) {
		int o = 0;
		for (int j = 0; j < 10; j++) {
			if (kor_ans.get(j) == stu_ans.get(j)) {
				o++;
				System.out.print("O ");
			} else {
				System.out.print("X ");
			}
		}
		System.out.println(" " + (o * 10));
		kor_score.add(o * 10);
	}

	public void result() {
		System.out.println("no kor eng mat tot ave grades");
		System.out.println("------------------------------");
		int m = kor_score.size();
		for (int i = 0; i < m; i++) {
			System.out.printf("%3d %3d\n", i, kor_score.get(i));
		}
	}
}
