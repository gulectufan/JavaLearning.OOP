package nTierThird.dataAccess;

import nTierThird.entities.*;

public class JdbcProductDao implements IProductDao{
	public void add(Product product) {
		System.out.println("Jdbc ile baglanildi");
	}

}
