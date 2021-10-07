package homework_13;

import java.util.concurrent.ThreadLocalRandom;

public class Box {
    private int weight;
    private int length;
    private int width;
    private int height;

    public Box() {
        this.weight = ThreadLocalRandom.current().nextInt(1, 1001);
        this.length = ThreadLocalRandom.current().nextInt(1, 101);
        this.width = ThreadLocalRandom.current().nextInt(1, 101);
        this.height = ThreadLocalRandom.current().nextInt(1, 101);
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Box{" +
                "weight=" + weight +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
