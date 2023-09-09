package loops;

public class ForDemo {
    public static void main(String[] args) {

        for (int i = 1; i < 17; i++) {
            System.out.printf("Current value of i(index) is: %d\n", i);
        }

        System.out.println("______________________");

        for (int i = 1; i < 17; i *= 2) {
            System.out.printf("Current value of i(index) is: %d\n", i);
        }

        System.out.println("______________________");

        for (double i = 100; i > 20; i *= 0.3) {
            System.out.printf("Current value of i (index) is: %.3f\n", i);
        }
    }
}

