import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        Random random = new Random();

        // random integer numbers in [-int, int)
//        for (int i = 0; i < 10; i++) {
//            System.out.print(random.nextInt() + " ");
//        }

        // random integer number in [0, bound)
//        int bound = 100;
//        for (int i = 0; i < 10; i++) {
//            System.out.print(random.nextInt(bound) + " ");
//        }

        // random integer number in [a, b]
        int a = 10;
        int b = 30;
        for (int i = 0; i < 10; i++) {
            System.out.print(random.nextInt(b - a + 1) + a + " ");
        }
    }
}
