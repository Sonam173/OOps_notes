package dsa;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 Map<String, String> flight = new HashMap<String, String> ();
	        flight.put("PILOT", "Vishal");
	        flight.put("AIRHOSTESS", "Aishwarya");
	        System.out.println(flight);
	        System.out.println("----");
	        //keys
	        //keySet()
	        for(String s: flight.keySet()) {
	            System.out.println(s);
	        }
	        System.out.println("----");
	        //values
	        //values()
	        for(String a: flight.values()) {
	            System.out.println(a);
	        }
	        //Traverse the entire collection
	        //entrySet()
	        System.out.println("----");
	        for(Map.Entry<String, String> b: flight.entrySet()) {
	            System.out.println("Keys:" + b.getKey() +", " + "values:" + b.getValue()+", ");
	        }
	        
	        //replace - key, old , value
	        flight.replace("PILOT", "Vishal", "Aditya");
	        System.out.println(flight);
	        
	        //size
	        System.out.println(flight.size());
	        
	        //values, get
	        System.out.println(flight.get("PILOT"));
	        //to clear
	        //flight.clear();
	//is empty
	        System.out.println(flight.isEmpty());
	    }
	}



	


