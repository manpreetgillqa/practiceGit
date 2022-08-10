package Quiz;

import java.util.ArrayList;
import java.util.List;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // difference between int and integer
		// difference between list and arraylist
		
		List <Integer> ArrayList = new ArrayList <Integer> (5);
		
		for(int i = 1; i <= 10 ; i++) {
		ArrayList.add(i);
		
		}
		
		System.out.println(ArrayList);
		
		ArrayList.remove(3);
		
		System.out.println(ArrayList);
		
		for (int i = 1; i < ArrayList.size() ; i++) {
		System.out.println(ArrayList.get(i)+ " ");
	}
	}
}
