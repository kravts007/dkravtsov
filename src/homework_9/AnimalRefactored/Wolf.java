package homework_9.AnimalRefactored;

import homework_9.AnimalRefactored.AnimalInterfaces.Howling;

public class Wolf extends Wild implements Howling {
    public Wolf(int age, int weight, String color, boolean isPredator) {
        super(age, weight, color, isPredator);
    }

    @Override
    public void voice() {
        if (isPredator()) {
            super.voice();
            System.out.println(howl());
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
