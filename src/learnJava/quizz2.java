package learnJava;

public class quizz2 {
	public static void main(String[] args) {
		
//		2. Given a string, return a string made of the chars at indexes
//		0,1, 4,5, 8,9, 12,13, 16,17, 20,21 ... so "kittens" yields "kien".
//
//				altPairs("kitten") → "kien"
//				altPairs("Chocolate") → "Chole"
//				altPairs("CodingHorror") → "Congrr"
		
	/*create a logic 
	 * index(x)+4  ,index (x+1) +4 
	 * execute for loop (x)
	 * start = 0 
	 * end = string length - 4
	 * make a method , name altpairs , taking string as input , print out the string 
	 */
		
//		String letters = "b";
//		String temp = "";
//		for(int x =0; x< letters.length();x = x+4) {
//		//	System.out.println(x);
//		//	System.out.println(x+1);
//			if(letters.length()>2 ) {
//				 temp = temp+letters.charAt(x) + "" + letters.charAt(x+1);	
//			} else {
//        temp = letters;
//		}
//		}
//		System.out.println(temp);	
	
		String str = "kitten";
		String str1 = "Chocolate";
		String str2 = "CodingHorror";
		
//	System.out.println(altPairs(str));
//	System.out.println(altPairs(str1));
//	System.out.println(altPairs(str2));
	}

	// access modifier , static or non static , return type , method name , (input parameters)
	public static String altPairs(String letters) {
		String temp = "";
		for(int x =0; x< letters.length();x = x+4) {
			if(letters.length()>2) { 
				if(x+2 > letters.length()){
					 temp = temp+letters.charAt(x);	
				} else {
					 
				}
				temp = temp+letters.charAt(x) + "" + letters.charAt(x+1);	
			} else {
       temp = letters;
			}
		}
		return temp;
}
}
