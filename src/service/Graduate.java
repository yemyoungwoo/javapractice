package service;

public class Graduate implements Grading {
	public String Score(int score) {
		if (score >= 80) {
			return "합격";
		} else {
			return "불합격";
		}
	}
}