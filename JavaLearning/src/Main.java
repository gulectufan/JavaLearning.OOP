
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		
		// değişken isimlnedirmeleri javada camelCase yazılır. 
		String text1 = "ilginizi cekebilir";
		String text2 = "vade süresi";
		System.out.println(text1);		
		
		int tamSayi = 74;
		double ondalikSayi = 34.1905;
		boolean goster = false;
		String okYonu = "down.svg";
		
		
		System.out.println("---------------------------");
		System.out.println("--- Kredi uygulamasi ---");
		// array
		// dataType[] arrayName = {};
		String[] krediler = {"Hizli kredi", "maasini Xbankatan alanlar", "mutlu emekli"};
		System.out.println(krediler[0]);
		System.out.println(krediler[1]);
		System.out.println(krediler[2]);
		// for ile yazdırma
		System.out.println("--- for ile calistir ---");
		for (int i=0; i<krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		
		System.out.println("---------------------------");
		System.out.println("--- Dolar Kuru uygulamasi ---");
		// uygulama
		double dolarDun = 15.25;
		double dolarBugun = 15.19;
		boolean dolarDustuMu = false;
		if (dolarDun > dolarBugun) {
			dolarDustuMu = true;
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else {
			dolarDustuMu = false;
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		
	}

}
