package homework6;

public class Wild extends Animal {

    private boolean isPredator;

    public Wild(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    @Override
    public String voice() {
        if (isPredator()) {
            return "I am a wild animal and I am angry!";
        }
        return "I am a wild animal and I am friendly";
    }
}
