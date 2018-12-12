package day1;

import java.util.Scanner;

/* Oblicz obwód i pole koła
 pokazać
 Math.PI,
 Math.pow(liczba, 2),
 Math.sqrt(liczba);*/

public class MathClass {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        System.out.println("Wprowadź promień: ");
        double radius = io.nextDouble();
        System.out.println("Obwód wynosi: " + (2 * radius * Math.PI));
        System.out.println("Pole wynosi: " + (Math.PI * Math.pow(radius, 2)));
    }
}
