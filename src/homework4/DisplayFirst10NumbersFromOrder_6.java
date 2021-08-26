package homework4;

/**
 * Вывести 10 первых чисел последовательности 0, -5,-10,-15...
 */
public class DisplayFirst10NumbersFromOrder_6 {
    public static void main(String[] args) {
        int count = 1;
        int i = 5;
        do {
            i -= 5;
            count++;
            if (count <= 10) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        } while (count <= 10);

    }
}
