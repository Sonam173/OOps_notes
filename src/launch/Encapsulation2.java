package launch;
class MovieTicket {
	private int movieId;
	private int noOfseats;
	private double costPerTicket;
	
	public MovieTicket(int movieId, int noOfseats) {
		this.movieId = movieId;
		this.noOfseats = noOfseats;
		setCostPerTicket(movieId);
	}
	

	public int getMovieId() {
		return movieId;
	}


	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}


	public int getNoOfseats() {
		return noOfseats;
	}


	public void setNoOfseats(int noOfseats) {
		this.noOfseats = noOfseats;
	}
	


	public double getCostPerTicket() {
		return costPerTicket;
	}
	public void setCostPerTicket(int movieId) {
	        // Set the cost per ticket based on the movieId
	        switch (movieId) {
	            case 111:
	                this.costPerTicket = 7.00;
	                break;
	            case 112:
	                this.costPerTicket =8.00 ;
	                break;
	            case 113:
	                this.costPerTicket = 8.50;
	                break;
	            default:
	                this.costPerTicket = 0.00;
	                break;
	        }
	    }
	public double calculateTotalAmount()
    //Implement your code here 
	{
		// Calculate the total amount before tax
        double totalAmount = this.costPerTicket * this.noOfseats;
        // Calculate the tax amount
        double taxAmount = totalAmount * 0.02;
        // Calculate the total price including tax
        double totalPrice = totalAmount + taxAmount;
        return Math.round(totalPrice);
		
	}
}

public class Encapsulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   MovieTicket movieTicket = new MovieTicket(112, 3);
	        double amount = movieTicket.calculateTotalAmount();
	        if (amount==0)
	            System.out.println("Sorry! Please enter valid movie Id and number of seats");
	        else
	            System.out.println("Total amount for booking : $" + amount);

	}

}
