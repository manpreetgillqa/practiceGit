package collection;

import java.util.HashMap;

public class hmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("a",10);
		map.put("b",20);
		map.put("c",30);
		
		System.out.println("Size of the map is " + map.size());
		
		System.out.println(map);
		
		// getting value for the key
		if(map.containsKey("a")) {
			Integer a = map.get("a");
			System.out.println("Value for Key " +"\"a\" is:" + a );
			
	//	for( Entry <string.Integer> entry: map.entrySet()) {
		//
	//		System.out.println("Key "+ entry.getKey() + " ,Value :" + entry.getValue());
			
			
			
			
			
			}
		
		
		
		
		
		
		
		
	}

}
