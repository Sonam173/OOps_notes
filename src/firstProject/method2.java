package firstProject;

class Restaurant
{
	String restaurantName;// method assignment 2
	long restaurantContact;
	String restaurantAddress;
	float rating;
	public void displayRestaurantDetails()
	{
		System.out.println("Restaurant Details");
		System.out.println("***************");
		System.out.println("Restaurant Name : " + restaurantName);
		System.out.println("Rating : " + rating);
		System.out.println("Restaurant Contact : " + restaurantContact);
		System.out.println("Restaurant Address : " + restaurantAddress);
		
	}
}

public class method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant r =new Restaurant();
		r.restaurantName="McDonald's";
		r.restaurantContact=9988676767l;
		r.restaurantAddress="SH1109, Caroline Street, Springfield";
		r.rating=4.1f;
		r.displayRestaurantDetails();

	}

}
