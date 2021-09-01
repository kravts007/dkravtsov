package homework6;

public class Dog extends Domestic {
    public Dog(int age, int weight, String color, String name) {

        super(age, weight, color, name);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.print(" Woof!");
    }

    @Override
    public void info() {
        super.info();
    }
}
