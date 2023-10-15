package nTierSecond;

import nTierSecond.entities.Product;
import nTierSecond.business.ProductManager;

public class Main{
	public static void main(String[] args) throws Exception{	
		// product üret 
		Product product = new Product();
		product.setId(0);
		product.setName("Tanlet");
		product.setUnitPrice(500);
		// product'ı db'ye bağla
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
	}
}