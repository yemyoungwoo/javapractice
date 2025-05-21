// 0402 #5
// menu driven
package test5;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Grade g = new Grade();
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("-----------------");
			System.out.println(" 1: add          ");
			System.out.println(" 2: delete       ");
			System.out.println(" 3: display      ");
			System.out.println("-----------------");
			System.out.print("menu : ");
			int menu = s.nextInt();
			if (menu ==1) g.addScore();
			else if (menu ==2) g.delScore(); //insert
			else if (menu ==3) g.showResult();
			else if (menu ==0) break;
		}
	}//main
} //class