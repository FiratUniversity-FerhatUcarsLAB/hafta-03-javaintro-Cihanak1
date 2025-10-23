package odev;
import java.util.Scanner;
public class bonus3_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Bozulacak miktarı girin (TL): ");
        int miktar = scanner.nextInt();

        int yuzluk = miktar / 100;
        miktar = miktar % 100;

        int ellilik = miktar / 50;
        miktar = miktar % 50;

        int yirmilik = miktar / 20;
        miktar = miktar % 20;

        int beşlik = miktar / 5;
        miktar = miktar % 5;

        int ikilik = miktar / 2;
        miktar = miktar % 2;

        int birlik = miktar / 1;
        miktar = miktar % 1;

        System.out.println("Paranın dağılımı:");
        System.out.println(yuzluk + " x 100 TL");
        System.out.println(ellilik + " x 50 TL");
        System.out.println(yirmilik + " x 20 TL");
        System.out.println(beşlik + " x 5 TL");
        System.out.println(ikilik + " x 2 TL");
        System.out.println(birlik + " x 1 TL");

        scanner.close();

	}

}
