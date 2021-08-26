package homework4;

/**
 * При помощи цикла for вывести на экран нечетные числа от 1 до 99.
 */
public class OddNumbersFrom1To99_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
