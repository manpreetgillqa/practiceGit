package learnJava;

public class mentor {

	public static void main(String[] args) {
//		Given a string of even length, return a string made of the middle two
//				   chars, so the string "string" yields "ri". The string length will be at
//				   least 2.
//				   middleTwo("string") → "ri"
//				   middleTwo("code") → "od"
//				   middleTwo("Practice") → "ct"	
	//	System.out.println(middleTwo("Practice"));
		
//		Given 2 non-negative ints, a and b, return their sum, so long as the
//				   sum has the same number of digits as a. If the sum has more digits
//				   than a, just return a without b.
//
//				   sumLimit(2, 3) → 5
//				   sumLimit(8, 3) → 8
//				   sumLimit(8, 1) → 9
		
		System.out.println(sumLimit(12,92));

	}
	
	public static String middleTwo(String str) {
		int mid = str.length()/2-1;
		return str.charAt(mid) + ""+ str.charAt(mid+1);
		
		
	}
	public static int sumLimit(int x , int y) {
		String str = Integer.toString(x+y);
		String str1  = Integer.toString(x);
		if(str.length() == str1.length())
		return x+y;
		else
		{
			return x;
		}
	}
	
}
