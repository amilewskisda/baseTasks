import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arrayOne = {1, 2, 3};
        int[] arrayTwo = {1, 2, 3};

        createAndPrintArray(6);
        boolean arraysHaveTheSameSize = areArraysHaveTheSameSize(arrayOne, arrayTwo);
        System.out.println("arraysHaveTheSameSize = " + arraysHaveTheSameSize);
        boolean arraysAreTheSame = areArraysTheSame(arrayOne, arrayTwo);
        System.out.println("arraysAreTheSame = " + arraysAreTheSame);

        sumElementsOfArray(arrayOne);
    }

    public static void createAndPrintArray(int arraysSize) {
        int[] array = new int[arraysSize];

        for (int i = 0; i < arraysSize; i++) {
            array[i] = i;
        }

        for (int arrayElement : array) {
            System.out.print(arrayElement + " ");
        }
        System.out.println();
    }

    private static boolean areArraysHaveTheSameSize(int[] arrayOne, int[] arraySecond) {

        // 3 przyklady na ta metode. Wykonuja to samo

        // Example 1
/*        if (arrayOne == arraySecond) {
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
