package learnJava;

public class quizz4 {

	public static void main(String[] args) {
//		Given 2 non-negative ints, a and b, return their sum, so long as the
//				sum has the same number of digits as a. If the sum has more digits
//				than a, just return a without b.
//
//				sumLimit(2, 3) → 5
//				sumLimit(8, 3) → 8
//				sumLimit(8, 1) → 9
		
		/*understand the problem
		 * pattern sumLimit(1, 3) → 4,sumLimit(5,5) → 5,sumLimit(2, 3) → 5, sumLimit(12,14) → 26,sumLimit(50, 60) → 50......
		 * we have two int variables x and y
		 *  x + y = Sum 
		 *  if sum length = int (x).length , return sum
		 *  else return x
		 */
		
		
		System.out.println(sumLimit(9,3));
	}

	public static int sumLimit(int x , int y ) {


		String str = Integer.toString(x + y);
		String str1 = Integer.toString(x);
		if (str.length() == str1.length()) { 
			return x + y;
		}else {
			return x ;
		}
	}
//	String manpreet = Integer.toString(x + y);
//	String Sabiya = Integer.toString(x);
//	// 5+5 = 10;
//	// converted into string "10"
//	//manpreet.length("10") = 2
//	if((manpreet.length()== Sabiya.length())) {
//		return x + y;
//	}else {
//		return x;
}
