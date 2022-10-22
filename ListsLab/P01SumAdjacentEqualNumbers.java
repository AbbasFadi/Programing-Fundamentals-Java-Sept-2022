package ListsLab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;


public class P01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numbers = newList();

        int i = 0;
        while (i < numbers.size()-1) {
            double current = numbers.get(i);
            double next = numbers.get(i+1);
            if (current==next) {
                numbers.remove(i);
                numbers.set(i, (current+next));
                i=0;
            }else {
                i++;
            }
        }
        printList(numbers);
    }

    private static ArrayList<Double> newList() {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();
        String[] numbers = num.split(" ");
        ArrayList<Double> newList = new ArrayList<>();
        for (int i = 0, numbersLength = numbers.length; i < numbersLength; i++) {
            String s = numbers[i];
            double x = Double.parseDouble(s);
            newList.add(x);
        }
        return newList;
    }

    private static void printList(ArrayList<Double> numbers) {
        for (Double number : numbers) {

            System.out.print(new DecimalFormat("#.#").format(number)+" ");
        }
    }


}