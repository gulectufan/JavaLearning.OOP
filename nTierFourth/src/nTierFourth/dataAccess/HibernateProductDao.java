package nTierFourth.dataAccess;

import nTierFourth.entities.*;

public class HibernateProductDao implements IProductDao{
	public void add(Product product) {
		System.out.println("Hibernate ile baglandi");
	}

}
