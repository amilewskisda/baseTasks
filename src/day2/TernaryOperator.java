package day2;

public class TernaryOperator {

    public static void main(String[] args) {
        System.out.println("Liczba" + 3 + " większa od zera -> " + (isNumberBiggerThanZero(3) ? "tak" : "nie"));
        System.out.println("Liczba" + -1 + " większa od zera -> " + (isNumberBiggerThanZero(-1) ? "tak" : "nie"));
    }

    public static boolean isNumberBiggerThanZero(int number) {
        return number > 0;
    }
}
