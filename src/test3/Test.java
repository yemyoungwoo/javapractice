// 0402 #3
// 5개과목 점수 평균, 학점
package test3;

import java.util.ArrayList;

public class Test {
	public static int getAve(ArrayList<Integer> scores) {
		int sum=0;
		for(int score :scores)
			sum += score;
		return sum/scores.size();
	}
	
	public static String getGrade(int ave) {
		if (ave >= 90) return "A";
		else if (ave >= 80) return "B";
		else if (ave >= 70) return "C";
		else if (ave >= 60) return "D";
		else return "F";
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> scores = new ArrayList<>();
		//input
		for(int i=0; i<5; i++) {
			scores.add((int)(Math.random()*41+60));
			//echo print
			//System.out.print(scores.get(i)+" ");
		}
		//to find ave, grade
		int ave = getAve(scores);
		String grade = getGrade(ave);
		
		//output
		System.out.println("scores : " + scores);
		System.out.println("ave : " + ave);
		System.out.println("grade : " + grade);

	}

}
