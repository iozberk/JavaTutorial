package inheritance;

public class Customer extends User{
	public String customerName;
	public String customerAddress;
	public String customerEmail;
	public String customerCreditCartInfo;
	public String customerShippingInfo;
	public int customerId;
	
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerCreditCartInfo() {
		return customerCreditCartInfo;
	}
	public void setCustomerCreditCartInfo(String customerCreditCartInfo) {
		this.customerCreditCartInfo = customerCreditCartInfo;
	}
	public int getCustomerId() {
		return customerId;
	}
	
}
