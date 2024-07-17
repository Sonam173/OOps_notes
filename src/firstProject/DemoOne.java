package firstProject;


 class Customer{// create class
	 String customerName= "Sonam";
	 int customerAge= 23;
	 public void display()
	 {
		 System.out.println(customerName);
		 System.out.println(customerAge);
		 }
 }
 
 class Demo{ 
	 public int add(int val1, int val2)//  whatever the argument present in metnod defination/ signature  formal parameter
	 {                                 // pass by value, diff memory location 
		 return val1+val2;
	 }
 }
 





public class DemoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer= new Customer();// create object
		customer.display();
		System.out.println(customer.customerName);//  to access attribute and method we use object
		
		
		Demo demo = new Demo();
		int num1=10;
		int num2=20;
		int res= demo.add(num1, num2);// actual parameter, while calling a method  what ever we pass parameter called 
		System.out.println(res);
		

	}

}
