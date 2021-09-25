package homework_9.AnimalRefactored;

import homework_9.AnimalRefactored.AnimalInterfaces.MakeVoice;

public abstract class Domestic extends Animal implements MakeVoice {

    private String name;
    private boolean isVaccinated;

    public Domestic(int age, int weight, String color, String name) {
        super(age, weight, color);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    @Override
    public void info() {
        super.info();
    }

    @Override
    public void voice() {
        if (isVaccinated()) {
            System.out.print("my name is " + getName() + "! and I am vaccinated");
        }
        System.out.print("my name is " + getName() + "!");
    }
}
