package nTierThird.business;

import nTierThird.dataAccess.*;
import nTierThird.entities.Product;

public class ProductManager {
	private IProductDao productDao;
	
	public ProductManager(IProductDao productDao) {
		this.productDao = productDao;
	}
	
	public void add(Product product) throws Exception {
		if (product.getUnitPrice() < 100) {
			throw new Exception("Birim fiyati olmasi gerekenden dusuk");
		}
		productDao.add(product);
	}
}
