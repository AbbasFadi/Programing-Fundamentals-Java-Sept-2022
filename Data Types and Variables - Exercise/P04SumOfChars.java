package DataTypesAndVariables;

import java.util.Scanner;

public class P04SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int countSymbols = Integer.parseInt(scanner.nextLine());
        for (int symbol = 1; symbol <= countSymbols ; symbol++) {
            char value = scanner.nextLine().charAt(0);
            int code = (int) value;
            sum += code;

        }
        System.out.printf("The sum equals: %d", sum);
    }
}
