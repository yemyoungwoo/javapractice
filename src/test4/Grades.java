//0305 #4
//Grades.java
package test4;

public class Grades {
		// global ver. field. member var./member function(method)
		int c, java, python; //local var. field member var.
		int tot,ave;
		String grade;
	
		 public int getScore() { //property
			 return (int)(Math.random()*101);
		 }
		 
		 public void grade_input() {
			//input value assign
			c = getScore();
			java = getScore();
			python = getScore();
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
			/*System.out.println("c = " + c);
			System.out.println("java = " + java);
			System.out.println("python = " + python);
			System.out.println("tot = " + tot);
			System.out.println("grade = " + grade);*/
			System.out.printf("%3d %3d %3d %3d %3s",c,java,python,tot,grade);
			System.out.println("\n-------------------");
		 }
}
