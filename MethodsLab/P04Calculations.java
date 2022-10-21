package MethodsLab;

import java.util.Scanner;

public class P04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String commandInPut = scanner.nextLine();
        int firstNumInPut = Integer.parseInt(scanner.nextLine());
        int secondNumInPut = Integer.parseInt(scanner.nextLine());

        switch (commandInPut) {
            case "add":
                addNumbers(firstNumInPut, secondNumInPut);
                break;
            case "multiply":
                multiplyNumbers(firstNumInPut, secondNumInPut);
                break;
            case "subtract":
                subtractNumbers(firstNumInPut, secondNumInPut);
                break;
            case "divide":
                divideNumbers(firstNumInPut, secondNumInPut);
                break;
        }
    }
    public static void addNumbers(int firstNum, int secondNum) {
        int result =  firstNum + secondNum;
        System.out.println(result);
    }

    public static void multiplyNumbers(int firstNum, int secondNum) {
        int result = firstNum * secondNum;
        System.out.println(result);
    }

    public static void subtractNumbers(int firstNum, int secondNum) {
        int result = firstNum - secondNum;
        System.out.println(result);
    }

    public static void divideNumbers(int firstNum, int secondNum) {
        int result = firstNum / secondNum;
        System.out.println(result);
    }

}
