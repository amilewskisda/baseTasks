import java.util.ArrayList;
import java.util.Arrays;

public class LongestWords {

    public static void main(String[] args) {
        String [] dict = {"Software", "Development", "Academy", "programista", "Java"};
        System.out.println("Lista wyrazów : " +  Arrays.toString(dict));
        System.out.println("Najdłuższy/e wyrazy to: "+ longestWords(dict));
    }

    private static ArrayList<String> longestWords(String[] dictionary) {
        ArrayList<String> list = new ArrayList<>();
        int longest_length = 0;
        for (String str : dictionary) {
            int length = str.length();
            if (length > longest_length) {
                longest_length = length;
                list.clear();
            }
            if (length == longest_length) {
                list.add(str);
            }
        }
        return list;
    }
}