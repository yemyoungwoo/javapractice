package dto;

public class Article {
	public String name;
	public int score;
	public String result;
	public String category;

	public Article(String name, int score, String result, String category) {
		this.name = name;
		this.score = score;
		this.result = result;
		this.category = category;
	}
}