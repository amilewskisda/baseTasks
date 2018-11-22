public class IfExamples {
    public static void main(String[] args) {
        System.out.println(checkIfPositive(-23));
        System.out.println(checkWhichNumberIsBigger(5, 3));

        System.out.println(answerCalling(false, true, true));
        System.out.println(answerCalling(true, true, false));
        System.out.println(answerCalling(false, true, false));
    }

    private static boolean checkIfPositive(int value) {
        if (value >= 0) {
            return true;
        } else {
            return false;
        }
    }
// AFTER SIMPLIFY
/*    public static boolean checkIfPositive(int value) {
        return value >= 0;
    }*/

    private static String checkWhichNumberIsBigger(int a, int b) {
        if (a < b) {
            return "Druga liczba większa";
        }
        if (a > b) {
            return "Pierwsza jest większa";
        }
        return "Są równe";
    }

    private static String checkWhichNumberIsBigger2(int a, int b) {
        if (a < b) {
            return "Druga liczba większa";
        } else if (a > b) {
            return "Pierwsza jest większa";
        } else {
            return "Są równe";
        }
    }

    private static boolean answerCalling(boolean isMama, boolean isMorning, boolean isAsleep) {
        if (isAsleep) { //śpimy -> nie odbieramy
            return false;
        }
        if (isMorning && !isMama) {  //jeżeli jest rano to odbieramy tylko od mamy
            return false;
        }
        return true; //w pozostałych przypadkach odbieramy telefon
    }
}
