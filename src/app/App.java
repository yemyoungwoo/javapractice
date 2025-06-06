package app;

import java.util.Scanner;

import controller.Controller;

public class App {
	public App() {}
	
	public void run() {
		System.out.println("프로그램 시작");
		
		Scanner sc = new Scanner(System.in);
		Controller controller = new Controller(sc);
		
		while(true) {
			System.out.println("1 : 재학생");
			System.out.println("2 : 졸업생");
			System.out.println("3 : 리스트");
			System.out.println("0 : 종료");
			System.out.print("명령어 ) ");
			String cmd = sc.nextLine().trim();
			
			if(cmd.length() == 0) {
				System.out.println("명령어를 입력");
				continue;
			}
			if(cmd.equals("0")) {
				System.out.println("종료");
				break;
			}
			controller.doAction(cmd, cmd);
		}
		System.out.println("프로그램 끝");
		sc.close();
	}
}
