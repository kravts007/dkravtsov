package homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * В массиве из задания 9. найти наибольший элемент.
 */
public class FindMaxElementOfArray_10 {

    public static void main(String[] args) {
        //read source data
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of array elements");
        int n = scanner.nextInt();
        int[] array = new int[n];
//        int[] arr = {14,5, 6, 8, 2, 2, 9, 14, 2, 9, 6,14, 7};
        // заполняем массив
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int r = rand.nextInt(1000);
            array[i] = r;
        }
        System.out.println(Arrays.toString(array));
        //processing
        //ищем наибольший элемент массива
        int maxvalue = array[0];
        for (int i : array) {
            if (i > maxvalue) {
                maxvalue = i;
            }
        }
        //display result
        System.out.println("Max element is " + maxvalue); // Проверяем максимальный элемент
//        // считаем количество максимальных элементов в массиве
//        int count = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (max == arr[i]) {
//                count++;
//            }
//        }
//        System.out.println("Counts of maximal value are " + count);
//        int[] minArr = new int[count];
//        //Заполняем массив minArr максимальными элементами и выводим их на экран
//        for (int k = 0; k < count; k++) {
//            minArr[k] = max;
//            System.out.print(minArr[k] + " ");
//        }
    }
}
