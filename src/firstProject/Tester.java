package firstProject;
 class Order{
	 int orderId;
	 String orderedFoods;
	 double totalPrice;
	 String status;
	 Order(int id, String food, String s)
	 {
		 orderId=id;
		 orderedFoods=food;
		 status=s;
	 }
	 public double calculateTotalPrice(int unitPrice) 
	 {  
	    int quantity=2;
	    double foodPrice=quantity*unitPrice;//100
	    System.out.println(foodPrice);
	    double gstCharge=foodPrice*(5.0/100.0);//5.0
	    System.out.println(gstCharge);
		 totalPrice=foodPrice+gstCharge;
		 return totalPrice;
		 }
	 }

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String customerType = "Regular";
		int quantity = 2;
		int unitPrice = 10;
		int totalCost = 0;
		int discount = 5;
		totalCost = unitPrice * quantity;
		if (customerType == "Regular") {
			totalCost = totalCost - (totalCost * discount / 100);
			System.out.println("You are a regular customer and eligible for 5% discount");
		}
		System.out.println("Total cost: " + totalCost);*/	
		Order o= new Order(101,"Spinach Alfredo Pasta","Ordered");
		System.out.println("Order Details");
		System.out.println("Order Id:"+" "+o.orderId);
		System.out.println("Ordered Food:"+" "+o.orderedFoods);
		System.out.println("Order Status:"+" "+o.status);
		double res=o.calculateTotalPrice(50);
		System.out.println("Total Price:"+" "+res);

	}

}
