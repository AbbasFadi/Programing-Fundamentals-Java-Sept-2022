package BasicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class P05Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = "";
        int numberOfInputs = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfInputs; i++) {
            int input = Integer.parseInt(scanner.nextLine());


            int numOfDigits = Integer.toString(input).length();


            int mainDigit = input % 10;


            int offset = (mainDigit - 2) * 3;
            if (mainDigit == 8 || mainDigit == 9) offset++;


            int letterIndex = offset + numOfDigits - 1;


            if (mainDigit == 0) {
                message += " ";
            } else {
                message += String.valueOf(Character.toChars(letterIndex + 97));
            }
        }
        System.out.println(message);
    }
}
