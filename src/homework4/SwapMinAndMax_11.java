package homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Поменять наибольший и наименьший элементы массива местами. Пример: дан массив {4, -5, 0, 6, 8}. После замены будет выглядеть {4, 8, 0, 6, -5}.
 */
public class SwapMinAndMax_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of array elements");
        int n = scanner.nextInt();
        int[] array = new int[n];
        //int[] arr = {4, -5, 0, 6, 8};
        // заполняем массив
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int r = rand.nextInt(1000);
            array[i] = r;
        }
        System.out.println(Arrays.toString(array));

        // processing
        int indexOfMinElement = 0;
        int minValue = array[0];
        int indexOfMaxElement = 0;
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            int currentValue = array[i];
            if (currentValue < minValue) {
                minValue = currentValue;
                indexOfMinElement = i;
            }
            if (currentValue > maxValue) {
                maxValue = currentValue;
                indexOfMaxElement = i;
            }
        }
        int temp = array[indexOfMaxElement];
        array[indexOfMaxElement] = array[indexOfMinElement];
        array[indexOfMinElement] = temp;

        // display results
        System.out.println(Arrays.toString(array));
    }
}
