<<<<<<< HEAD
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

=======
//0312 #1
// 4칙연산
// code reuse : debug, error free, readable -> module 메소드화, 확장성
package test1;

public class Test {
	public static int add(int x, int y) {
		//int z=x+y;
		//System.out.printf("%d+%d=%d\n",x,y,z); // instance x+y
		return x+y;
	}
	
	public static int subtract(int x, int y) {
		//int z=x-y;0
		//System.out.printf("%d-%d=%d\n",x,y,z);
		return x-y;
	}
	
	public static int multiply(int x, int y) {
		//int z=x*y;
		//System.out.printf("%d*%d=%d\n",x,y,z);
		return x*y;
	}
	
	public static int divide(int x, int y) {
		//int z=x/y;
		//System.out.printf("%d/%d=%d\n",x,y,z);
		if (y== 0) { // 4/0 divide by zero sw error interrupt os
			System.out.println("divide by zero error");
			y =1;
		}
		return x/y;
	}
	
	public static void main(String[] args) {
		int x, y; //local var.
		
		x = (int)(Math.random()*100); //0~99
		y = (int)(Math.random()*100); //0~99
	
		int z=add(x,y); //call 메소드 //add(x,y,z) 메소드 오버로딩
		System.out.printf("%d+%d=%d\n",x,y,z);
		
		z=subtract(x,y);
		System.out.printf("%d-%d=%d\n",x,y,z);
		
		z=multiply(x,y);
		System.out.printf("%d*%d=%d\n",x,y,z);
		
		z=divide(x,y);//매개변수
		System.out.printf("%d/%d=%d\n",x,y,z);
	}
>>>>>>> 53be65a (4칙 연산)
}
