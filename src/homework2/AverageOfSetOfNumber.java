package homework2;

import java.util.Scanner;

public class AverageOfSetOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите общее колличество чисел, среди которых будем искать среднее арифметическое ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int[] array = new int[size]; // Создаём массив int размером в size
        System.out.println("Теперь введите числа:");
        /*Проходимся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        /*находим среднее арифметическое чисел в массиве*/
        double averageValue = 0;
        if (array.length > 0) {
            double sum = 0;
            for (int i : array) {
                sum += i;
            }
            averageValue = sum / array.length;
        }
        System.out.println("Среднее арифметическое введённых чисел = " + averageValue);
    }
}
