package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class P05DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int countLines = Integer.parseInt(scanner.nextLine());
        String result = "";
        for (int i = 1; i <= countLines ; i++) {
            char currentSymbol = scanner.nextLine().charAt(0);
            result += (char) ((int) currentSymbol + key);
        }
        System.out.println(result);
    }

}

