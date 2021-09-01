package homework6;

public class Domestic extends Animal {

    private String name;
    private boolean isVaccinated;

    public Domestic(int id, int age, int weight, String color, String name) {
        super(id, age, weight, color);
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
    public void voice() {
        if (isVaccinated()) {
             super.voice();
            System.out.print("my name is" + getName() + "! and I am vaccinated");
        }
        super.voice();
        System.out.print("my name is " + getName() +"!");
    }
}
