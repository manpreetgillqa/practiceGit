package Quiz;

import java.util.HashSet;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add("A");
		hashSet.add("B");

		boolean r1 = hashSet.add("C");
		System.out.println(r1);
		hashSet.add("C");
		
		hashSet.remove("A");
		boolean r2 = hashSet.add("C");
		System.out.println(r2);
		hashSet.add("C");
		
		System.out.println("List contains C or not ? "  + hashSet.contains("C"));
		System.out.println(hashSet);
		
		for (String item : hashSet) {
			System.out.println(item);
		}
		

	}

}
