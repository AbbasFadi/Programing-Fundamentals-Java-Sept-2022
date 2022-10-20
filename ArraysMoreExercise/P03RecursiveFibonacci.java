package ArraysMoreExercise;

import java.util.Scanner;

public class P03RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if (num >= 1 && num <= 50) {
            long[] arr = new long[num];

            for (int i = 0; i <= arr.length - 1; i++) {
                if (i == 0 || i == 1) {
                    arr[i] = 1;
                } else {

                    arr[i] = arr[i - 1] + arr[i - 2];
                }

            }
            System.out.println(arr[arr.length - 1]);
        }else {
            System.out.println(num);
        }
    }
}