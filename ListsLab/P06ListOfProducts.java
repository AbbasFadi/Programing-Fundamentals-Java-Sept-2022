package ListsLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P06ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<String> listProduct = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String product = scanner.nextLine();
            listProduct.add(product);
        }
        Collections.sort(listProduct);
        for (int i = 0; i < listProduct.size(); i++) {
            System.out.println((i + 1) + "." + listProduct.get(i));
        }

    }
}
