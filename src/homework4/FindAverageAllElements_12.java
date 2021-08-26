package homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Найти среднее арифметическое всех элементов массива.
 */
public class FindAverageAllElements_12 {
    public static void main(String[] args) {
        //read source data
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of array elements");
        int n = scanner.nextInt();
        int[] array = new int[n];
                // заполняем массив
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int r = rand.nextInt(1000);
            array[i] = r;
        }
       // int[] array = {4, -5, 0, 6, 8};
        System.out.println(Arrays.toString(array));

        //processing
        int sum = 0;
        double average;
        for (int j : array) {
            sum += j;
        }
        average = (double) sum / array.length;

        //display results
        System.out.println("Среднее арифметическое элементов массива = " + average);
    }
}
