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