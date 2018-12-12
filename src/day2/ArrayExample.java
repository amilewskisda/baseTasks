package day2;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        createDaysInWeekArray();
        createAndPrintArray(6);

        int[] arrayOne = {1, 2, 3};
        int[] arrayTwo = {1, 2, 3};

        boolean arraysHaveTheSameSize = doArraysHaveTheSameSize(arrayOne, arrayTwo);
        System.out.println("arraysHaveTheSameSize = " + arraysHaveTheSameSize);
        boolean arraysAreTheSame = areArraysTheSame(arrayOne, arrayTwo);
        System.out.println("arraysAreTheSame = " + arraysAreTheSame);

        sumElementsOfArray(arrayOne);
    }

    public static void createDaysInWeekArray() {
        String[] week = new String[7];
        // mozna tez tak
        // String week[] = new String[7];
        week[0] = "Poniedzialek";
        week[1] = "Wtorek";
        week[2] = "Sroda";
        week[3] = "Czwartek";
        week[4] = "Piatek";
        week[5] = "Sobota";
        week[6] = "Niedziela";
        // ponizszy zapis jest rownoznaczny z powyzszym
        // String[] week = {"Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela"};

        System.out.println("Drugi dzień tygodnia to: " + week[7]); //spróbuj wpisać indeks > 7 -> ArrayIndexOutOfBoundsException
    }

    public static void createAndPrintArray(int arraysSize) {
        int[] array = new int[arraysSize]; // new alokuje pamięć dla tablic

        for (int i = 0; i < arraysSize; i++) {
            array[i] = i;
        }

        for (int arrayElement : array) {
            System.out.print(arrayElement + " ");
        }
        System.out.println();
    }

    private static boolean doArraysHaveTheSameSize(int[] arrayOne, int[] arraySecond) {

        // 3 przyklady na ta metode. Wykonuja to samo

        // Example 1
/*        if (arrayOne.length == arraySecond.length) {
            return true;
        } else {
            return false;
        }*/

        // Example 2
        // return arrayOne.length == arraySecond.length ? true : false;

        // Example 3
        return arrayOne.length == arraySecond.length;
    }

    private static boolean areArraysTheSame(int[] arrayOne, int[] arraySecond) {
        for (int i = 0; i < arraySecond.length; i++) {
            if (arrayOne[i] != arraySecond[i]) {
                return false;
            }
        }
        return true;
    }

    private static void sumElementsOfArray(int[] array) {
        // Example 1 for with array.length
        int sumOfArrayElements = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfArrayElements += array[i];
        }
        System.out.println(sumOfArrayElements);

        // Example 2 for each
        sumOfArrayElements = 0;
        for (int element : array) {
            sumOfArrayElements += element;
        }
        System.out.println(sumOfArrayElements);

        // Example 3 stream
        sumOfArrayElements = 0;
        sumOfArrayElements = Arrays.stream(array).sum();
        System.out.println(sumOfArrayElements);
    }
}
