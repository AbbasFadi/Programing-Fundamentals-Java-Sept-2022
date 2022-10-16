package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class P06BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        boolean isBalanced = false;
        boolean closed = true;
        boolean opened = false;
        boolean startOpen = false;
        if (n == 0) {

            System.out.println("UNBALANCED");
            return;
        }
        for(int i = 0; i < n; i++){
            String input = scanner.nextLine();
            if(closed && input.equals(")")){
                closed = false;
                break;
            }
            if(opened && input.equals("(")){
                closed = false;
                break;
            }
            if(!startOpen && input.equals(")")){
                closed = false;
                break;
            }
            if(!startOpen && input.equals("(")){
                startOpen = true;
                opened = true;
                closed = false;
            }
            if(closed && input.equals("(")){
                opened = true;
                closed = false;
            }
            if(opened && input.equals(")")){
                closed = true;
                opened = false;
            }
        }
        if(closed){
            isBalanced = true;
        }
        if(isBalanced){
            System.out.println("BALANCED");
        }
        else{
            System.out.println("UNBALANCED");
        }
    }
}

