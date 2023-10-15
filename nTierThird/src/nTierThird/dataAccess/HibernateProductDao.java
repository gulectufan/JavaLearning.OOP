package nTierThird.dataAccess;

import nTierThird.entities.*;

public class HibernateProductDao implements IProductDao	{
	
	public void add(Product product) {
		System.out.println("Hibernate ile baglanildi");
	}

}
