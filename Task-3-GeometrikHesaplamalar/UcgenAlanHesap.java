package odev;

public class gorev3_3 {

	public static void main(String[] args) {
		// 1. Kenar Değerlerini Tanımlama
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;

        System.out.println("Kenarlar: a=" + a + ", b=" + b + ", c=" + c);
        
        // 2. Yarı Çevre (s) Hesabı
        // s = (a + b + c) / 2
        double s = (a + b + c) / 2.0;
        System.out.println("\nAdım 1 - Yarı Çevre (s) = " + s); 
        
        // 3. Alan Formülündeki Çarpım Kısmını Hesaplama
        // s * (s - a) * (s - b) * (s - c)
        double carpim = s * (s - a) * (s - b) * (s - c);
        System.out.println("Adım 2 - Karekök İçi Çarpım = " + carpim); 
        
        // 4. Karekök Alma ve Alanı Bulma
        // A = Karekök(Çarpım)
        double alan = Math.sqrt(carpim);
        
        System.out.println("---------------------------------");
        System.out.println("3.3 - Üçgenin Alanı: " + alan);

	}

}
