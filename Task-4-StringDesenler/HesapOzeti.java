package odev;

public class gorev4_3 {

	public static void main(String[] args) {
		// ürün1
		String ürün1 = "Elma";
		int miktar1 = 3;
		double fiyat1 = 12; // birim fiyatı
		// ürün2
		String ürün2 = "Armut";
		int miktar2 = 5;
		double fiyat2 = 15; // birim fiyatı
		// ürün3
		String ürün3 = "Kiraz";
		int miktar3 = 10;
		double fiyat3 = 400; // acı fiyatı
		
		System.out.println(" HESAP ÖZETİ");
		System.out.println("---------------------------------------------");
		// Başlık kısımlarını oluşturabilmek için yapay zekadan yardım alıyorum.
		System.out.printf("| %-15s | %-6s | %-8s | %-9s |\n", "ÜRÜN", "MİKTAR", "FİYAT (TL)", "TOPLAM (TL)");
		System.out.println("---------------------------------------------");
		//toplam tutarı hesaplamaya geçiyoruz.
		double toplamfiyat1 = miktar1 * fiyat1;
		double toplamfiyat2 = miktar2 * fiyat2;
		double toplamfiyat3 = miktar3 * fiyat3;
		
		// Ürün 1
		System.out.printf("| %-15s | %-6d | %-8.2f | %-9.2f |\n", ürün1, miktar1, fiyat1, toplamfiyat1);
		// Ürün 2
		System.out.printf("| %-15s | %-6d | %-8.2f | %-9.2f |\n", ürün2, miktar2, fiyat2, toplamfiyat2);
		// Ürün 3
		System.out.printf("| %-15s | %-6d | %-8.2f | %-9.2f |\n", ürün3, miktar3, fiyat3, toplamfiyat3);

	}

}
