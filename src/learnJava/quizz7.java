package learnJava;

public class quizz7 {

	public static void main(String[] args) {
//		Given a string, return true if the first 2 chars in the string also appear
//				at the end of the string, such as with "edited".
//				frontAgain("edited") → true
//				frontAgain("edit") → false
//				frontAgain("ed") → true
		
		/* convert string into 
		 * string indexes , x,x+1,
		 * char.at(x),(x+1) 
		 * for loop then insert if logic
		 * return type method
		 */
//		String x = "abcd";
//		String.valueOf(x);
//		String.valueOf(x+1);
//		for(int i = 0 ; i < x.length() ; i++) {
//		System.out.println(i);
//		}
		
		System.out.println(frontAgain("edited"));
		
		
		
	}
	public static boolean frontAgain(String str){
		String c = str.substring(0,2);
		int x = str.length();
		int y = str.length()-2;
		if (str.length()<2)
			return false;
		if (c.equals(str.substring(y,x)))
			return true;
		else
			return false;
		
		}

}

