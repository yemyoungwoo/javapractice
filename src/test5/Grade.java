//0402 #4
package test5;

import java.util.ArrayList;
import java.util.Scanner;

public class Grade {
	
	ArrayList<Integer> scores;
	public Grade() {
		scores = new ArrayList<>();
	}

	public void addScore() {
		Scanner s1 = new Scanner(System.in);
		while(true) {
			System.out.print("y or n : ");
			String yn = s1.next();
			if (yn.equals("y"))
				scores.add((int)(Math.random()*41+60));
			else if (yn.equals("n")){
				System.out.println("add end");
				break;
			}
		}
	}
	
	public void delScore() {
		Scanner s1 = new Scanner(System.in);
		System.out.print("delete score : ");
		int delete_id = s1.nextInt();
		boolean found = false;
		for(int i=0; i<scores.size(); i++) {
			if (delete_id == scores.get(i)) {
				found = true;
				System.out.println("deleted " + delete_id);
				scores.remove(i);
				break;
			}
		}
		if (found == false)
			System.out.println("not found " + delete_id);		
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
