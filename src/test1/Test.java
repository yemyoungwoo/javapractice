// 0305 #1
// var property attribute member data
package test1;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.printf("x=%d y=%d\n", x,y); //ALU
		
		y =(int)(Math.random()*100);
		System.out.printf("x=%d y=%d\n", x,y);
		
		Scanner s = new Scanner(System.in);
		System.out.print("x : ");
		x = s.nextInt();
		System.out.print("y : ");
		y = s.nextInt();
		System.out.printf("x=%d y=%d\n", x,y);
		
	}

}
