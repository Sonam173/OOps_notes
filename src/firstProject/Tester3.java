package firstProject;
class Customer{
	private static int counter;//declare the static varible counter
	private String customerId;
	private String customerName;
	private Long contactNumber;
	private String address;
	private static float deliveryCharge;
	
	static {// static block
		deliveryCharge=1.5f;
		counter=100;// initializating the static  varible in static block
		}
	public Customer(String customerName, Long contactNumber,String address)
	{
		this.customerId="C" + ++Customer.counter;// given in question customer id start with C101
		this.customerName=customerName;
		this.address=address;
	}
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		Customer.counter = counter;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public static float getDeliveryCharge() {
		return deliveryCharge;
	}
	public static void setDeliveryCharge(float deliveryCharge) {
		Customer.deliveryCharge = deliveryCharge;
	}
	
	public void displayCustomerDetails()
	{
		System.out.println("******Displaying Customer Details******");
		System.out.println("Customer Id: " + customerId);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Contact Number: " + contactNumber);
		System.out.println("Address: " + address);
		System.out.println("Delivery Charge: " + deliveryCharge);
		System.out.println();
	}
	public double payBill(double totalPrice)
	{
		double discountPercentage =5;
		System.out.println("*****Calculating final amount to be paid********");
		double priceAfterDiscount=totalPrice*(1-(discountPercentage/100));
		double finalBillAmount=priceAfterDiscount+Customer.deliveryCharge;
		return finalBillAmount;
		
	}
	
}

public class Tester3 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1 =new Customer("son", 9450932727l, "acleri, styemm");
		Customer customer2 =new Customer("jon", 9450120387l, "acleri, styemm");
		System.out.println(customer1.getAddress());
		System.out.println(customer2.getCustomerId());

	}

}
