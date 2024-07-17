package firstProject1;
class Bill{
	private static int counter;
	private String bilId;
	private String paymentMode;
	static
	{
		counter=9000;// static member initialization in static block
	}
	Bill(String paymentMode)
	{
		this.bilId="B" + ++Bill.counter;
		this.paymentMode=paymentMode;
	}
	public String getBillId()
	{
		return bilId;
	}
	 public void setBillId(String billId)
	 {
		 this.bilId=billId;
	 }
	 public String getPaymentMode()
	 {
		 return paymentMode;
	 }
	 public void setPaymentMode(String paymentMode)
	 {
		 this.paymentMode=paymentMode;
	 }
	 public static int getCounter()
	 {
		 return counter;
	 }	
}
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Bill bill1 = new Bill("DebitCard");
	        Bill bill2 = new Bill("PayPal");
	        
	        //Create more objects and add them to the bills array for testing your code
	              
	        Bill[] bills = { bill1, bill2 };// unable to understand why this   is created
	              
	        for (Bill bill : bills) {
	            System.out.println("Bill Details");
	            System.out.println("Bill Id: " + bill.getBillId());
	            System.out.println("Payment method: " + bill.getPaymentMode());
	            System.out.println();
	       }	}}
