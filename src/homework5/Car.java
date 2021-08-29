package homework5;

/**
 * класс Машина с полями и методами
 */
public class Car {
    private int tankVolume; // Объем бака авто
    private int tankResidue; // Остаток топлива в баке
    private int fuelConsumptionPer100Km; // расход топлива на 100 км

    public Car(int tankVolume, int tankResidue, int fuelConsumptionPer100Km) {
        this.tankVolume = tankVolume;
        this.tankResidue = tankResidue;
        this.fuelConsumptionPer100Km = fuelConsumptionPer100Km;
    }

    //залить полный бак с учетом объема остатка
    public int fillTheFullTank() {
        return tankVolume - tankResidue;
    }

    //определить остаток топлива по преодолении N км
    public int fuelVolumeAfterNKm(int N) {
        return tankResidue - (Math.round(fuelConsumptionPer100Km * N) / 100);
    }

    //определить сколько надо дозаправить топлива при преодолении N км
    public int fuelToFullTankAfterNKm(int N) {
        return tankVolume - (tankResidue - (Math.round(fuelConsumptionPer100Km * N) / 100));
    }

    //Сеттеры к полям
    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }

    public void setTankResidue(int tankResidue) {
        this.tankResidue = tankResidue;
    }

    public void setFuelConsumptionPer100Km(int fuelConsumptionPer100Km) {
        this.fuelConsumptionPer100Km = fuelConsumptionPer100Km;
    }

    //Геттеры к полям
    public int getTankVolume() {
        return tankVolume;
    }

    public int getTankResidue() {
        return tankResidue;
    }

    public int getFuelConsumptionPer100Km() {
        return fuelConsumptionPer100Km;
    }
}
