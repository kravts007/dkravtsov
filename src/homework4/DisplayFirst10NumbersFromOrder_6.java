package homework4;

public class DisplayFirst10NumbersFromOrder_6 {
    public static void main(String[] args) {

//        for (int i = 0; i >= -50; i --) {
//            if (i % 5 == 0) {
//                System.out.print(i + ", ");
//                if (i == -45) {
//                    System.out.print(i);
//                }
//            }
//        }
        int count = 1;
        int i = 5;
        do {
            i -= 5;
            System.out.print(i + ", ");
            count++;

        } while (count <= 10);

    }
}
