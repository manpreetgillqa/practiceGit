package collection;

import java.util.HashSet;

public class HashsetstoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> h_set = new HashSet <String>();
		
		h_set.add("Red");
		h_set.add("Green");
		h_set.add("Pink");
		h_set.add("Blue");
		h_set.add("Grey");
		h_set.add("White");
		
		System.out.println("Original hashset is " + h_set);
		
		// Create an array
		
		
		String [] new_array =  new String [h_set.size()];
		
		h_set.toArray(new_array);
		
		//Displaying array elements
		
		System.out.println("Array Elements: ");
		
		for(String element: new_array);
		
		System.out.println("element");
		
		for(int i = 0; i < new_array.length;i++) {
		System.out.println(new_array[i] + " ");
		}
		
		
		
		
		
		
		
		
	}

}
