package homework7;

public class NumbersOfAge {
    public static void main(String[] args) {
        int age = 7;
        int ageLastNumber = age % 10;
        String old = "";
        boolean isExclusion = (age % 100 >= 11) && (age % 100 <= 14);

        if (ageLastNumber == 1)
            old = "год";
        else if (ageLastNumber == 0 || ageLastNumber >= 5 && ageLastNumber <= 9)
            old = "лет";
        else if (ageLastNumber >= 2 && ageLastNumber <= 4)
            old = "года";
        if (isExclusion)
            old = "лет";

        System.out.println(old);
    }

}
