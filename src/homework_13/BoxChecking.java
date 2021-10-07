package homework_13;

import java.util.ArrayList;
import java.util.List;

public class BoxChecking {
    public static void main(String[] args) {
        List<Box> source = ListOfBoxes();
        List<Box> moved = new ArrayList<>();
        System.out.println("Source size: " + source.size());
        System.out.println("Moved size: " + moved.size());
        System.out.println();
        replace(source, moved);
        System.out.println("After moving boxes weighing more than 300 grams");
        System.out.println("Source size: " + source.size());
        System.out.println("Moved size: " + moved.size());
        System.out.println();
        System.out.println("Boxes under 300 gram weight: ");
        System.out.println(source);
        System.out.println();
        System.out.println("Boxes upper 300 gram weight: ");
        System.out.println(moved);
    }
    private static void replace(List<Box> source, List<Box> moved) {
        for (int i = 0; i < source.size(); i++) {
            if (source.get(i).getWeight() > 300) {
                moved.add(source.get(i));
                source.remove(i--);
            }
        }
    }
    private static List<Box> ListOfBoxes() {
        List<Box> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(new Box());
        }
        return list;
    }
}
