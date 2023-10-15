package nTierSecond.business;

import nTierSecond.dataAccess.*;
import nTierSecond.entities.Product;

public class ProductManager {
	
	public void add(Product product)  throws Exception {
		// iş kuralları
		if (product.getUnitPrice() < 100){
			throw new Exception("Ücret geçersiz"); 
		}
		// görev
		HibernateProductDao productDao = new HibernateProductDao();
		productDao.add(product);
	}
}
