package dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<String, ArrayList<String>> flight = new HashMap<String, ArrayList<String>>();
	        ArrayList<String> a = new ArrayList<String>();
	        a.add("Vishal");
	        a.add("Vinayaka");
	        ArrayList<String> b = new ArrayList<String>();
	        b.add("Aishwarya");
	        b.add("Rani");
	        b.add("Madhuri");
	        flight.put("Pilot", a);
	        flight.put("Airhostess", b);
	        System.out.println(flight);
	        // update value to Maduri to kajol
	        b.set(2,"Kajol");
	        System.out.println(flight);
	        

	}

}
