package homework_9.AnimalRefactored;

public class Cat extends Domestic {
    public Cat(int age, int weight, String color, String name) {

        super(age, weight, color, name);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.print(" Meow!");
    }

    @Override
    public void info() {
        super.info();
    }

}
