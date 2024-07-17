package launch;
class Customer{
	Long contactNumber;
	public void updateContact(Customer customer)
	{
		customer.contactNumber=9735790123L;
		System.out.println("Customer contactNumber is updated successfully");
		System.out.println("Updated Contact_Number: " + customer.contactNumber);
	}
}

public class Tester5 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer object= new Customer();// creating customer object
		object.contactNumber=7656434567L;
		System.out.println(object.contactNumber);
		object.updateContact(object);// passing object reference1
	//	System.out.println(object.);

	}

}
