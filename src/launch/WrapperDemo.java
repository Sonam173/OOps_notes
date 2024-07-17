package launch;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number=10;
	        Integer value1=new Integer(number); // Autoboxing 
	        System.out.println("value1= "+ value1);
	         
	        Character char1=new Character('A');  // Autoboxing 
	        System.out.println("Char1= "+char1);
	        
	        System.out.println(value1 instanceof Integer);   
	        Integer value2=Integer.valueOf(number); // Autoboxing 
	        System.out.println("value2= "+value2);
	        
	        long number1=23l;
	        Long value3=new Long(number1);
	        System.out.println("value3= "+value3);
	        
	        String numberVal="12345";
	        int numValue=Integer.parseInt(numberVal);
	        float numValue1=Float.parseFloat(numberVal);
	        
	        System.out.println("Number value= "+numValue);
	        System.out.println("Number Value1= "+numValue1);
	         
	        int number4=value1;   // Unboxing 
	        System.out.println("Number4= "+number4);
	}

}
