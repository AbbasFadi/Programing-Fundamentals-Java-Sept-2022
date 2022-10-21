package MethodsMoreExercise;

import java.util.Scanner;

public class P05MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        int numThree = Integer.parseInt(scanner.nextLine());

        getPositiveNegative(numOne, numTwo, numThree);

    }

    private static void getPositiveNegative(int numOne, int numTwo, int numThree) {

        if (numOne == 0 || numTwo == 0 || numThree == 0) {
            System.out.println("zero");
        } else if (numOne > 0 && numTwo > 0 && numThree > 0) {
            System.out.println("positive");
        } else if (numOne < 0 && numTwo < 0 && numThree > 0
                || numTwo < 0 && numThree < 0 && numOne > 0
                || numOne < 0 && numThree < 0 && numTwo > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }
}
