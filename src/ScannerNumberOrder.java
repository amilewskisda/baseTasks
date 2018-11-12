import java.util.Scanner;

// Napisz program który pobierze 3 liczby, a następnie wypisze czy ich kolejność rosnąca, malejąca czy ani taka ani taka
// np.
// 1,2,3 - rosnąca
// 3,2,1 - malejąca
// 1,3,2 - ani rosnąca ani malejąca

public class ScannerNumberOrder {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        int a = in.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int b = in.nextInt();
        System.out.print("Podaj trzecią liczbę: ");
        int c = in.nextInt();
        in.close();
        if (a < b && b < c) {
            System.out.println("Kolejność rosnąca");
        } else if (a > b && b > c) {
            System.out.println("Kolejność malejąca");
        } else {
            System.out.println("Kolejność ani rosnąca ani malejąca");
        }
    }
}
