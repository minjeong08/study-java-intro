package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int count = input.nextInt();

        int[] numbers = new int[count];
        int minNumber, maxNumber;

        System.out.println(count + "개의 정수를 입력하세요");
        for (int i = 0; i < count; i++) {
            numbers[i] = input.nextInt();
        }

        maxNumber = minNumber = numbers[0];
        for (int num : numbers) {
            if (num > maxNumber) {
                maxNumber = num;
            } else if (num < minNumber) {
                minNumber = num;
            }
        }

        System.out.println("가장 작은 정수 = " + minNumber);
        System.out.println("가장 큰 정수 = " + maxNumber);
    }
}
