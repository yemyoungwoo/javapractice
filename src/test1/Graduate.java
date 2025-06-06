package test1;

public class Graduate extends Student implements Grading {

	String credit;
	
	public String setCredit(int score) {
		if (score >= 80)
			credit = "PASS";
		else
			credit = "NonPASS";
		return credit;
	}
}
