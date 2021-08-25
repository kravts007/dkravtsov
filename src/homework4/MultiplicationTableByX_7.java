package homework4;

import java.util.Scanner;

public class MultiplicationTableByX_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int x = scanner.nextInt();
        System.out.println("Введите второе число");
        int y = scanner.nextInt();

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                System.out.print(i + "x" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
