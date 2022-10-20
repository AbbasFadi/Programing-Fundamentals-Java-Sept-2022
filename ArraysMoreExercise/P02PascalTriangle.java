package ArraysMoreExercise;

import java.util.Scanner;

public class P02PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int[] arrTwo = new int[0];
        for (int n = 1; n <= num; n++) {
            int[] arrOne = new int[n];
            for (int k = 0; k < n; k++) {
                if (k == 0 || k == n - 1) {
                    arrOne[k] = 1;
                } else {
                    arrOne[k] = arrTwo[k - 1] + arrTwo[k];
                }

                System.out.print(arrOne[k] + " ");


            }
            arrTwo = arrOne;
            System.out.println();
        }

    }
    }

