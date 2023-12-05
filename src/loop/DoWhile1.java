package loop;

public class DoWhile1 {

    public static void main(String[] args) {
        int i = 10;
        while (i < 3) { // 실행 안 됨
            System.out.println("현재 숫자는 : " + i);
            i++;
        }
    }
}
