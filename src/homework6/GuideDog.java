package homework6;

public class GuideDog extends Dog {

    private boolean isTrained;

    public GuideDog(int age, int weight, String color, String name, boolean isTrained) {
        super(age, weight, color, name);
        this.isTrained = isTrained;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    @Override
    public void voice() {
        if (isTrained) {
            super.voice();
            System.out.print(" I can take you home!");
        } else {
            super.voice();
        }
    }

    @Override
    public void info() {
        super.info();
    }
}