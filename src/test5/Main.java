package test5;

import java.util.Scanner;

public class Main {
	static String grade;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Kor k = new Kor();
        Eng e = new Eng();
        Mat m = new Mat();

        System.out.print("학생 수 입력 : ");
        int n = sc.nextInt();

        while (true) {
            System.out.println("1성적처리   2성적출력    0종료");
            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();

            if (menu == 1) {
                k.scores.clear();
                e.scores.clear();
                m.scores.clear();

                for (int i = 0; i < n; i++) {
                    k.test();
                    k.check(i, "국어");

                    e.test();
                    e.check(i, "영어");

                    m.test();
                    m.check(i, "수학");
                    System.out.println("---------------------");
                }
                System.out.println("성적처리 완료");
            } else if (menu == 2) {
                System.out.println("no kor eng mat tot ave grade");
                System.out.println("------------------------------");
                for (int i = 0; i < n; i++) {
                    int kor = k.scores.get(i);
                    int eng = e.scores.get(i);
                    int mat = m.scores.get(i);
                    int tot = kor + eng + mat;
                    int ave = tot / 3;
                    if(ave > 95) {
                    	grade = "A+";
                    }
                    else if(ave > 85) {
                    	grade = "B+";
                    }
                    else if(ave > 75) {
                    	grade = "C+";
                    }
                    else if(ave > 65) {
                    	grade = "D+";
                    }
                    else
                    	grade = "F";
                    System.out.printf("%2d %3d %3d %3d %3d %3d %3s\n", i + 1, kor, eng, mat, tot, ave, grade);
                }
                System.out.println("------------------------------");
            } else if (menu == 0) {
                System.out.println("종료");
                break;
            } else {
                System.out.println("잘못된 입력");
            }
        }

        sc.close();
    }
}