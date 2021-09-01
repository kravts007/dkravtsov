package homework6;

public class Hamster extends Domestic{
    public Hamster(int id, int age, int weight, String color, String name) {
        super(id, age, weight, color, name);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.print(" I live in the cage");
    }
}
