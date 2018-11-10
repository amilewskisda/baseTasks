import java.util.Arrays;
import java.util.List;

public class AnimalsListCommas {
    private static List<String> animals =
            Arrays.asList("cat", "dog", " mouse", "rat",
                    "pig", "rabbit", "hamster");

    public static void main(String[] args) {
        runExample();
    }

    private static void runExample() {
        System.out.println(animals);

        for (String text : animals) {
            System.out.println(text.trim().toUpperCase());
        }

        animals.stream()
                .map(e -> e.trim().toUpperCase())
                .forEach(e -> System.out.println(e));

        String animalsByComma = "";
        int counter = 0;
        for (String animal : animals) {
            animalsByComma = animalsByComma + animal.trim();
            counter = counter + 1;
            if (counter < animals.size()) {
                animalsByComma = animalsByComma + ",";
            }
            else {
                animalsByComma = animalsByComma + ".";
            }
        }
        System.out.println(animalsByComma);
    }
}
