package firstProject1;
class Food{
	private String foodName;
	private String foodType;
	private String cuisine;
	private int unitPrice;
	private int QuantityAvailable;
	
	public Food() {
	}
	public Food(String foodName, String foodType, String cuisine, int unitPrice, int quantityAvailable) {
		super();
		this.foodName = foodName;
		this.foodType = foodType;
		this.cuisine = cuisine;
		this.unitPrice = unitPrice;
		QuantityAvailable = quantityAvailable;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getQuantityAvailable() {
		return QuantityAvailable;
	}
	public void setQuantityAvailable(int quantityAvailable) {
		QuantityAvailable = quantityAvailable;
	}
	public double setUnitPrice(double d) {
		// TODO Auto-generated method stub
		return d;
		
	}
	
	
}
class Order {
	 private int orderId;
	 private  Food[] orderFoods;// here some modification
	 private double totalPrice;
	 private String status;
	 Order()
	 {
		 this.orderId=orderId;
		 this.orderFoods=orderFoods;
		 this.totalPrice=totalPrice;
		 this.status=status;
	 }
	 Order(int orderId,Food[] orderFoods)
	 {
		 this.orderId=orderId;
		 this.orderFoods=orderFoods;
		 this.totalPrice=totalPrice;
		 this.status=status;
		 
	 }
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Food[] getOrderFoods() {
		return orderFoods;
	}
	public void setOrderFoods(Food[] orderFoods) {
		this.orderFoods = orderFoods;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public  double calculateTotalPrice(double paymentMode)// here some modification
	{
		return paymentMode;
	}
	public double calculateTotalPrice(String paymentMode) {
		// TODO Auto-generated method stub
		return 0;
	}
	 
	 

}

 class Bill1 {
	 private static int counter;
	 private String billId;
	 private String paymentMode;
	 private Order order;
	 static {
		 counter=5000;
	 }
	 Bill1(String paymentMode)
	 {
		 this.paymentMode=paymentMode;
	 }
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		Bill1.counter = counter;
	}
	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public boolean generateBill(Order order)
	{
		System.out.println("Bill details \n***********");
		System.out.println("Bill id :" +this.getBillId());
		System.out.println("Items ordered : ");
		for(Food food : order.getOrderFoods())
		{
			System.out.println(food.getFoodName());
		}
		double payableAmount =order.calculateTotalPrice(this.getPaymentMode());
		System.out.println("Pyable Amount : $" + (int)(payableAmount*100)/100.0);
		return true;
		
	}
	 

}
 public class Tester11 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        Food food1= new Food();
			food1.setFoodName("Hamburge");
			food1.setFoodType("Non- Veg");
			food1.setCuisine("American");
			food1.setUnitPrice(3.8);
			food1.setQuantityAvailable(20);
			
			Food food2 = new Food();
			food2.setFoodName("Baked cake");
			food2.setFoodType("Veg");
			food2.setCuisine("American");
			food2.setUnitPrice(20);
			food2.setQuantityAvailable(25);
			
			Food orderdFoods[]= new Food[] {food1,food2};
			Order order = new Order(101, orderdFoods);
			
			Bill1  bi = new Bill1("PayPal");
			bi.generateBill(order);

		}

	}

