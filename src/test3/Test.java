// Test:main  Score:sub class
// score mid fin rpt att
// 1 person, 1 subject
package test3;

public class Test extends Score{
	//String grade;
	//확장성 고민, 크기 함수...update
	int rank;
	public Test() {}
	//생성자 ..
	//메소드 re define 
	public void score_compute_grade() {//char* grade;
		if (tot>=95) grade="A+"; //strcpy("grade,"A+")
		else if (tot>=90) grade="A0";
		else grade="B+";	
	}
	public void score_compute_rank() {}
	public static void main(String[] args) {
		
		Test t = new Test();
		//Score sc;
		//sc = new Score();
		t.score_input();
		t.score_compute_tot();
		t.score_compute_ave();
		//t.score_compute_grade(); redefine
		//t.score_compute_rank();
		t.score_output();
	}
}