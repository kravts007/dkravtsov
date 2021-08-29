package homework5;

public class TestCar extends Car {
    public TestCar(int tankVolume, int tankResidue, int fuelConsumptionPer100Km) {
        super(tankVolume, tankResidue, fuelConsumptionPer100Km);
    }

    public static void main(String[] args) {
        Car car = new Car(70, 28, 8);

        int nKyiv = 478; // Расстояние от Одессы до Киева
        int nJashkov = 328; // Расстояние от Одессы до Жашкова
        int nKrivoeOzero = 179; // Расстояние от Одессы до Кривого Озера
        int fuelPrice = 33; // Цена топлива 33 грн/л

        System.out.println("Объем бака авто = " + car.getTankVolume() + " литров");
        System.out.println("Остаток топлива в баке = " + car.getTankResidue() + " литров");
        System.out.println("Расход топлива = " + car.getFuelConsumptionPer100Km() + " литров на 100 км");
        System.out.println();

        System.out.println("Начинаем свое путешествие Одесса - Киев, длиной " + nKyiv + " км");
        System.out.println("Первая остановка Кривое Озеро через " + nKrivoeOzero + " км");
        System.out.println("Остаток топлива после преодоления " + nKrivoeOzero + " км до Кривого Озера = "
                + car.fuelVolumeAfterNKm(nKrivoeOzero) + " литр(ов)");
        System.out.println("До полного бака нужно заправить " + car.fuelToFullTankAfterNKm(nKrivoeOzero)
                + " литр(ов)");
        car.setTankResidue(car.fuelVolumeAfterNKm(nKrivoeOzero)); // установили остаток топлива в Кривом Озере
        int priceKryvoeOzero = car.fillTheFullTank() * fuelPrice; // цена заправки в Кривом Озере до полного бака.
        System.out.println("Заплатить за дозаправку нужно " + priceKryvoeOzero + " гривен, по " +
                fuelPrice + " гривен за литр");

        car.setTankVolume(car.fillTheFullTank() + car.getTankResidue()); //залили полный бак
        car.setTankResidue(car.getTankVolume()); // теперь остаток == полный бак
        System.out.println("Теперь у нас в баке снова " + car.getTankVolume() + " литр(ов)");
        System.out.println("Следующая остановка Жашков через " + (nJashkov - nKrivoeOzero) + " км");
        System.out.println("Остаток топлива после преодоления " + (nJashkov - nKrivoeOzero) + " км до Жашкова = "
                + car.fuelVolumeAfterNKm(nJashkov - nKrivoeOzero) + " литр(ов)");
        // System.out.println("" + car.getTankVolume() + " " + car.getTankResidue() + " " + car.getFuelConsumptionPer100Km());
        System.out.println("До полного бака нужно заправить " + car.fuelToFullTankAfterNKm(nJashkov - nKrivoeOzero)
                + " литр(ов)");
        car.setTankResidue(car.fuelVolumeAfterNKm(nJashkov - nKrivoeOzero));  // установили остаток топлива в Кривом Озере
        int priceJashkov = car.fillTheFullTank() * fuelPrice; // цена заправки в Жашкове до полного бака.
        System.out.println("Заплатить за дозаправку нужно " + priceJashkov + " гривен, по " +
                fuelPrice + " гривен за литр");
        car.setTankVolume(car.fillTheFullTank() + car.getTankResidue()); //залили полный бак
        car.setTankResidue(car.getTankVolume()); // теперь остаток == полный бак
        System.out.println("Теперь у нас в баке снова " + car.getTankVolume() + " литр(ов)");
        System.out.println("Следующая остановка Киев через " + (nKyiv - nJashkov) + " км");
        System.out.println("Остаток топлива после преодоления " + (nKyiv - nJashkov) + " км до Киева = "
                + car.fuelVolumeAfterNKm(nKyiv - nJashkov) + " литр(ов)");
        System.out.println("До полного бака нужно заправить " + car.fuelToFullTankAfterNKm(nKyiv - nJashkov)
                + " литр(ов)");
        car.setTankResidue(car.fuelVolumeAfterNKm(nKyiv - nJashkov));  // установили остаток топлива в Кривом Озере
        int priceKyiv = car.fillTheFullTank() * fuelPrice; // цена заправки в Киеве до полного бака.
        System.out.println("Заплатить за дозаправку нужно " + priceKyiv + " гривен, по " +
                fuelPrice + " гривен за литр");
        int totalPrice = priceKryvoeOzero + priceJashkov + priceKyiv;
        System.out.println("Поездка из Одессы в Киев с двумя остановками обошлась нам в " + totalPrice);
    }

}
