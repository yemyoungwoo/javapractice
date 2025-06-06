package service;

public class Undergraduate implements Grading {
	public String Score(int score) {
		if (score >= 60) {
			return "합격";
		} else {
			return "불합격";
		}
	}
}