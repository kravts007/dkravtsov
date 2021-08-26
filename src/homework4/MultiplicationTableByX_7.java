package homework4;

import java.util.Scanner;
/**
 * Необходимо вывести на экран таблицу умножения на Х: (любое число вводимое из консоли)
 *  НЕ СОВСЕМ ПОНЯЛ УСЛОВИЕ ЗАДАЧИ, ПОЭТОМУ СДЕЛАЛ 2 ВАРИАНТА.
 *  ЗАКОМЕНТИРОВАЛ, КАК ПО МОЕМУ ПРАВИЛЬНО.
 *
 */
public class MultiplicationTableByX_7 {
    public static void main(String[] args) {
        //read data source
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int x = scanner.nextInt();
//        System.out.println("Enter second number ");
//        int y = scanner.nextInt();

//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= x; j++) {
//                System.out.print(i + "x" + j + "=" + (i * j) + "\t");
//            }
//            System.out.println();
//        }

        //processing + display result
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "x" + x + "=" + (i * x) + "\t");
        }
    }
}
