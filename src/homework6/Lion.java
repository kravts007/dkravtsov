package homework6;

public class Lion extends Wild{
    public Lion(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }
    public String voice(){
        return super.voice() + " I live in savannah";
    }
}
