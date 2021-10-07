package homework_13;

public class WordRepeat {
    public static void main(String[] args) {
        String text = "Hello World! I love this world! This world gave me very much words!";
        String repeated = "world";
        int pattern;
        int currentIndex = 0;
        int counter = 0;

        String textToLow = text.toLowerCase();
        String repeatedToLow = repeated.toLowerCase();

        while ((pattern = textToLow.indexOf(repeatedToLow, currentIndex)) != -1) {
            counter++;
            currentIndex = pattern + 1;
        }
        System.out.printf("%s = %d", repeatedToLow, counter);
    }
}
