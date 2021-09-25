package homework_9.AnimalRefactored;

import homework_9.AnimalRefactored.AnimalInterfaces.Howling;

public class Dog extends Domestic implements Howling {
    public Dog(int age, int weight, String color, String name) {

        super(age, weight, color, name);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.print(" Woof!" + howl());
    }
    @Override
    public void info() {
        super.info();
    }

    @Override
    public String howl() {
        return "Houuuuu!!!! I am a dog, not a wolf!";
    }
}
