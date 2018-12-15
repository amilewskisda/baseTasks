package day2;

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Wpisz coś: ");
        String a = in.nextLine();
        in.close();
        System.out.println("Wpisano: " + a);
    }
}
