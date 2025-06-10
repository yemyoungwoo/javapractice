package test;

import java.util.Scanner;

public class App {
    public void run() {
        System.out.println("== 프로그램 시작 ==");
        System.out.println("1 : write, 2 : list, 3 : detail (번호), 4 : modify (번호), delete (번호) ");
        System.out.println("detail, modify, delete 할 때 번호 쓸 때 띄어쓰기 필수");
        Scanner sc = new Scanner(System.in);
        Controller controller = new Controller(sc);
        controller.run();
        sc.close();
        System.out.println("== 프로그램 끝 ==");
    }
}