package homework5;

public class TestCar extends Car {
    public TestCar(int tankVolume, int tankResidue, int fuelConsumptionPer100Km) {
        super(tankVolume, tankResidue, fuelConsumptionPer100Km);
    }

    public static void main(String[] args) {
        Car car = new Car(70, 28, 8);

        int nKyiv = 478; // Расстояние от Одессы до Киева
        int nJashkov = 328; // Расстояние от Одессы до Жашкова
        int nKryvoeOzero = 179; // Расстояние от Одессы до Кривого Озера
        int fuelPrice = 33; // Цена топлива 33 грн/л

        initialData(car, nKyiv);

        System.out.println("Первая остановка Кривое Озеро через " + nKryvoeOzero + " км");
        System.out.println("Остаток топлива после преодоления " + nKryvoeOzero + " км до Кривого Озера = "
                + car.fuelVolumeAfterNKm(nKryvoeOzero) + " литр(ов)");
        int volKryvoeOzero = car.getTankResidue() - car.fuelVolumeAfterNKm(nKryvoeOzero);
        System.out.println("Мы потратили " + volKryvoeOzero + " литр(ов) бензина");
        System.out.println("До полного бака нужно заправить " + car.fuelToFullTankAfterNKm(nKryvoeOzero)
                + " литр(ов)");
        car.setTankResidue(car.fuelVolumeAfterNKm(nKryvoeOzero)); // установили остаток топлива в Кривом Озере
        int priceKryvoeOzero = car.fillTheFullTank() * fuelPrice; // цена заправки в Кривом Озере до полного бака.
        System.out.println("Заплатить за дозаправку нужно " + priceKryvoeOzero + " гривен, по " +
                fuelPrice + " гривен за литр");
        car.setTankVolume(car.fillTheFullTank() + car.getTankResidue()); //залили полный бак
        car.setTankResidue(car.getTankVolume()); // теперь остаток == полный бак
        System.out.println();

        System.out.println("Теперь у нас в баке снова " + car.getTankVolume() + " литр(ов)");
        System.out.println("Следующая остановка Жашков через " + (nJashkov - nKryvoeOzero) + " км");
        System.out.println("Остаток топлива после преодоления " + (nJashkov - nKryvoeOzero) + " км до Жашкова = "
                + car.fuelVolumeAfterNKm(nJashkov - nKryvoeOzero) + " литр(ов)");
        int volJashkov = car.getTankResidue() - car.fuelVolumeAfterNKm(nJashkov - nKryvoeOzero);
        System.out.println("Мы потратили " + volJashkov + " литр(ов) бензина");
        // System.out.println("" + car.getTankVolume() + " " + car.getTankResidue() + " " + car.getFuelConsumptionPer100Km());
        System.out.println("До полного бака нужно заправить " + car.fuelToFullTankAfterNKm(nJashkov - nKryvoeOzero)
                + " литр(ов)");
        car.setTankResidue(car.fuelVolumeAfterNKm(nJashkov - nKryvoeOzero));  // установили остаток топлива в Кривом Озере
        int priceJashkov = car.fillTheFullTank() * fuelPrice; // цена заправки в Жашкове до полного бака.
        System.out.println("Заплатить за дозаправку нужно " + priceJashkov + " гривен, по " +
                fuelPrice + " гривен за литр");
        car.setTankVolume(car.fillTheFullTank() + car.getTankResidue()); //залили полный бак
        car.setTankResidue(car.getTankVolume()); // теперь остаток == полный бак
        System.out.println();

        System.out.println("Теперь у нас в баке снова " + car.getTankVolume() + " литр(ов)");
        System.out.println("Следующая остановка Киев через " + (nKyiv - nJashkov) + " км");
        System.out.println("Остаток топлива после преодоления " + (nKyiv - nJashkov) + " км до Киева = "
                + car.fuelVolumeAfterNKm(nKyiv - nJashkov) + " литр(ов)");
        int volKyiv = car.getTankResidue() - car.fuelVolumeAfterNKm(nKyiv - nJashkov);
        System.out.println("Мы потратили " + volKyiv + " литр(ов) бензина");
        System.out.println("До полного бака нужно заправить " + car.fuelToFullTankAfterNKm(nKyiv - nJashkov)
                + " литр(ов)");
        car.setTankResidue(car.fuelVolumeAfterNKm(nKyiv - nJashkov));  // установили остаток топлива в Кривом Озере
        int priceKyiv = car.fillTheFullTank() * fuelPrice; // цена заправки в Киеве до полного бака.
        System.out.println("Заплатить за дозаправку нужно " + priceKyiv + " гривен, по " +
                fuelPrice + " гривен за литр");
        System.out.println();

        conclusions(fuelPrice, volKryvoeOzero, priceKryvoeOzero, volJashkov, priceJashkov, volKyiv, priceKyiv);
    }

    private static void initialData(Car car, int nKyiv) {
        System.out.println("Объем бака авто = " + car.getTankVolume() + " литров");
        System.out.println("Остаток топлива в баке = " + car.getTankResidue() + " литров");
        System.out.println("Расход топлива = " + car.getFuelConsumptionPer100Km() + " литров на 100 км");
        System.out.println("Начинаем свое путешествие Одесса - Киев, длиной " + nKyiv + " км");
        System.out.println();
    }

    private static void conclusions(int fuelPrice, int volKryvoeOzero, int priceKryvoeOzero, int volJashkov, int priceJashkov, int volKyiv, int priceKyiv) {
        int totalFuelSpend = volKryvoeOzero + volJashkov + volKyiv;
        System.out.println("Что бы доехать из Одессы в Киев мы потратили " + totalFuelSpend + " литр(ов) бензина");
        System.out.println("Что стоило нам " + (totalFuelSpend * fuelPrice) + " гривен");

        int totalMoneySpend = priceKryvoeOzero + priceJashkov + priceKyiv;
        System.out.println("Общая сумма приезда в Киев с полным баком и двумя остановками обошлась нам в "
                + totalMoneySpend + " гривен");
    }

}
