package homework4;

import java.util.Scanner;
/**
 * Дано число n при помощи цикла while посчитать факториал n!
 */

public class NFactorialWhile_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which we will be looking for the factorial:");
        int n = sc.nextInt();

        int nFactorial = 1;
        int count = 1;
        if (n < 0) {
            System.out.println("You entered incorrect number");
        } else {
            while (count <= n) {
                nFactorial *= count;
                count++;
            }
            System.out.println("Factorial of " + n + " is " + nFactorial);
        }
    }
}
