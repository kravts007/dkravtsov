package homework_9.AnimalRefactored;

public class TestAnimal {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("...........Pets...........");
        Dog dog = new Dog(8, 32, "black", "Lucky");
        dog.info();
        dog.voice();
        System.out.println();

        GuideDog guideDog = new GuideDog(2, 12, "white", "Lucy", true);
        guideDog.info();
        guideDog.voice();

        Cat cat = new Cat(4, 7, "rose", "Peaty");
        cat.info();
        cat.voice();
        System.out.println();

        Fish fish = new Fish(3, 5, "silver", "Nemo");
        fish.info();
        fish.voice();
        System.out.println();

        Hamster hamster = new Hamster(14, 1, "brown", "Chilli");
        hamster.info();
        hamster.voice();
        System.out.println();
        System.out.println();

        System.out.println("...........Wild Animals...........");
        Crocodile crocodile = new Crocodile(8, 9, "black", true);
        crocodile.info();
        crocodile.voice();
        System.out.println();

        Giraffe giraffe = new Giraffe(15, 650, "yellow", false);
        giraffe.info();
        giraffe.voice();
        System.out.println();

        Wolf wolf = new Wolf(14, 22, "gray", true);
        wolf.info();
        wolf.voice();

        Lion lion = new Lion(6, 230, "yellow", true);
        lion.info();
        lion.voice();

    }
}
