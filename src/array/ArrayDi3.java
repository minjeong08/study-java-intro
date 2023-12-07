package array;

public class ArrayDi3 {

    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        int[][] arr = new int[3][5];

        int i = 1;
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col < arr[row].length ; col++) {
                arr[row][col] = i++;
            }
            System.out.println();
        }

        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col < arr[row].length ; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
