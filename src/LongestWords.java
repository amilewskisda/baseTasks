import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestWords {

    public static void main(String[] args) {
        String [] dict = {"Software", "Development", "Academy", "programista", "Java"};
        System.out.println("Lista wyrazów : " +  Arrays.toString(dict));
        System.out.println("Najdłuższy/e wyrazy to: "+ longestWords(dict));
    }

    private static List<String> longestWords(String[] dictionary) {
        ArrayList<String> list = new ArrayList<>();
        int longestLength = 0;
        for (String str : dictionary) {
            int length = str.length();
            if (length > longestLength) {
                longestLength = length;
                list.clear();
            }
            if (length == longestLength) {
                list.add(str);
            }
        }
        return list;
    }
}