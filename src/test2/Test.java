// Test:main  Score:sub class
// score mid fin rpt att
// 1 person, 1 subject
package test2;

public class Test {
	//String grade;
	//확장성 고민, 크기 함수...update
	public Test() {}
	
	public static void main(String[] args) {
		
		Score sc;
		sc = new Score();
		sc.score_input();
		sc.score_compute_tot();
		sc.score_compute_ave();
		//sc.score_compute_grade();
		sc.score_output();
	}
}