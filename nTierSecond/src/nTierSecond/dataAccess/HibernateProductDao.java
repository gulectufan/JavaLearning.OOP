package nTierSecond.dataAccess;

import nTierSecond.entities.Product;

public class HibernateProductDao {
	
	public void add(Product product) {
		System.out.println(product.getName() +" Hibernate ile baglanti gerceklestirildi");
	}
}
