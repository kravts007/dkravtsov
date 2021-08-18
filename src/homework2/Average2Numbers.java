package homework2;

import java.util.Scanner;

public class Average2Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter firs number");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number");
        int number2 = scanner.nextInt();

        double averageValue;
        averageValue = ((double)number1 + (double) number2) / 2;
        System.out.println("Average value of " + number1 + " and " + number2 + " is " + averageValue);

    }
}
