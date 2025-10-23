package odev;

public class bonus1_1 {

	public static void main(String[] args) {
		// ************************************************************
        int toplamSaniye = 3665; 
        // ************************************************************
        
        // --- Hesaplamalar (Döngü Yok) ---
        
        // 1. Saat Hesaplama
        int saat = toplamSaniye / 3600;

        // 2. Kalan Saniye Hesaplama (3600'den artan saniye)
        int kalanSaniye = toplamSaniye % 3600;

        // 3. Dakika Hesaplama (Kalan saniyeyi 60'a böl)
        int dakika = kalanSaniye / 60;

        // 4. Son Saniye Hesaplama (60'dan artan saniye)
        int saniye = kalanSaniye % 60;

        // --- Çıktı ---
        
        System.out.println("Dönüştürülen Saniye: " + toplamSaniye);
        // %02d formatı, dakika ve saniyeyi iki haneli göstermek için kullanılır.
        System.out.printf("Çevrim Sonucu: %d:%02d:%02d\n", saat, dakika, saniye);

		}
}
