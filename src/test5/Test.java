// 0305 #5 menu-driven 
// find grade, 3 subject (c,java,python)
// loop 3 person
// multi class -> inheritance -> interface
package test5;
import java.util.Scanner;

public class Test {
    //#1 Test 사무실, Grades 공장 하청
	//#2 상속 :  자기브랜드(method overriding)
	public Test() {} //default constructor	
	public static void main(String[] args) {
		//mudule 구조적 프로그래밍 share source code
		Scanner s = new Scanner(System.in);
		Grades grade = new Grades();
		while(true) {
			System.out.println("--------------");
			System.out.println(" 1: find grade");
			System.out.println(" 0: exit      ");
			System.out.println("--------------");
			System.out.print(" menu select : ");
			int menu = s.nextInt();
			if (menu == 0) {
				System.out.println("program end");
				System.exit(0);
			} else if (menu == 1) {
				System.out.println("c java python tot grade");
				System.out.println("-----------------------");
				for(int i=0; i<3; i++) {
					grade.grade_input();
					grade.grade_compute();
					grade.grade_output();
				} //for
			} //if	
		} //while
	} //main
} // class