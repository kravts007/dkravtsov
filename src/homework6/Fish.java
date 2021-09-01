package homework6;

public class Fish extends Domestic {
    public Fish(int id, int age, int weight, String color, String name) {
        super(id, age, weight, color, name);
    }

    @Override
    public String voice() {
        return "......";
    }
}
