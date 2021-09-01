package homework6;

public class TestAnimal {
    public static void main(String[] args) {
        System.out.println("...........Pets...........");
        Dog dog = new Dog(1, 8, 32, "black", "Lucky");
        dog.voice();
        System.out.println();

        GuideDog guideDog = new GuideDog(2, 2, 12, "white", "Lucy", true);
        guideDog.voice();
        System.out.println();

        Cat cat = new Cat(3, 4, 7, "rose", "Peaty");
        cat.voice();
        System.out.println();

        Fish fish = new Fish(4, 3, 5, "silver", "Nemo");
        fish.voice();
        System.out.println();

        Hamster hamster = new Hamster(5, 14, 1, "brown", "Chilli");
        hamster.voice();
        System.out.println();

        System.out.println("...........Wild Animals...........");
        Crocodile crocodile = new Crocodile(6, 8, 9, "black", true);
        crocodile.voice();
        System.out.println();

        Giraffe giraffe = new Giraffe(7, 15, 650, "yellow", false);
        giraffe.voice();
        System.out.println();

        Wolf wolf = new Wolf(8, 14, 22, "gray", true);
        wolf.voice();
        System.out.println();

        Lion lion = new Lion(9,6,230,"yellow", true);
        lion.voice();


    }
}
