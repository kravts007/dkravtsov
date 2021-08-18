package homework2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class DepositHryvna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада в гривнах: ");
        BigDecimal investment = scanner.nextBigDecimal();

        System.out.println("Введите процент годовых: ");
        double annualPercentage = scanner.nextDouble();
        annualPercentage = annualPercentage / 100;
        System.out.println("Введите срок вклада, колличество лет: ");
        int numberOfYears = scanner.nextInt();

        //Формула для подсчета стоимости депозита
        System.out.println("Сумма вклада: " + investment + ", процент годовых: " + annualPercentage + ", срок вклада: " + numberOfYears + " лет");
        for (int i = 1; i <= numberOfYears; i++) {
            BigDecimal earningsPerYear = investment.multiply(BigDecimal.valueOf(annualPercentage));
            BigDecimal scaledEarningsPerYear = earningsPerYear.setScale(2, BigDecimal.ROUND_FLOOR);
            BigDecimal sumPerYear = investment.add(earningsPerYear);
            sumPerYear.setScale(2, RoundingMode.HALF_UP);
            investment = sumPerYear;
            System.out.println("Год " + i + ", начисленные проценты за год = " + earningsPerYear + ", накопленная сумма = " + sumPerYear + " грн.");
        }


        System.out.println("Данные " + " " + investment + " " + annualPercentage + " " + numberOfYears);
    }
}
