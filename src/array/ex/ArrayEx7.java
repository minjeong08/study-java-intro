package array.ex;

import java.util.Scanner;

public class ArrayEx7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] subjects = {"국어", "영어", "수학"};
        int[][] scores = new int[4][subjects.length];

        for (int i = 0; i < 4; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[j] + " 점수 : ");
                scores[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            for (int j = 0; j < subjects.length; j++) {
                sum += scores[i][j];
            }
            double average = (double) sum / subjects.length;
            System.out.println((i+1) + "번 학생의 총점: " + sum + ", 평균 : " + average);
        }
    }
}
