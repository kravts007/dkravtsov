package homework_9.AnimalRefactored;

public abstract class Animal {
    private int id;
    private int age;
    private int weight;
    private String color;
    protected static int count;

    public Animal(int age, int weight, String color) {
        setId();
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private void setId() {
        this.id = count++;
    }

    public void info() {
        System.out.printf("My ID is %s, my age is %s, my weight is %s kg and my color is %s", getId(), getAge(), getWeight(), getColor());
        System.out.println();
    }
}
