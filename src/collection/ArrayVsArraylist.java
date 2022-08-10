package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayVsArraylist {

	public static void main(String[] args) {

		int arr[] = new int [] {1,2,3,4};
		List <Integer> arrayList = new ArrayList<>();
		
		arrayList.add(5);
		arrayList.add(8);
		
		System.out.println(arrayList);
		 
		 ArrayList <Integer> aList = new ArrayList<>(); 
		 aList.add(9);
		 aList.add(0,15);
		 aList.add(1,20);
		 
		 System.out.println(aList);
		 
		 List<String> animals = new ArrayList<>();
		 
		 animals.add("tiger");
		 animals.add("lion");
		 animals.add("cat");
		 
		 System.out.println(animals);
		 
		 animals.add(2,"dog");
		 
		 System.out.println(animals);

		
		
	}	
	}