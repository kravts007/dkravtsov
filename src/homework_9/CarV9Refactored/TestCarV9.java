package homework_9.CarV9Refactored;

import java.util.Scanner;

public class TestCarV9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double liters = 0;
        double fuelPrice = 0.0;

        CarV9 car = new CarV9();
        System.out.println(car);
        car.setTripDistance(0);
        System.out.printf("Одесса. В баке сейчас %.0f литров. Какая цена топлива? \n", car.getFuelInTank());
        fuelPrice = sc.nextDouble();
        car.fillFullTank(fuelPrice);
        car.drive(179, "Кривое Озеро");

        System.out.printf("Остановка Кривое Озеро. В баке сейчас %.0f литров. Сколько литров заправляем? \n", car.getFuelInTank());
        liters = sc.nextInt();
        System.out.println("Какая цена топлива?");
        fuelPrice = sc.nextDouble();
        car.fillTank(liters, fuelPrice);
        car.drive(153, "Жашков");

        System.out.printf("Остановка Жашков. В баке сейчас %.0f литров. Сколько литров заправляем? \n", car.getFuelInTank());
        liters = sc.nextInt();
        System.out.println("Какая цена топлива?");
        fuelPrice = sc.nextDouble();
        car.fillTank(liters, fuelPrice);
        car.drive(150, "Киев");

        car.printTripReport();
    }
}
