package Day2.entity1;

public class Customer {
	private int customerId;
	private String customerName;
	private String city;
	
	//Default constructor
	public Customer() {
		this.customerId=20;
		this.customerName="diliip";
		this.city="Puducherry";
	}
	
	//Parameterized Constructor
	public Customer(int customerId, String customerName, String city) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.city = city;
	}
    
	//Overloading
	public Customer(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", city=" + city
				+ "]";
	}

	public void setCustomerCity(String city2) {
		// TODO Auto-generated method stub
		
	}
	
}
