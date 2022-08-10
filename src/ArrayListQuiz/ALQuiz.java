package ArrayListQuiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

//import java.util.Scanner;

public class ALQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
				ArrayList<String> colors =  new ArrayList<>();
				
				colors.add("Blue");
				colors.add("White");
				colors.add("Brown");
				colors.add("Green");
				colors.add("Orange");
				colors.add("Red");
				
				System.out.println(colors);
	
		//2. Write a Java program to iterate through all elements in a array list.
		
			// for loop for iterations
		//	for (int i = 0 ; i < colors.size() ; i++) {
	    //	System.out.println(colors.get(i));
			
		//	for (String i : colors) {
		//	System.out.println(i);
								
				
			
		
		//3. Write a Java program to insert an element into the array list at the first position.
				
	     	colors.add(0, "Black");
			System.out.println(colors);	
			
		//4. Write a Java program to retrieve an element (at a specified index) from a given array list.

	      System.out.println(colors.get(1));
	      
	    //5. Write a Java program to update specific array element by given element.
	      
	      colors.set(0, "Grey");
	      System.out.println(colors);
	      
	    //6. Write a Java program to remove the third element from a array list.
	      
	      colors.remove(3);
	      System.out.println(colors);
	      
	    //7. Write a Java program to search an element in a array list.
	       
	      System.out.println(colors.contains("Green"));
	      System.out.println(colors.indexOf("Green"));
	      
	    //8. Write a Java program to sort a given array list.
	      
	      Collections.sort(colors);
	      System.out.println(colors);
	      
	    //9. Write a Java program to append the specified element to the end of a hash set.
	      
	      HashSet<String> fruits = new HashSet<String>();
	       
	        fruits.add("Apple");
			fruits.add("Banana");
			fruits.add("Watermelon");
			fruits.add("Kiwi");
			fruits.add("Blueberry");
			fruits.add("Grapes");
			
			System.out.println("This Hashset includes fruits: " +fruits);
			
			// use iterator
			Iterator<String> f = fruits.iterator();
			// use while loop to iterate hash set
			while (f.hasNext()) {
			System.out.println(f.next());
			}
			fruits.add("Orange");
			System.out.println(fruits);
			
	    // 10. Write a Java program to get the number of elements in a hash set.
			
			System.out.println(fruits.size());
	      
	    //  11. Write a Java program to empty an hash set.
	      
			//fruits.clear();
			System.out.println(fruits);
	      

	    // 12. Write a Java program to test a hash set is empty or not.
	      
			System.out.println(fruits.isEmpty());
	      
	    // 13. Write a Java program to convert a hash set to an array.
			
			String [] new_array =  new String [fruits.size()];
			
			fruits.toArray(new_array);
	
			//Displaying array elements
			
			System.out.println("Array Elements: ");
			
			for(String element: new_array);
			
			for(int i = 0; i < new_array.length;i++) {
				
			System.out.println(new_array[i] + " ");
			}
			
			
			
			}
}
			
		//     System.out.println(fruits.toArray());
			
	    //     Object[] f = fruits.toArray();
			
        //	  System.out.println(f[0]);
		      
		      
		//	Object [] froots = fruits.toArray(froots);
		
			
		//	for(int i = 0; i < new_array.length;i++) {
			
		//	System.out.println(new_array[i] + " ");
			
	
	
	

