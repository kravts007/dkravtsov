package homework4;

public class OddNumbersFrom1To99_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
