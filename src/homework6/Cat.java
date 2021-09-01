package homework6;

public class Cat extends Domestic {
    public Cat(int id, int age, int weight, String color, String name) {
        super(id, age, weight, color, name);
    }

    @Override
    public String voice() {
        return super.voice() + " Meow";
    }
}
