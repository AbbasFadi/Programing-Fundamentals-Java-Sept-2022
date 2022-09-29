package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        //for цикъл
        //1. начална стойност -> startNumber
        //2. крайна стойност -> endNumber
        //3. повтаряме -> отпечатваме числото
        //4. промяна -> + 1

        int sum = 0; //сумата на числата
        for (int number = startNumber; number <= endNumber; number++) {
            System.out.print(number + " ");
            sum = sum + number;   // sum += number;
        }

        System.out.println(); //свалям курсора на нов ред
        System.out.println("Sum: " + sum);


    }
}
