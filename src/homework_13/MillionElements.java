package homework_13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MillionElements {
    private static final int NUMBER_OF_ELEMENTS = 1_000_000;
    private static final int RANDOM_ELEMENTS = 10_000;

    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        long startLinkedList = System.currentTimeMillis();
        fillList(linkedList);
        getFromList(linkedList);
        long finishLinkedList = System.currentTimeMillis();

        long startArrayList = System.currentTimeMillis();
        fillList(arrayList);
        getFromList(arrayList);
        long finishArrayList = System.currentTimeMillis();

        System.out.println();
        System.out.println("LinkedList: " + (finishLinkedList - startLinkedList));
        System.out.println("ArrayList: " + (finishArrayList - startArrayList));
    }

    private static void getFromList(List<Integer> list) {
        for (int i = 0; i < RANDOM_ELEMENTS; i++) {
            int random = (int) (Math.random() * (RANDOM_ELEMENTS + 1));
            System.out.print(list.get(random) + " ");
        }
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            list.add(i);
        }
    }
    /*
    Судя по результатам работы программы ArrayList работает значительно быстрее, чем LinkedList.
     */
}
