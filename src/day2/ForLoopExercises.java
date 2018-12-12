package day2;

import java.util.function.Function;

public class ForLoopExercises {

    public static void main(String[] args) {
        startCountdown(10);
        countdownWithPlus(10);
/*        printNumbersInTowerInRows(5);
        printFewNaturalNumbersWithTheirCubes(2, 6);
        printFibonacci(6);
        System.out.println(printFewNaturalNumbersWithResultInString(2, 7, (x) -> (Math.pow(x, 3))));*/
    }

    private static void countdownWithPlus(int max) {
        for (int i = 0; i < max; i++) {
            System.out.println("Do końca zostało " + (max - i));
        }
    }

    private static void startCountdown(int countdownValue) {
        for (int i = countdownValue; i >= 1; i--) {
            System.out.println(i);
            if (i == 1) {
                System.out.println("BOOM");
            }
        }
    }

    private static void printNumbersInTowerInRows(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    private static void printFewNaturalNumbersWithTheirCubes(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.println(i + " - jej szścian = " + Math.pow(i, 3));
        }
    }

    //  for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
    private static void printFibonacci(int elementsToShow) {

        int element1 = 0;
        int element2 = 1;
        System.out.println(element1);
        System.out.println(element2);

        int sumOfElements;

        for (int i = 1; i <= elementsToShow; i++) {
            sumOfElements = element1 + element2;
            System.out.println(sumOfElements);
            element1 = element2;
            element2 = sumOfElements;
        }
    }

    private static String printFewNaturalNumbersWithResultInString(int min, int max, Function<Double, Double> function) {
        String result = "";
        for (int i = min; i <= max; i++) {
            result = result + function.apply((double) i) + " ";
        }
        return result;
    }
}
