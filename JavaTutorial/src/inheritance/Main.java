package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Admin admin = new Admin(1,12345,true);
		
		admin.getUserId();    // From User  Class
		admin.getAdminName(); // From Admin Class
		
		Customer customer = new Customer(1, 123456, true);
		
		customer.enter();
		
	}

}
