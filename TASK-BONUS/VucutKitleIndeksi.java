package odev;
import java.util.Scanner;
public class bonus2_1 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        System.out.print("Kilonuzu girin (kg): ");
	        double kilo = input.nextDouble();

	        System.out.print("Boyunuzu girin (metre cinsinden, örn: 1.75): ");
	        double boy = input.nextDouble();

	        double bmi = kilo / (boy * boy);

	        System.out.println("Vücut Kitle İndeksiniz (BMI): " + bmi);

	        input.close();

	}

}
