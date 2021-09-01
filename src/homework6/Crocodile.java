package homework6;

public class Crocodile extends Wild{
    public Crocodile(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }
    @Override
    public void voice() {
        if(isPredator()){
            super.voice();
            System.out.print(" I live in the river!");
        }else if(!isPredator()){
            super.voice();
            System.out.print("I am not hungry yet!");
        }

    }
}
