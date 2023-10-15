package nTierFourth;

import nTierFourth.entities.*;
import nTierFourth.business.*;
import nTierFourth.core.DatabaseLogger;
import nTierFourth.core.FileLogger;
import nTierFourth.core.ILogger;
import nTierFourth.dataAccess.*;

public class Main {

	public static void main(String[] args) throws Exception{
		Product product = new Product(1,"kalem",400);
		ILogger[] loggers = {new FileLogger(), new DatabaseLogger()};
		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product);

	}

}
