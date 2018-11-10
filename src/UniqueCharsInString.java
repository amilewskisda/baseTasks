import java.util.Arrays;

public class UniqueCharsInString {

    public static void main(String[] args) {
        String str = "SoS";
        System.out.println("Wyraz testowy: " + str);
        System.out.println("String posiada tylko unikalne znaki: " + checkIfCharsAreDuplicated(str));
    }

    private static boolean checkIfCharsAreDuplicated(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
