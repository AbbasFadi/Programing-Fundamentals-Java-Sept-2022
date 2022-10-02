package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        double countOfStudents = Double.parseDouble(scanner.nextLine());
        double priceLightSabers = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());
        double lightSabers10percent = Math.ceil(countOfStudents * 0.10);
        double priceEquipment = 0;

        for (int students = 1; students <= countOfStudents; students++) {
            priceEquipment += priceLightSabers;
            priceEquipment += priceRobes;
            if (students % 6 == 0) {
                continue;
            }
            priceEquipment += priceBelts;
        }
        double finalPrice = priceEquipment + (lightSabers10percent * priceLightSabers);
        if (finalPrice <= amountOfMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", finalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", finalPrice - amountOfMoney);
        }
    }
}
