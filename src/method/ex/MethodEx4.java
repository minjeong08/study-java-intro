package method.ex;

import java.util.Scanner;

public class MethodEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;

        while (true) {
            System.out.println("---------------------------------\n1.입금 | 2.출금 | 3.잔액 확인 | 4.종료\n---------------------------------");
            System.out.print("선택: ");

            int option = scanner.nextInt();
            int amount;
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("입금액을 입력하세요.:");
                    amount = scanner.nextInt();
                    scanner.nextLine();
                    balance = deposit(balance, amount);
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요.:");
                    amount = scanner.nextInt();
                    scanner.nextLine();
                    balance = withdraw(balance, amount);
                    break;
                case 3:
                    System.out.println("현재 잔액: " + balance);
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
