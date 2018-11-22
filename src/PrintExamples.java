import java.time.LocalDateTime;

public class PrintExamples {
    public static void main(String[] args) {
        printExample();
        printlnExample();
        printfExample();
        mathExample();
        trueFalseExample();
        asciiExample();
        someSpecialCasesExample();
        printTypesLimit();
    }

    public static void printExample() {
        System.out.print("Michał");
        System.out.print(123);
    }

    private static void printlnExample() {
        System.out.println("programista");
        System.out.println("identyfikator Adama wynosi: " + 4);
        System.out.println("Marcin\n" + "Dominik\n" + "Robert\n");
        System.out.println("programista".toUpperCase());
        System.out.println(LocalDateTime.now());
    }

    private static void printfExample() {
        System.out.printf("Maciek waży %d kilogramów\n", 123);
        double weight = 65.45678d;
        System.out.printf("Maciek chciałby ważyć %f kilogramów\n", weight);
        System.out.printf("%.2f", 3.14159);
    }

    private static void mathExample() {
        System.out.println(2 + 3);
        System.out.println(2 - 4);
        System.out.println(1 + 2 + 3 + 4);
        System.out.println(1.0 + 2.1 + 3.2);
        System.out.println(5 / 2);
        System.out.println(5.0 / 2);
        System.out.println(5 / 2.0);
        System.out.println(5.0 / 2.0);
        System.out.println(100L - 10);
        System.out.println(2f - 3);
        System.out.println(5f / 2);
        System.out.println(5d / 2);
        System.out.println(-5 + 8 * 6);
        System.out.println("" + 5 + 8 + 6);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println((55 + 9) % 9);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }

    public static void trueFalseExample() {
        System.out.println(true);
        System.out.println(false);

        System.out.println(!true);
        System.out.println(false != true);

        boolean x = false == false;
        System.out.println(x);

        System.out.println(2 > 4);
        System.out.println(3 < 5);
        System.out.println((2 + 4) > (1 + 3));

        System.out.println(3 == 3 && 3 == 4);
        System.out.println(3 != 5 || 3 == 5);

        System.out.println("cos" == "cos");
        System.out.println("cos" == new String("cos"));
        System.out.println("cos".equals(new String("cos")));
    }

    private static void asciiExample() {
        System.out.println('a' + 'A');
        System.out.println("a" + "A");
        System.out.println('A' + 2);
        System.out.println('a' + 2);
        System.out.println("a" + 2);
        System.out.println("a" + "b");
        System.out.println('a' + 'b');
        System.out.println("a" + 'b');
        System.out.println("a" + 'b' + 3);
        System.out.println('b' + 3 + "a");
    }

    public static void someSpecialCasesExample() {
        System.out.println("\'");
        System.out.println("\\");
        System.out.println("Duzo cudzysłowiów: \"\"\"\"\"\"");
        System.out.println("\t" + "tekst po tab");
    }

    public static void printTypesLimit() {
        System.out.println(Byte.MAX_VALUE + 1);
        System.out.println("Min byte value   =  " + Byte.MIN_VALUE);
        System.out.println("Max byte value   =  " + Byte.MAX_VALUE);
        System.out.println("Min short value  =  " + Short.MIN_VALUE);
        System.out.println("Max short value  =  " + Short.MAX_VALUE);
        System.out.println("Min int value    =  " + Integer.MIN_VALUE);
        System.out.println("Max int value    =  " + Integer.MAX_VALUE);
        System.out.println("Min long value   =  " + Long.MIN_VALUE);
        System.out.println("Max long value   =  " + Long.MAX_VALUE);
        System.out.println("Min float value  =  " + Float.MIN_VALUE);
        System.out.println("Max float value  =  " + Float.MAX_VALUE);
        System.out.println("Min double value =  " + Double.MIN_VALUE);
        System.out.println("Max double value =  " + Double.MAX_VALUE);
    }
}
