package day2;

import java.util.Scanner;

public class WhileExamples {
    public static void main(String... args) {
        runGreetings();
    }

    private static void runGreetings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź ilość pozdrowień:");
        double howManyTimes = scanner.nextDouble();

        int i = 0;
        while (i < howManyTimes) {
            System.out.println("Cześć tu pętla while po raz " + i);
            i++;
        }
    }
}
