package homework6;

public class Fish extends Domestic {
    public Fish(int age, int weight, String color, String name) {
        super(age, weight, color, name);
    }

    @Override
    public void voice() {
        System.out.print(".....");
    }

    @Override
    public void info() {
        super.info();
    }
}
