import java.util.Arrays;

// -> icon with ArgsMainMethodExample
// -> EditConfigurations
// -> Program arguments
// -> Parametry wpisywać oddzielone spacją

public class ArgsFromMainMethodExample {
    public static void main(String[] args) {
        int tabLength = Integer.parseInt(args[0]);
        String[] myNewTab = new String[tabLength];
        Arrays.fill(myNewTab, args[1]);
        printTab(myNewTab);
    }

    private static void printTab(String[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(i + " " + tab[i]);
        }
    }
}
