package day1;

public class IncrementDecrement {

    public static void main(String[] args) {
        int x = 3;

        System.out.printf("x: %d\n", x);
        System.out.printf("x: %d\n", x);
        System.out.printf("x++: %d\n", x++);
        System.out.printf("x: %d\n", x);
        System.out.printf("++x: %d\n", ++x);
        System.out.printf("x: %d\n", x);

        System.out.println();

        int y;
        y = x--;
        System.out.printf("y = x--: %d\n", y);
        System.out.printf("x: %d\n", x);
        System.out.printf("y: %d\n", y);

        System.out.println();

        System.out.printf("x: %d\n", x);
        y = --x;
        System.out.printf("y = --x: %d\n", y);
        System.out.printf("x: %d\n", x);
        System.out.printf("++y: %d\n", ++y);
    }
}
