package test2;

public class Score {
	
	int mid, fin, rpt, att; //DB
	int tot, ave;
	String grade;
	//final int mid_weight = 30;
	
	public int getScore(int w) {
		int score = (int)(Math.random()*(w+1));
		return score;
	}
	
	public void score_input() {
		//mid = getSCore(mid_weight);
		mid = (int)(Math.random()*31);
		fin = (int)(Math.random()*41);
		rpt = (int)(Math.random()*21);
		att = (int)(Math.random()*11);	
	}
	public void score_compute_tot() {
		//tot sum ave 필드선언? 
		//grade multi switch
		tot = mid + fin + rpt + att;
		//return tot;
	} //code reuse
	public void score_compute_ave() {
		//tot sum ave
		//grade multi switch
		ave = tot / 4;
		//return ave;
	}
	public void score_compute_grade() {//char* grade;
		if (tot>=95) grade="A+"; //strcpy("grade,"A+")
		else grade="F";	
	}
	public void score_output() {
		System.out.println("mid = " + mid);
		System.out.println("fin = " + fin);
		//...
	}
}
