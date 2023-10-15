package nTierFirst;

import nTierFirst.business.ProductManager;
import nTierFirst.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		// product oluştur, atamalarını yap
		Product product = new Product(1,"Telefon",50000);
		// ProductManager nesnesi oluştur. add metoduyla ekle.
		ProductManager productManager = new ProductManager();
		productManager.add(product);
	}

}
