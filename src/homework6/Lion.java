package homework6;

public class Lion extends Wild {
    public Lion(int age, int weight, String color, boolean isPredator) {
        super(age, weight, color, isPredator);
    }

    public void voice() {
        if (isPredator()) {
            super.voice();
            System.out.print(" I live in the savannah!");
        } else if (!isPredator()) {

            System.out.println("I am not hungry yet!");
        }
    }

    @Override
    public void info() {
        super.info();
    }
}
