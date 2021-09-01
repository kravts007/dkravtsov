package homework6;

public class Animal {


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

    public void setId(int id) {
        this.id = id;
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

    public void voice() {
        System.out.print("Hello, ");
    }

    private void setId() {
        this.id = count++;
    }

    public void info() {
        System.out.printf("My ID is %s, my age is %s, my weight is %s kg and my color is %s", getId(),getAge(), getWeight(), getColor());
        //System.out.print("My ID is " + getId() + ", my age is " + getAge() + ", my weight is " + getWeight() + " kg " + "and my color is " + getColor());
        System.out.println();
    }
}
