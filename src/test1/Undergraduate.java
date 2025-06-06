package test1;

public class Undergraduate  extends Student implements Grading {

	String credit;
	
	public String setCredit(int score) {
		if (score >= 70)
			credit = "PASS";
		else
			credit = "NonPASS";
		return credit;
	}
}
