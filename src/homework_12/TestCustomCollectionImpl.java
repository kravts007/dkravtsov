package homework_12;

public class TestCustomCollectionImpl {
    public static void main(String[] args) {
//        CustomCollectionImpl c = new CustomCollectionImpl();
//        c.add("A");
//        c.add("B");
//        c.add("C");
//        c.add("D");
//
//        System.out.println(c.size());
//        System.out.println("LL: " + c);
//
//        c.add("E");
//        c.add("F");
//        System.out.println("LL: " + c);
//        System.out.println(c.size());
//        c.delete("D");
//        System.out.println("LL: " + c);
//        System.out.println("LL: " + c);
//        System.out.println(c.contains("A"));
//        System.out.println(c.get(4));
//        System.out.println(c.delete(3));
//        System.out.println("LL: " + c);
//        c.clear();
//        c.addAll(new String[]{"1", "2", "3", "4"});
//        System.out.println("LL: " + c);
        checkOperations();

    }

    private static void checkOperations() {
        // Check create collection
        CustomCollectionImpl c = new CustomCollectionImpl();
        CustomCollectionImpl c1 = new CustomCollectionImpl();
        CustomCollectionImpl c2 = new CustomCollectionImpl();
        CustomCollectionImpl c3 = new CustomCollectionImpl();
        CustomCollectionImpl c4 = new CustomCollectionImpl();
        assert (c.size() == 0);
//
        // Check add elements
        assert (c.add("one"));
        assert (c.add("two"));
        assert (c.add("three"));
        System.out.println(c);
//        assert (c.get(1));
//        assert (c.get(1));
//
//        // Check contains element
        assert (c.contains("one"));
        assert (!c.contains("three"));
//
//
        // Check delete element by value
        assert (c.delete("two"));
        assert (!c.delete("two"));
        assert (c.size() == 1);
//

        // Check add element by index
        assert (c.add("four"));
//        assert (!c.add(10, "five"));
//        assert (c.add(1, "five"));
        assert (c.get(0).equals("one"));
        assert (c.get(1).equals("five"));
        assert (c.get(2).equals("four"));
        assert (c.delete("four"));

        // Check equals
        assert (c1.add("one"));
        assert (c1.add("five"));
        assert (c1.equals(c));
        assert (c1.add("ten"));
        assert (!c1.equals(c));


        // Check clear
        assert (c.clear());
        assert (!c.contains("Some value"));
        assert (!c.delete("Some value"));
        assert (c.size() == 0);

        //Check addAll
        c2.addAll(new String[]{"A", "B", "C", "D", "E", "F"});
        System.out.println(c2);
        c2.delete(1);
        c3.addAll(new String[]{"G", "H", "I", "J", "K", "L"});
        c4.addAll(new String[]{"A", "B", "C", "D", "E", "F"});
        System.out.println(c3);
        System.out.println();
        System.out.println(c2.size());
        System.out.println(c2.get(1));
        c3.addAll(c2);
        System.out.println(c3);
        c2.addAll(c3);
        System.out.println(c2);
        System.out.println(c2.equals(c4));

    }
}
