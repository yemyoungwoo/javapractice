package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private Scanner sc;
    private List<Article> articles;
    private int lastArticleId;

    public Controller(Scanner sc) {
        this.sc = sc;
        this.articles = new ArrayList<>();
        this.lastArticleId = 0;
    }

    public void run() {
        while (true) {
            System.out.printf("명령어) ");
            String cmd = sc.nextLine().trim();

            if (cmd.equals("exit")) {
                break;
            }

            if (cmd.length() == 0) {
                System.out.println("명령어를 입력해주세요");
                continue;
            }

            if (cmd.equals("write")) {
                doWrite();
            } else if (cmd.equals("list")) {
                doList();
            } else if (cmd.startsWith("detail ")) {
                doDetail(cmd);
            } else if (cmd.startsWith("modify ")) {
                doModify(cmd);
            } else if (cmd.startsWith("delete ")) {
                doDelete(cmd);
            } else {
                System.out.println("존재하지 않는 명령어입니다");
            }
        }
    }

    private void doWrite() {
        int id = ++lastArticleId;
        System.out.printf("제목 : ");
        String title = sc.nextLine();
        System.out.printf("내용 : ");
        String body = sc.nextLine();

        Article article = new Article(id, title, body);
        articles.add(article);

        System.out.printf("%d번 글이 생성되었습니다.\n", id);
    }

    private void doList() {
        if (articles.isEmpty()) {
            System.out.println("게시글이 없습니다");
            return;
        }

        System.out.println("번호    |    제목");
        for (int i = articles.size() - 1; i >= 0; i--) {
            Article article = articles.get(i);
            System.out.printf("%4d    |    %s\n", article.id, article.title);
        }
    }

    private void doDetail(String cmd) {
        String[] cmdBits = cmd.split(" ");
        if (cmdBits.length != 2) {
            System.out.println("잘못된 형식입니다. 사용법: detail 번호");
            return;
        }

        int id = parseId(cmdBits[1]);
        if (id == -1) return;

        Article article = findArticleById(id);
        if (article == null) {
            System.out.printf("%d번 게시물은 존재하지 않습니다.\n", id);
            return;
        }

        System.out.printf("번호 : %d\n", article.id);
        System.out.printf("제목 : %s\n", article.title);
        System.out.printf("내용 : %s\n", article.body);
    }

    private void doModify(String cmd) {
        String[] cmdBits = cmd.split(" ");
        if (cmdBits.length != 2) {
            System.out.println("사용법: modify 번호");
            return;
        }

        int id = parseId(cmdBits[1]);
        if (id == -1) return;

        Article article = findArticleById(id);
        if (article == null) {
            System.out.printf("%d번 게시물은 존재하지 않습니다.\n", id);
            return;
        }

        System.out.print("새 제목 : ");
        article.title = sc.nextLine();
        System.out.print("새 내용 : ");
        article.body = sc.nextLine();

        System.out.printf("%d번 게시물이 수정되었습니다.\n", id);
    }

    private void doDelete(String cmd) {
        String[] cmdBits = cmd.split(" ");
        if (cmdBits.length != 2) {
            System.out.println("사용법: delete 번호");
            return;
        }

        int id = parseId(cmdBits[1]);
        if (id == -1) return;

        int foundIndex = -1;
        for (int i = 0; i < articles.size(); i++) {
            if (articles.get(i).id == id) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex == -1) {
            System.out.printf("%d번 게시물은 존재하지 않습니다.\n", id);
            return;
        }

        articles.remove(foundIndex);
        System.out.printf("%d번 글을 삭제했습니다.\n", id);
    }

    private Article findArticleById(int id) {
        for (Article article : articles) {
            if (article.id == id) return article;
        }
        return null;
    }

    private int parseId(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("유효하지 않은 게시물 번호입니다.");
            return -1;
        }
    }
}