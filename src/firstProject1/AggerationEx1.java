package firstProject1;
// in this project we have two  class . first one is customer and second one is address . firstly you should identify 
//which class target and which is dependent class
// in this customer class is depentdent class and address class is target class
// customer has a address
// customer  class  has a reference of address class
class Address{// target class
	private String doorNo;
	private String street;
	private String city;
	private int zipcode;
	Address(String doorNo,String street, String city,int zipcode)
	{
		this.doorNo=doorNo;
		this.street=street;
		this.city=city;
		this.zipcode=zipcode;
	}
	public String getDoorNo()
	{
		return doorNo;
	}
	public void setDoorNo(String doorNo)
	{
		this.doorNo= doorNo;
		
	}
	public String getStreet()
	{
		return street;
	}
	public void setStreet(String street)
	{
		this.street=street;
	}
	public String getCity()
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city=city;
		
	}
	public int getZipcode()
	{
		return zipcode;
	}
	public void setZipcode(int zipcode)
	{
		this.zipcode=zipcode;
	}
}
// dependent class

class Customer1{
	private   int customerId;
	private String customerName;
	private String contactNumber;
	private Address address;
	public Customer1() {
		System.out.println("default constructor");
		this.customerId=customerId;
		this.customerName=customerName;
		this.contactNumber=contactNumber;
		this.address=address;
		
	
	}
	public Customer1(int customerId, String customerName, String contactNumber, Address address) {
		this.customerId =customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	public Customer1(String customerName, String contactNumber, Address address) {
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
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
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void displayCustomerDetails()
	{
		System.out.println("******Displaying Customer Details******");
		System.out.println("Customer Id: " + this.customerId);
		System.out.println("Customer Name: " + this.customerName);
		System.out.println("Contact Number: " +this.contactNumber);
		System.out.println("****Address Details******");
		System.out.println("Door NO : " + address.getDoorNo());
		System.out.println("Street : " + address.getStreet());
		System.out.println("City : " + address.getCity());
		System.out.println("Zip Code: " + address.getZipcode());
		System.out.println();
		
	}
	public double payBill(double totalPrice)
	{
		double discountPercentage =5;
		double deliveryCharge= 100;
		System.out.println("*****Calculating final amount to be paid********");
		double priceAfterDiscount=totalPrice*(1-(discountPercentage/100));
		double finalBillAmount=priceAfterDiscount+deliveryCharge;
		return finalBillAmount;
	}
	
	
}



public class AggerationEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address= new Address("A101","xx87","gkp",2987637);
		Customer1 c= new Customer1(001 ,"john," ,"7820202024",address);
	    c.displayCustomerDetails();
	    double res=c.payBill(30.5);
	    System.out.println(res);
	
	}
}
