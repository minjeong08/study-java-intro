package method.ex;

public class MethodEx2 {

    public static void main(String[] args) {
        printString("Hello, world", 5);
    }

    public static void printString(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
