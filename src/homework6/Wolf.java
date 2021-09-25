package homework6;

import homework6.AnimalInterface.Howling;

public class Wolf extends Wild implements Howling {
    public Wolf(int age, int weight, String color, boolean isPredator) {
        super(age, weight, color, isPredator);
    }

    @Override
    public void voice() {
        if (isPredator()) {
            super.voice();
            howl();
        } else if (!isPredator()) {

            System.out.println("I am not hungry yet!" + howl());
        }
    }


    @Override
    public void info() {
        super.info();
    }

    @Override
    public String howl() {
        return " Houuuuu!!!!";
    }
}
