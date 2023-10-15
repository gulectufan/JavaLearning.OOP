package bank;

public class IndividualCustomer extends Customer{
	// fields
	private String firstName;
	private String lastName;
	
	// getters and setters
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
