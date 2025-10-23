package odev;

public class gorev5_2 {

	public static void main(String[] args) {
		final double MIL_TO_KM = 1.609;

        // Başlık satırı, sütunları hizalamak için formatlama kullanıldı.
        System.out.printf("%-10s %-10s\n", "Mil", "Kilometre");
        System.out.println("--------------------");

        // 1 Mil için
        int mil1 = 1;
        double km1 = mil1 * MIL_TO_KM;
        System.out.printf("%-10d %-10.3f\n", mil1, km1);

        // 5 Mil için
        int mil2 = 5;
        double km2 = mil2 * MIL_TO_KM;
        System.out.printf("%-10d %-10.3f\n", mil2, km2);

        // 10 Mil için
        int mil3 = 10;
        double km3 = mil3 * MIL_TO_KM;
        System.out.printf("%-10d %-10.3f\n", mil3, km3);

        // 20 Mil için
        int mil4 = 20;
        double km4 = mil4 * MIL_TO_KM;
        System.out.printf("%-10d %-10.3f\n", mil4, km4);

        // 50 Mil için
        int mil5 = 50;
        double km5 = mil5 * MIL_TO_KM;
        System.out.printf("%-10d %-10.3f\n", mil5, km5);

	}
	
}

