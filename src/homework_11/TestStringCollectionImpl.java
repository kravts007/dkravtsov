package homework_11;

public class TestStringCollectionImpl {
    public static void main(String[] args) {
        checkOperations();
    }
    private static void checkOperations() {
        // Check create collection
        StringCollectionImpl c = new StringCollectionImpl();
        assert (c.size() == 0);

        // Check add elements
        assert (c.add("one"));
        assert (c.add("two"));
        System.out.println(c);
        assert (c.get(0).equals("one"));
        assert (c.get(1).equals("two"));

        // Check contains element
        assert (c.contains("one"));
        assert (!c.contains("three"));


        // Check delete element by value
        assert (c.delete("two"));
        assert (!c.delete("two"));
        assert (c.size() == 1);


        // Check add element by index
        assert (c.add("four"));
        assert (!c.add(10, "five"));
        assert (c.add(1, "five"));
        assert (c.get(0).equals("one"));
        assert (c.get(1).equals("five"));
        assert (c.get(2).equals("four"));
        assert (c.delete("four"));

        // Check equals
        StringCollectionImpl c1 = new StringCollectionImpl();
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
    }
}
