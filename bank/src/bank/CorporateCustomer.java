package bank;

public class CorporateCustomer extends Customer{
	// fields
	private String companyName;
	private String taxNumber;
	
	// getters setters
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getTaxNumber() {
		return taxNumber;
	}
	
	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
 }
