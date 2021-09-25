package homework_9.CarV9Refactored;

import java.util.StringJoiner;

public class CarV9 {
    private double tankCapacity = 30 + (int) (Math.random() * 31);
    private double fuelConsumption = 5 + (int) (Math.random() * 11);
    private double fuelInTank = tankCapacity / 100.0 * (10 + (int) (Math.random() * 41));
    private double tripDistance;
    private double tripMoneySpent;
    private String location = "Одесса";

    public void fillTank(double liters, double fuelPrice) {
        double fuelToFullTank = tankCapacity - fuelInTank;
        if (liters > fuelToFullTank) {
            liters = fuelToFullTank;
        }
        System.out.printf("Заправлено %.1f литров. Оплачено %.2f грн.\n", liters, liters * fuelPrice);
        fuelInTank += liters;
        tripMoneySpent += liters * fuelPrice;
    }

    public void fillFullTank(double fuelPrice) {
        System.out.println("Заправляем полный бак.");
        fillTank(tankCapacity - fuelInTank, fuelPrice);
    }

    public void drive(int distance, String destination) throws RuntimeException {
        System.out.printf("Едем в %s. %s км ...\n", destination, distance);
        fuelInTank -= distance / 100.0 * fuelConsumption;
        if (fuelInTank < 0) {
            throw new RuntimeException("В баке закончился бензин!");
        }
        tripDistance += distance;
    }

    public void printTripReport() {
        System.out.println("!!!-------Отчет о поездке-------!!!");
        System.out.printf(
                "Остаток топлива в баке %.1f литров. Всего проехали %.0f км. Всего потрачено %.2f грн.\n",
                getFuelInTank(),
                tripDistance,
                tripMoneySpent);
    }
    public void setTripDistance(double tripDistance) {
        this.tripDistance = tripDistance;
    }

    public double getFuelInTank() {
        return fuelInTank;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CarV9.class.getSimpleName() + "[", "]")
                .add("tripDistance=" + tripDistance)
                .add("tripMoneySpent=" + tripMoneySpent)
                .add("fuelInTank=" + fuelInTank)
                .add("tankCapacity=" + tankCapacity)
                .add("fuelConsumption=" + fuelConsumption)
                .add("location=" + location)
                .toString();
    }
}