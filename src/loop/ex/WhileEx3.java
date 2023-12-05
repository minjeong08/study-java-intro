package loop.ex;

public class WhileEx3 {

    public static void main(String[] args) {
        int i = 1;
        int max = 3;
        int sum = 0;

        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
