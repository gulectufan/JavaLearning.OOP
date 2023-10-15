package bank;

public class Main {
	public static void main(String[] args) {
//		createIndCustomer(1, "11111", "11111", "tufan", "gulec");
//		createCorCustomer(2, "11112", "11112", "inci", "yildiz");
//		System.out.println("bank works!");

		IndividualCustomer customer1 = new IndividualCustomer();
		customer1.setId(1);
		customer1.setCustomerNumber("20001");
		customer1.setPhone("5XXAAABBCC");
		customer1.setFirstName("");
		customer1.setLastName("");

		CorporateCustomer customer2 = new CorporateCustomer();
		customer2.setId(2);
		customer2.setCustomerNumber("10001");
		customer2.setPhone("");
		customer2.setCompanyName("");
		customer2.setTaxNumber("");
		
		Customer[] customers = {customer1, customer2};
		for (Customer customer : customers) {
			System.out.println(customer.getId());
		}
		
		
		
	}

//	private void createIndCustomer(int id, String customerNumber, String phone, String firstName, String lastName) {
//		IndividualCustomer customer1 = new IndividualCustomer();
//		customer1.setId(id);
//		customer1.setCustomerNumber(customerNumber);
//		customer1.setPhone(phone);
//		customer1.setFirstName(firstName);
//		customer1.setLastName(lastName);
//	}

//	private void createCorCustomer(int id, String customerNumber, String phone, String companyName, String taxNumber) {
//		CorporateCustomer customer2 = new CorporateCustomer();
//		customer2.setId(id);
//		customer2.setCustomerNumber(customerNumber);
//		customer2.setPhone(phone);
//		customer2.setCompanyName(companyName);
//		customer2.setTaxNumber(taxNumber);
//	}

}
