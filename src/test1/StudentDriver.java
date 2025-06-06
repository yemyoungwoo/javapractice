package test1;
import java.util.Scanner;

public class StudentDriver {
	Student[] student;
	int count;
	Graduate graduate;
	Undergraduate undergraduate;
	Scanner s = new Scanner(System.in);
	
	public StudentDriver() {
		student = new Student[20];
		count = 0;
		graduate = new Graduate();
		undergraduate = new Undergraduate();
	}
	
	public void run() {

		int menu;
		
		for(;;) {
			System.out.println();
			System.out.println("---------------");
			System.out.println(" 1: undergraduate");
			System.out.println(" 2: graduate");
			System.out.println(" 3: display");
			System.out.println(" 0: exit");
			System.out.println("---------------");
			System.out.print("you choice : ");
			menu = s.nextInt();
			
			if (menu == 1) insert(undergraduate);
			else if (menu == 2) insert(graduate);
			else if (menu == 3) display();
			else if (menu == 0) break;
		}
	}
	
	public void insert(Grading grading) {
		if (count >= 20) System.out.println("<20");
		else if (count < 20) {
			student[count] = new Student();
			System.out.print("name : ");
			String name = s.next();
			student[count].name = name;
			System.out.print("score : ");
			int score = (int)(Math.random()*101);
			student[count].score = score;
			student[count].credit = grading.setCredit(score);
			count++;	
		}
	}
	
	public void display() {
		if (count <= 0) System.out.println("no list");
		else {
			System.out.println();
			System.out.println("name score   pass");
			System.out.println("------------------");
			for (int i=0; i<count; i++) {
				System.out.printf("%-5s %3d %7s\n",
				student[i].name,student[i].score, student[i].credit);
			}		
			System.out.println("------------------");
			//System.out.println();
		}
	}
}
