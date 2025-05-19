<<<<<<< HEAD
// 0305 #2
// find grade, 3 subject (c,java,python)
// loop 3 person
package test2;

public class Test {

	public static void main(String[] args) {
		int c, java, python; //local var. field member var.
		int tot,ave;
		String grade;
		
		System.out.println("c java python tot grade");
		System.out.println("-----------------------");
		for(int i=0; i<3; i++) {
 
			c = (int)(Math.random()*101);
			java = (int)(Math.random()*101);
			python = (int)(Math.random()*101);
			
			tot = c + java + python;
			ave = tot / 3;
			if (ave >=95) grade = "A+";
			else if (ave >=90) grade = "A0";
			else grade="C+";
			
			System.out.printf("%3d %3d %3d %3d %3s",c,java,python,tot,grade);
			System.out.println("\n-------------------");
		}
	}
}
=======
//0312 #2
// 4칙연산 class
// 전역변수(필드) 생성자(객체 초기화) 붕어빵틀(class)  붕어빵(객체)
// 메소드s
package test2;

public class Test {
	//dcl field
	private int x; //access modifiler 접근제어자 자바 정보보안 정보은닉
	private int y;
	private int z;
	
	//constructor
	public Test() {
		x = (int)(Math.random()*100); //0~99
		y = (int)(Math.random()*100); //0~99
	}
	//methods member function, 메소드 오버라이딩
	public void add() {
		//int z=x+y;
		//System.out.printf("%d+%d=%d\n",x,y,z); // instance x+y
		z = x+y;
	}
	
	public void subtract() {
		//int z=x-y;
		//System.out.printf("%d-%d=%d\n",x,y,z);
		z = x-y;
	}
	
	public void multiply() {
		//int z=x*y;
		//System.out.printf("%d*%d=%d\n",x,y,z);
		z = x*y;
	}
	
	public void divide() {
		//int z=x/y;
		//System.out.printf("%d/%d=%d\n",x,y,z);
		if (y== 0) { // 4/0 divide by zero sw error interrupt os
			System.out.println("divide by zero error");
			y =1;
		}
		z= x/y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public void result(String op) {
		System.out.printf("%d%s%d=%d\n",x,op,y,z);
	}
	public static void main(String[] args) {
		//int x, y; //local var.
		// 생성자 호출
		Test test = new Test();
		//붕어빵틀 붕어빵 = new 븅어빵틀()
	
		test.add(); //call 메소드 //add(x,y,z) 메소드 오버로딩
		test.result("+");
		//System.out.printf("%d+%d=%d\n",test.getX(),test.getY(),z); // why
		
		test.subtract();
		test.result("-");
		//System.out.printf("%d-%d=%d\n",x,y,z);
		
		test.multiply();
		test.result("*");
		//System.out.printf("%d*%d=%d\n",x,y,z);
		
		test.divide();//매개변수
		test.result("/");
		//System.out.printf("%d/%d=%d\n",x,y,z);
	}
}
>>>>>>> 53be65a (4칙 연산)
