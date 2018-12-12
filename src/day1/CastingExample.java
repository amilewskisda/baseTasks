package day1;

public class CastingExample {
    public static void main(String[] args) {
        showDowncastingExample();
        showUpcastingExample();
    }

    private static void showDowncastingExample() {
        byte myByte;
        int myInt = 258;
        double myDouble = 414.578;

        myByte = (byte) myInt;
        System.out.println("Konwertuję int na byte: myInt = " + myInt + ", " + "myByte = " + myByte);

        myInt = (int) myDouble;
        System.out.println("Konwertuję double na int: myDouble = " + myDouble + ", " + "myInt = " + myInt);

        // wychodząć poza zakres przechodzimy na wartości ujemne:
        // 414.578 - 258 = 98,  - konwertuję na typ obslugujący tylko liczby całkowite
        // 98 * (-1) = -98
        myByte = (byte) myDouble;
        System.out.println("Konwertuję double na byte: myDouble = " + myDouble + ", " + "myByte = " + myByte);
    }

    private static void showUpcastingExample() {
        byte x = 50;
        byte y = 100;
        int a = x * y / 2; // wynik samego mnożenia przekroczy byte - automatyczna promocja do int
        System.out.println(a);
    }
}
