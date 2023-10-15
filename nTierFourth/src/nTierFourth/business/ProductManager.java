package nTierFourth.business;

import nTierFourth.entities.*;
import nTierFourth.core.ILogger;
import nTierFourth.dataAccess.*;

public class ProductManager {
	
	private IProductDao productDao;
	private ILogger[] loggers;
	
	public ProductManager(IProductDao productDao, ILogger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}
	
	public void add(Product product) throws Exception {
		if (product.getPrice()<100) {
			throw new Exception("Ücret hatalı"); 
		}
		productDao.add(product);
		for (ILogger logger : loggers) {
			logger.log(" olay gerceklesti ");
		}
	}

}
