package firstProject;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double num1=14.56;
		//int num2=(int)num1;
		//System.out.println(num1+" "+ ""+num2);
		
		//ternary operator , 
		
		// assignment1
		/*String door_No="D089";
		String  street="St. Louis Street";
		String  city="Springfield";
		String code="62729";
		System.out.println("Door No:"+" "+door_No);
		System.out.println("Street:"+" "+street);
		System.out.println("City:"+" "+city);
		System.out.println("ZIP Code:"+" "+code);*/
		
		
		/*String name="Maria Jerome";
		String designation="System Engineer";
		System.out.println("My name is"+" "+name+".");
		System.out.println("My designation is"+" "+designation+".");*/
		
		
		//Selection Control Structure Exercise 1
	/*	int num1=4;
		int num2=4;
		int num3=1;
		if((num1>=num2) && (num1>=num3))
			System.out.println(num1);
		else if((num2>=num1)&&(num2>=num3))
			System.out.println(num2);
		else
			System.out.println(num3);*/
		
		
		
		
		
      // control statement
		// Selection  Control statement Assignment2
		/*int a=1;
		int b=4;
		int c=4;
		int discriminant=b^2-4*a*c;
		int root1=(-b-discriminant)/2*a;
		int root2=(-b+discriminant)/2*a;
		if((b^2-4*a*c)==0)
		System.out.println(root1+""+root2);
		else if((b^2-4*a*c)>0)
			System.out.println(root1+""+root2);
		else
			System.out.println("The Equation has no real roots");*/
			
		
		// assignment3
		/*int number1=6;
		int number2=5;
		int sum=0;
		sum=number1+number2;
		if(number1==number2)
		{
		System.out.println(sum);
		}
		else
		System.out.println(sum*2);*/
		
		//
		
		
		
		//Assignment
		/*int principal=5000;
		int rate=10;
		int time=5; 
		float simple_Interest=(principal*rate*time)/100;
		System.out.println(simple_Interest);*/
		
		
		// data type and operators assignment1
		/*float pi=3.14f;
		int radius= 10;
		float area=pi*radius*radius;// give correct output// not 
		System.out.println(area);*/
		
		// data type and operators assignment2
		
		
		/*int totalCost = 0;
		char wantToAddFoodItem = 'Y';
		int unitPrice = 10;
		int quantity = 1;
		

		while (wantToAddFoodItem == 'Y') {
			totalCost = totalCost + (quantity * unitPrice);
			System.out.println("Order placed successfully");// running infinte loop
			System.out.println("Total cost: " + totalCost);
			System.out.println("Do you want to add one more food item to the order?");
		}
		
		System.out.println("Thank you for ordering the food! It will reach you shortly...");*/
		
		// geomatric sequence assignment
		/*int n=5;
		 int firstTerm = 1;
       int ratio = 2;
       for (int i = 0; i < n; i++) {
           int term = firstTerm * Math.pow(ratio*i);
           System.out.print(term);
			}
       // selection control structure assigment 3*/
   	int a=3;
	
	int b=7;
	int c=8;
	int product=1;
	if(c==7)
	{	
	product=-1;}
	else if(b==7){
	product=c;}
	else if(a==7)
	{
	product=b*c;}
	else
	{
	    product=a*b*c;
	}
	System.out.println(product);
	}
	
	}
	
	


