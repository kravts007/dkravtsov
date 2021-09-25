package homework_9.AnimalRefactored;

import homework_9.AnimalRefactored.AnimalInterfaces.ExtraSkills;

public class GuideDog extends Dog implements ExtraSkills {

    private final boolean isTrained;

    public GuideDog(int age, int weight, String color, String name, boolean isTrained) {
        super(age, weight, color, name);
        this.isTrained = isTrained;
    }
    @Override
    public void voice() {
        if (isTrained) {
            super.voice();
            System.out.print(" I can take you home!");
            extraSkills();
        } else {
            super.voice();
            extraSkills();
        }
    }

    @Override
    public void info() {
        super.info();
    }

    @Override
    public void extraSkills() {
        System.out.println(" I brought home slippers for you");
    }
}
