<<<<<<< HEAD
// 0305 #3
// find grade, 3 subject (c,java,python)
// loop 3 person
package test3;

public class Test {
	// global ver. field. member var./member function(method)
	int c, java, python; //local var. field member var.
	int tot,ave;
	String grade;
	
	public Test() {} //default constructor
	
	public void grade_input() {
		//input value assign
		c = (int)(Math.random()*101);
		java = (int)(Math.random()*101);
		python = (int)(Math.random()*101);
	}
	public void grade_compute() {
		//computation
		tot = c + java + python;
		ave = tot / 3;
		if (ave >=95) grade = "A+";
		else if (ave >=90) grade = "A0";
		else grade="C+";
	}
	public void grade_output() {
		//output
		System.out.printf("%3d %3d %3d %3d %3s",c,java,python,tot,grade);
		System.out.println("\n-------------------");
	}
	public static void main(String[] args) {
		//mudule 구조적 프로그래밍 share source code
		Test test = new Test();
		System.out.println("c java python tot grade");
		System.out.println("-----------------------");
		for(int i=0; i<3; i++) {
			test.grade_input();
			test.grade_compute();
			test.grade_output();
		}
	}
}
=======
//0312 #3
// 4칙연산 class
// 전역변수(필드) 생성자(객체 초기화) 붕어빵틀(class)  붕어빵(객체)
// 메소드s -> multi class
package test3;

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
	
	public void result(String op) {
		System.out.printf("%d%s%d=%d\n",x,op,y,z);
	}
	public static void main(String[] args) {
		//int x, y; //local var.
		// 생성자 호출
		Test test = new Test();
		//붕어빵틀 붕어빵 = new 븅어빵틀()
	
		//김밥 옆집 공장
		Add a = new Add();
		a.add(); //call 메소드 //add(x,y,z) 메소드 오버로딩
		a.result("+");
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
