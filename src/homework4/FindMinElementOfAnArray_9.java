package homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Дан массив размерности N, найти наименьший элемент массива и вывести на консоль (если наименьших элементов несколько — вывести их все).
 */
public class FindMinElementOfAnArray_9 {
    public static void main(String[] args) {
        //read source data
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of array elements");
        int n = scanner.nextInt();
        int[] array = new int[n];
        //int[] arr = {5, 6, 8, 2, 2, 9, 14, 2, 9, 6, 7};
        // заполняем массив
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int r = rand.nextInt(1000);
            array[i] = r;
        }
        System.out.println(Arrays.toString(array));
        //processing
        //ищем наименьший элемент массива
        int minValue = array[0];
        for (int i : array) {
            if (i < minValue) {
                minValue = i;
            }
        }
        System.out.println("Min element is " + minValue); // Проверяем минимальный элемент
        // считаем количество минимальных элементов в массиве
        int count = 0;

        for (int j : array) {
            if (minValue == j) {
                count++;
            }
        }
        System.out.println("Counts of min element are " + count);
        //display data
        int[] minArr = new int[count];
        //Заполняем массив minArr минимальными элементами и выводим их на экран
        for (int k = 0; k < count; k++) {
            minArr[k] = minValue;
            System.out.print(minArr[k] + " ");
        }
    }
}
