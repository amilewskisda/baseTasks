public class Switch {
    public static void main(String[] args) {

        basicMathExampleWithBreak("&", 5, 4);

        int result = basicMathWithReturn("+", 3, 2);
        System.out.println(result);
    }

    private static void basicMathExampleWithBreak(String symbol, int a, int b) {
        Integer result = null;
        switch (symbol) {
            case "+": {
                result = a + b;
                break;
            }
            case "-": {
                result = a - b;
                break;
            }
            case "*": {
                result = a * b;
                break;
            }
            case "/": {
                result = a / b;
                break;
            }
        }
        System.out.println("Mój wynik wynosi: " + result);
    }

    private static int basicMathWithReturn(String symbol, int a, int b) {
        switch (symbol) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
        }
        return 0;
    }
}
