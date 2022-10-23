package ListsMoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P03TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> numsList = takeNumbersFromInput(input);
        List<String> nonNumsList = takeNonNumsList(input);

        List<Integer> takeList = getTakeList(numsList);
        List<Integer> skipList = getSkipList(numsList);

        String message = takeMessage(nonNumsList, takeList, skipList);
        System.out.println(message);

    }

    private static String takeMessage(List<String> nonNumsList, List<Integer> takeList, List<Integer> skipList) {

        StringBuilder message = new StringBuilder();
        int i = 0;
        int startIndex = 0;
        int endIndex = 0;
        int length = 0;

        while (i < takeList.size()) {
            startIndex = length;
            endIndex = length + takeList.get(i);

            while (startIndex < endIndex && startIndex <= nonNumsList.size() - 1) {
                message.append(nonNumsList.get(startIndex));
                startIndex++;
            }

            length = startIndex + skipList.get(i);
            i++;
        }

        return message.toString();
    }

    private static List<Integer> getSkipList(List<Integer> numsList) {

        List<Integer> skipList = new ArrayList<>();
        for (int i = 0; i < numsList.size(); i++) {
            if (i % 2 != 0) {
                skipList.add(numsList.get(i));
            }
        }
        return skipList;
    }

    private static List<Integer> getTakeList(List<Integer> numsList) {

        List<Integer> takeList = new ArrayList<>();
        for (int i = 0; i < numsList.size(); i++) {
            if (i % 2 == 0) {
                takeList.add(numsList.get(i));
            }
        }
        return takeList;
    }

    private static List<String> takeNonNumsList(String input) {

        input = input.replaceAll("\\d", "");
        List<String> nonNumsList = new ArrayList<String>(Arrays.asList(input.split("")));

        return nonNumsList;
    }

    private static List<Integer> takeNumbersFromInput(String input) {

        List<Integer> numsList = new ArrayList<>();
        String numbers = input.replaceAll("[^0-9]", "");

        for (int i = 0; i < numbers.length(); i++) {
            numsList.add(Character.digit(numbers.charAt(i), 10));
        }

        return numsList;

    }
}
