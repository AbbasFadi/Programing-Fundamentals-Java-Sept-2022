package MethodsMoreExercise;

import java.util.Scanner;

public class P01DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        switch (input) {
            case "int":
                int num = Integer.parseInt(scanner.nextLine());
                printInt(num);
                break;
            case "real":
                double number = Double.parseDouble(scanner.nextLine());
                printReal(number);
                break;
            case "string":
                String line = scanner.nextLine();
                printString(line);
                break;
        }
    }

    public static void printInt(int num) {
        System.out.println(num * 2);
    }

    public static void printReal(double number) {
        System.out.printf("%.2f", number * 1.5);
    }

    public static void printString(String line) {
        System.out.printf("$%s$", line);

    }
}
