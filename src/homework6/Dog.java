package homework6;

public class Dog extends Domestic {
    public Dog(int id, int age, int weight, String color, String name) {

        super(id, age, weight, color, name);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.print(" Woof!");
    }
}
