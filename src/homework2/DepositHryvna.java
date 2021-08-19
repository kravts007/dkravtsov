package homework2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class DepositHryvna {
    public static void main(String[] args) {
        /*Declare scanner*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада в гривнах: ");
        BigDecimal investment = scanner.nextBigDecimal(); // Read the deposit amount
        BigDecimal invest = investment; // Primary amount of deposit

        System.out.println("Введите процент годовых: ");
        BigDecimal annualPercentage = scanner.nextBigDecimal(); // Read the annual percentage of deposit
        annualPercentage = annualPercentage.multiply(BigDecimal.valueOf(0.01)); // Transform percentage in the decimal number

        System.out.println("Введите срок вклада, колличество лет: ");
        int numberOfYears = scanner.nextInt(); // Read number of years of deposit

        // Formula for calculating the benefits of a deposit with capitalization
        System.out.println("Сумма вклада: " + investment + ", процент годовых: " + annualPercentage + ", срок вклада: " + numberOfYears + " лет");
        for (int i = 1; i <= numberOfYears; i++) {
            BigDecimal earningsPerYear = investment.multiply(annualPercentage); // Annual accruals on the deposit
            earningsPerYear = earningsPerYear.setScale(2, RoundingMode.HALF_UP); // Annual accruals rounding to coins
            BigDecimal sumPerYear = investment.add(earningsPerYear); // Full deposit amount per year  with annual accruals
            sumPerYear = sumPerYear.setScale(2, RoundingMode.HALF_UP); // Total annual sum per year rounding to coins
            investment = sumPerYear;
            System.out.println("Год " + i + ", начисленные проценты за год = " + earningsPerYear + " грн, накопленная сумма = " + sumPerYear + " грн.");
            if (i == numberOfYears) {
                System.out.println();
                System.out.println("За " + numberOfYears + " лет, ваш депозит увеличится на " + sumPerYear.subtract(invest) + " грн");
            }
        }
        /* Проверял через депозитный калькулятор https://finance.ua/ru/calc/deposit, выходит примерно так же. Там используется другая формула, которая учитывает колличество дней в месяце
         * и на этом основании начисляет месячный процент, который потом складывается в годовой. Поэтому в зависимости от суммы вклада и его протяженности будет изменяться разница в результатах.
         */


    }
}
