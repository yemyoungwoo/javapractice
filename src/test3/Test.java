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