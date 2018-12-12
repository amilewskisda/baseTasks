package day1;

public class OperatorsWithAssignment {

    public static void main(String[] args) {
        int x = 1;
        int y = 5;
        int z = 10;
        int v = 100;
        int q = 121;

        x += 5; // x = x + 5;
        System.out.println(x);

        y -= 2; // y = y - 2;
        System.out.println(y);

        z *= 3; // z = z * 3;
        System.out.println(z);

        v /= 10; // v = v / 10;
        System.out.println(v);

        q %= 100; // q = q % 100;
        System.out.println(q);
    }
}
