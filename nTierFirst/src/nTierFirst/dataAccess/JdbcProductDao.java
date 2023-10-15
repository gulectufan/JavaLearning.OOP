package nTierFirst.dataAccess;

import nTierFirst.entities.Product;

public class JdbcProductDao {
	public void add(Product product) {
		System.out.println(product.getName() + " Jdbc ile baglandi FIRST");
	}
}
