package BasicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class P03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double remainingBudget = budget;
        String input = scanner.nextLine();
        double totalPrice = 0, pricePerGame = 0;
        boolean outOfMoney = false;

        while (!input.equals("Game Time")) {

            switch (input) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    pricePerGame = 39.99;
                    break;
                case "CS: OG":
                    pricePerGame = 15.99;
                    break;
                case "Zplinter Zell":
                    pricePerGame = 19.99;
                    break;
                case "Honored 2":
                    pricePerGame = 59.99;
                    break;
                case "RoverWatch":
                    pricePerGame = 29.99;
                    break;
                default:
                    System.out.println("Not Found");
                    input = scanner.nextLine();
                    continue;
            }

            if (remainingBudget - pricePerGame == 0) {
                remainingBudget -= pricePerGame;
                totalPrice += pricePerGame;
                System.out.printf("Bought %s\n", input);
                outOfMoney = true;
                break;
            } else if (remainingBudget > pricePerGame) {
                remainingBudget -= pricePerGame;
                totalPrice += pricePerGame;
                System.out.printf("Bought %s\n", input);
            } else {
                System.out.println("Too Expensive");
            }

            input = scanner.nextLine();
        }

        if (outOfMoney) {
            System.out.println("Out of money!");
        } else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalPrice, budget - totalPrice);
        }
    }
}
