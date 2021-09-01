package homework6;

public class Wild extends Animal {

    private boolean isPredator;

    public Wild(int age, int weight, String color, boolean isPredator) {
        super(age, weight, color);
        this.isPredator = isPredator;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    @Override
    public void voice() {
        if (isPredator()) {
            System.out.print("I am a wild animal and I am angry! ");
        } else {
            System.out.print("I am a wild animal and I am friendly! ");
        }
    }

    @Override
    public void info() {
        super.info();
    }
}
