package lv.dita;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter the first value: ");
            var x = input.nextFloat();
            System.out.print("Please enter the second value: ");
            var y = input.nextFloat();
            System.out.print("Please enter the arithmetic operation (+, -, *, /): ");
            input.nextLine();
            String op = input.nextLine();
            var result = Calculator.calculate(x,y,op);

            if(result.isSuccessful()) {
                System.out.println(result.getResult());
            }else{
                System.out.println(result.getErrorMessage());
            }

            System.out.println("So you want to continue? (Y/N)");
            var cont = input.nextLine();
            if (cont.equalsIgnoreCase("y")) {
                continue;
            } else {
                System.out.println("Thank you for testing our calculator");
                break;
            }
        }
    }
}