package day2;
// Co wyświetli się w konsoli?
public class DayOneReminder {
    static double number = 10.99;

    public static void main(String[] args) {
        number = 102;
        myMethod();
        // number = 99.109
        System.out.printf("number = %.1f", number++);
    }

    public static void myMethod() {
        number = Math.PI;
        mySecondMethod();
    }

    public static void mySecondMethod() {
        number = 5.123;
    }
}
