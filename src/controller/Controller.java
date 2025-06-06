package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.Article;
import service.Grading;
import service.Undergraduate;
import service.Graduate;

public class Controller {
	private Scanner sc;
	private String cmd;
	private String action;
	private List<Article> articles;

	public Controller(Scanner sc) {
		this.sc = sc;

		articles = new ArrayList<>();
	}

	public void doAction(String cmd, String action) {
		this.cmd = cmd;
		this.action = action;

		switch (action) {
		case "1":
			Undergraduate();
			break;

		case "2":
			Graduate();
			break;

		case "3":
			List();
			break;

		default:
			System.out.println("존재하지 않는 명령어입니다");
			break;
		}
	}

	private void Undergraduate() {

		Grading grading = new Undergraduate();

		System.out.printf("이름 : ");
		String name = sc.nextLine();

		int score = (int) (Math.random() * 101);
		String result = grading.Score(score);

		Article article = new Article(name, score, result, "재학생");
		articles.add(article);

		System.out.print("확인완료 결과를 보고 싶으시면 3번을 눌러주세요\n");
	}

	private void Graduate() {

		Grading grading = new Graduate();

		System.out.printf("이름 : ");
		String name = sc.nextLine();

		int score = (int) (Math.random() * 101);
		String result = grading.Score(score);

		Article article = new Article(name, score, result, "졸업생");
		articles.add(article);

		System.out.print("확인완료 결과를 보고 싶으시면 3번을 눌러주세요\n");
	}

	private void List() {
		if (articles.size() == 0) {
			System.out.println("학생이 없습니다");
		}
		System.out.println("===== 학생 리스트 =====");
		for (Article article : articles) {
			System.out.printf("%s : 이름 : %s | 점수 : %d | 결과 : %s\n", article.category, article.name, article.score,
					article.result);
		}
	}
}