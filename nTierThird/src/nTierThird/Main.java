package nTierThird;

import nTierThird.entities.*;
import nTierThird.business.*;
import nTierThird.dataAccess.*;

public class Main {

	public static void main(String[] args) throws Exception{
		
		Product product = new Product(1,"telefon",100);
		
		IProductDao productDao = new JdbcProductDao();
		ProductManager productManager = new ProductManager(productDao);
		productManager.add(product);
		//new ProductManager().add(product);
	}

}
