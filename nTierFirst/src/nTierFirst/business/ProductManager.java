package nTierFirst.business;

import nTierFirst.dataAccess.JdbcProductDao;
import nTierFirst.entities.Product;

public class ProductManager {
	
	public void add(Product product) throws Exception {
		// iş kuralı
		// exception fırlatılırsa kod durur. dolayısıula görevi else içine yazmaya gerek yoktur. 
		if (product.getUnitPrice()<10) {
			throw new Exception("hata mesajı");
		}
		// görev
		// jdbc nesnesi üret ve o nesneyi jdbc'nin add metoduyla kullan
		JdbcProductDao productDao = new JdbcProductDao();
		productDao.add(product);
	}
}
