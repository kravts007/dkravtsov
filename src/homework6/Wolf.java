package homework6;

public class Wolf extends Wild{
    public Wolf(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }
    @Override
    public void voice(){
        if(isPredator()){
            super.voice();
            System.out.print(" Howwwwwllll!!!!!");
        }else if(!isPredator()){

            System.out.println("I am not hungry yet! Howwwwwllll!!!!!");
        }
    }
}
