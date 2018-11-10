import java.util.ArrayList;
import java.util.List;

public class OddNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> oddNumberList = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            if (numbers[i] % 2 != 0) {
                oddNumberList.add(numbers[i]);
            }
        }

        for (Integer oddNumber : oddNumberList) {
            System.out.print(oddNumber + ", ");
        }
    }
}
