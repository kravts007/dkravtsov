package homework6;

import homework6.AnimalInterface.Swimmable;

public class Fish extends Domestic implements Swimmable {
    public Fish(int age, int weight, String color, String name) {
        super(age, weight, color, name);
    }

    @Override
    public void voice() {
        System.out.print("....." + swim());
    }

    @Override
    public void info() {
        super.info();
    }
    @Override
    public String swim() {
        return " ......";
    }
}
