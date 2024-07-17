package day6;
class BakeryShop{
	protected String address;
	private  static String[] itemArr= {"Bread","Cookies","Muffins"};// always aviliable jo hmesha same rhega usko static bna do 
	private double[] itemPriceArr= {35.0,60.0,50.0};
	private int reqQuantity;
	private double totalAmount;
	protected String orderId;
	private String reqItem;
	 private static int counter=1;
	public BakeryShop(String address, int reqQuantity, String reqItem) {
		this.address = address;
		this.reqQuantity = reqQuantity;
		this.reqItem = reqItem;
	}
	
	 public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	 
	public double getTotalAmount() {
		return totalAmount;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	

	public String getOrderId() {
		return orderId;
	}

	public void generateOrderId() {
	        //Generate Order id based on first three characters of reqItem in Uppercase
	        this.orderId=this.reqItem.substring(0, 3).toUpperCase()+ BakeryShop.counter++;
	        //BRE1. BRE2, BRE3    
	    }
	    
	    public double identiBakeryItemPrice() {
	        double itemPrice=0.0;
	        for(int index=0;index<BakeryShop.itemArr.length;index++) {
	            if(this.reqItem.equals(BakeryShop.itemArr[index])) {
	                itemPrice=this.itemPriceArr[index];
	                 break;
	            }
	        }
	        if(this.reqQuantity>0) {
	        	
	            itemPrice*=this.reqQuantity;
	            }
	        else
	        {itemPrice=-1.0;
	        }
	        return itemPrice;
	    }	
}

public class CakeShop extends BakeryShop
{
private String reqCake;
private String flavourType;
private int noOfLayers;
public CakeShop(String address, int reqQuantity, String reqItem, String reqCake, String flavourType,
        int noOfLayers)
{
    super(address, reqQuantity, reqItem); // parent Class constructor
    this.reqCake = reqCake;
    this.flavourType = flavourType;
    this.noOfLayers = noOfLayers;
}
public void calculateTotalAmount() {
    String[] cakeArr = { "Red-Velvet", "BlackForest", "IceCream" };
    double[] cakePriceArr = { 340.0, 500.0, 950.0 };
    double cakePrice=0.0;
    if(this.identiBakeryItemPrice()!=-1.0) {
        for(int index=0;index<cakeArr.length;index++) {
            if(this.reqCake.equals(cakeArr[index])) {
                cakePrice=cakePriceArr[index];
                break;
            }
        }
        if(this.noOfLayers>1) {
            cakePrice+=(this.noOfLayers*50.0); // for each layer>1 , it charges 50 rs  //cakePrice=340+150=490
        }
        cakePrice+=this.identiBakeryItemPrice(); //cake
        this.generateOrderId();  // COO1
        this.setTotalAmount(cakePrice);
    }else
    {
        this.setTotalAmount(-1.0);
        this.setOrderId("NA");
    }
       
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Child class reference with Child class object 
        CakeShop cake1=new CakeShop("Bridge Road",2,"Cookies","Red-Velvet","Pineapple",3);
        System.out.println("Shop Address="+cake1.address);
        //Parent class reference with Parent class object 
        //BakeryShop bakery=new BakeryShop("Bridge Road",2,"Cookies"); // Object of Base Class/P
        CakeShop cake2 = new CakeShop("Bridge Road", 3, "Muffins", "IceCream", "Lotus", 1);
        System.out.println("Shop Address=" + cake2.address);      
        // Parent class reference with Parent class object
       // BakeryShop bakery = new BakeryShop("Bridge Road", 2, "Cookies"); // Object of Base Class/Parent
        // Parent class reference with Child class object
       // BakeryShop beakeryShop = new CakeShop("Bridge Road", 2, "Cookies", "Red-Velvet", "Pineapple", 3);
        
        System.out.println("Object1");
        cake1.calculateTotalAmount();
        System.out.println("Total Amount to be Paid "+cake1.getTotalAmount());
        System.out.println("Order Id"+cake1.getOrderId());
        System.out.println("***************************************");
        System.out.println("Object2");
        cake2.calculateTotalAmount();
        System.out.println("Total Amount to be Paid "+cake2.getTotalAmount());
        System.out.println("Order Id"+cake2.getOrderId());
       // System.out.println(bakery.getTotalAmount());
       // bakery.generateOrderId();
       // System.out.println(bakery.orderId);

	}

}
