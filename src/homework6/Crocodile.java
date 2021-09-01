package homework6;

public class Crocodile extends Wild{
    public Crocodile(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }
    @Override
    public String voice() {
        return super.voice() + " I live in the river";
    }
}
