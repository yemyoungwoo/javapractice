//0402 #4
package test4;

import java.util.ArrayList;

public class Grade {
	
	ArrayList<Integer> scores;
	// ArrayList<Grade> g = new ArrayList<Grade>();
	// mid  fin rpt att
	// kor eng mat
	public Grade() {
		scores = new ArrayList<>();
	}
	/*
	public Grade(필드.... 
	  
	 */
	
	//새로만들어야 ..
	public void addScore() {
		for(int i=0; i<5; i++) 
			scores.add((int)(Math.random()*41+60));
	}
	
	public int getAve() {
		int sum=0;
		for(int score :scores)
			sum += score;
		return sum/scores.size();
	}
	
	public String getGrade() {
		int ave = getAve();
		if (ave >= 90) return "A";
		else if (ave >= 80) return "B";
		else if (ave >= 70) return "C";
		else if (ave >= 60) return "D";
		else return "F";
	}
	
	//to find ave, grade
	//int ave = getAve(scores); X
	//String grade = getGrade(ave); XX 
	
	public void showResult() {
		System.out.println("scores : " + scores); 
		System.out.println("ave : " + getAve());
		System.out.println("grade : " + getGrade());
	}
}
