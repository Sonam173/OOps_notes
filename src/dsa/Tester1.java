package dsa;

import java.util.LinkedList;
import java.util.List;

class Tester1 {

		public static List<Integer> removeDuplicates(List<Integer> list) {
	        //Implement your logic here and change the return statement accordingly
	        //Implement your logic here and change the return statement accordingly
	        List <Integer> uniqueList = new LinkedList<>();
	        
	        // Iterating over original list (10,15,21,15,10)
	        for(Integer value : list) {
	            //If the value is not present in the unique List, add it
	            if(!uniqueList.contains(value)) {
	                uniqueList.add(value);
	            }
	        }
	        return uniqueList;
		}
		
		public static void main(String args[]) {
			List<Integer> list = new LinkedList<Integer>();
			list.add(10);
			list.add(15);
			list.add(21);
			list.add(15);
			list.add(10);
			
			List<Integer> updatedList = removeDuplicates(list);
			
			System.out.println("Linked list without duplicates");
			for (Integer value : updatedList) {
				System.out.print(value+" ");
			}
		}
		
	}


