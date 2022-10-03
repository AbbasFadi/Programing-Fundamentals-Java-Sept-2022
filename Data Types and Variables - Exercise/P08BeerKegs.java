package DataTypesAndVariables;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maxVolume = Double.MIN_VALUE;
        String maxModelKeg = "";
        int countKegs = Integer.parseInt(scanner.nextLine());

        for (int keg = 1; keg <= countKegs; keg++) {

            String kegModel = scanner.nextLine();
            double kegRadius = Double.parseDouble(scanner.nextLine());
            int kegHeight = Integer.parseInt(scanner.nextLine());

            double kegVolume = Math.PI * Math.pow(kegRadius, 2) * kegHeight;

            if (kegVolume > maxVolume) {
                maxVolume = kegVolume;
                maxModelKeg = kegModel;
            }
        }
        System.out.println(maxModelKeg);
    }
}
