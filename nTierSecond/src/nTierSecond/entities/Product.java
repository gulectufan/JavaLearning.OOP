package nTierSecond.entities;

public class Product {
	// Product'ın field'lerini tanımla
	
	private int id;
	private String name;
	private double unitPrice;
	
	// constructor ekle içine değer ataması yap
	// eğer standart bir örnek nesne oluşturulursa.
	public Product() {}

	// içi dolu bir constructor oluşturma !!
	
	
	// getter ve setter'larını tanımla
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}
	
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
}
