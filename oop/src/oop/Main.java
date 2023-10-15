package oop;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade oranı";
		// Class değişkeni oluşturma -> tip isim = new() 
		// Değişken tipi : Product
		// değişken adı : product1
		Product product1 = new Product();
		product1.name ="Delonghi Kahve Makinası";
		product1.unitPrice = 7500;
		product1.discount = 7;
		product1.unitsInStock = 3;
		product1.imageUrl = "bilmemne.svg";
		System.out.println(product1.name);
	}

}
