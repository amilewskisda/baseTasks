public class Switch {
    public static void main(String[] args) {
        int result = basicMath("+",3, 2);
        System.out.println(result);
    }

    public static int basicMath(String symbol, int a, int b) {
        switch (symbol){
            case "+": return a+b;
            case "-": return a-b;
            case "*": return a*b;
            case "/": return a/b;
        }
        return 0;
    }
}
