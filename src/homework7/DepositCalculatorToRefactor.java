package homework7;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class DepositCalculatorToRefactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сумму вклада в банк в гривнах: ");
        BigDecimal sum = sc.nextBigDecimal();
        System.out.print("Какой процент годовых? ");
        BigDecimal percent = sc.nextBigDecimal();
        percent = percent.multiply(BigDecimal.valueOf(0.01));
        System.out.print("Длительность вклада (лет): ");
        int term = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= term; i++) {
            BigDecimal y = sum.multiply(percent);
            y = y.setScale(2, RoundingMode.HALF_UP);
            sum = sum.add(y);
            String years = getYears(i);
            if (i < term) {
                consoleOutput(sum, i, y, years);
                System.out.println("-------");
            } else {
                consoleOutput(sum, i, y, years);
            }
        }
    }


    private static String getYears(int i) {
        int iLastNumber = i % 10;
        String years = "";
        boolean isExclusion = (i % 100 >= 11) && (i % 100 <= 14);
        if (iLastNumber == 0 || iLastNumber >= 5 && iLastNumber <= 9)
            years = "лет";
        else if (isExclusion)
            years = "лет";
        else if (iLastNumber == 1)
            years = "год";
        else if (iLastNumber >= 2 && iLastNumber <= 4)
            years = "года";
        return years;
    }

    private static void consoleOutput(BigDecimal sum, int i, BigDecimal y, String years) {
        System.out.printf("Накопленная сумма за %s %s составила %s грн", i, years, sum);
        System.out.println();
        System.out.println("Начисленные проценты в грн: " + y);
    }
}
