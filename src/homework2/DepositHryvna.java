package homework2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class DepositHryvna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада в гривнах: ");
        BigDecimal investment = scanner.nextBigDecimal();
        BigDecimal invest = investment;

        System.out.println("Введите процент годовых: ");
        double percentage = scanner.nextDouble() / 100;
        BigDecimal annualPercentage = BigDecimal.valueOf(percentage);


        System.out.println("Введите срок вклада, колличество лет: ");
        int numberOfYears = scanner.nextInt();

        //Формула для подсчета стоимости депозита
        System.out.println("Сумма вклада: " + investment + ", процент годовых: " + annualPercentage + ", срок вклада: " + numberOfYears + " лет");
        for (int i = 1; i <= numberOfYears; i++) {
            BigDecimal earningsPerYear = investment.multiply(annualPercentage);
            earningsPerYear = earningsPerYear.setScale(2, RoundingMode.HALF_UP);
            BigDecimal sumPerYear = investment.add(earningsPerYear);
            sumPerYear = sumPerYear.setScale(2, RoundingMode.HALF_UP);
            investment = sumPerYear;
            System.out.println("Год " + i + ", начисленные проценты за год = " + earningsPerYear + " грн, накопленная сумма = " + sumPerYear + " грн.");
            if (i == numberOfYears) {
                System.out.println();
                System.out.println("За " + numberOfYears + " лет, ваш депозит увеличился на " + sumPerYear.subtract(invest) + " грн");
            }
        }


    }
}
