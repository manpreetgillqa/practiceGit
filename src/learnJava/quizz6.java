package learnJava;

public class quizz6 {

	public static void main(String[] args) {
//		Given a string of even length, return a string made of the middle two
//				chars, so the string "string" yields "ri". The string length will be at
//				least 2.
//				middleTwo("string") → "ri"
//				middleTwo("code") → "od"
//				middleTwo("Practice") → "ct"

		/*pattern = middleTwo("string") → "ri"
		 * logic
		 * string length 
		 */
		
		System.out.println(middleTwo("Practice"));
//		String s =  "Code22";
//		int mid = (s.length()/ 2)-1;
//		System.out.println(s.charAt(mid)+"" +s.charAt(mid +1));
		
	}
	
		public static String middleTwo(String str) {
		String s = str;
		int mid = (s.length()/2)-1;
		return s.charAt(mid)+""+s.charAt(mid+1);
	}

}
