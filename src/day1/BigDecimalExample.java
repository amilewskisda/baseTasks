package day1;

import java.math.BigDecimal;

public class BigDecimalExample {

    // Nigdy nie liczymy pieniędzy na float czy double (Nie można poprawnie ująć wszystkich dziesiętnych ułamków w systemie binarnym)

    public static void main(String[] args) {
        double x = 0.02;
        double y = 0.03;
        double z = x - y;

        System.out.println(z);
        System.out.printf("%.2f\n" ,z);

        BigDecimal a = new BigDecimal("0.02");
        BigDecimal b = new BigDecimal("0.03");
        System.out.println(a.subtract(b));
    }
}
