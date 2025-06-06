package test5;

import java.util.ArrayList;

public class Exam {

    protected ArrayList<Integer> ans_sheet = new ArrayList<>();
    protected ArrayList<Integer> scores = new ArrayList<>();
    protected ArrayList<Integer> stu_ans = new ArrayList<>();

    public Exam() {
    }

    public void ans_sheet() {
        ans_sheet.clear();
        for (int i = 0; i < 10; i++) {
            ans_sheet.add((int) (Math.random() * 4 + 1));
        }
    }

//    public int getN() {
//        Scanner s = new Scanner(System.in);
//        System.out.print("student no : ");
//        return s.nextInt();
//    }

    public void test() {
        stu_ans.clear();
        for (int j = 0; j < 10; j++) {
            stu_ans.add((int) (Math.random() * 4 + 1));
        }
    }

    public void check(int i, String subj) {
        int o = 0;
        System.out.print(subj + " : ");
        for (int j = 0; j < 10; j++) {
            if (ans_sheet.get(j) == stu_ans.get(j)) {
                o++;
                System.out.print("O ");
            } else {
                System.out.print("X ");
            }
        }
        int score = o * 10;
        System.out.println(" " + score);
        scores.add(score);
    }
    public void grade() {
    	
    }

    public void result() {
        System.out.println("no subj score");
        for (int i = 0; i < scores.size(); i++) {
            System.out.printf("%2d %5d\n", i + 1, scores.get(i));
        }
    }
}