// 0305 #4
// find grade, 3 subject (c,java,python)
// loop 3 person
// multi class -> inheritance -> interface
package test4;

public class Test {
    //#1 Test 사무실, Grades 공장 하청
	//#2 상속 :  자기브랜드(method overriding)
	public Test() {} //default constructor	
	public static void main(String[] args) {
		//mudule 구조적 프로그래밍 share source code
		Grades grade = new Grades();
		System.out.println("c java python tot grade");
		System.out.println("-----------------------");
		for(int i=0; i<3; i++) {
			grade.grade_input();
			grade.grade_compute();
			grade.grade_output();
		} //for
	}
}