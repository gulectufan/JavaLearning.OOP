package nTierSecond.dataAccess;

import nTierSecond.entities.Product;

public class JdbcProductDao {
	// bağlantı kodunu içeren metot
	public void add(Product product) {
		System.out.println("Jdbc ile baglanti gerceklestirildi");
	}
}
