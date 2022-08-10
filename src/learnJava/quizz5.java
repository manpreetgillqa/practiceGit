package learnJava;

public class quizz5 {

	public static void main(String[] args) {
//		You have a blue lottery ticket, with ints a, b, and c on it. This makes
//		three pairs, which we'll call ab, bc, and ac. Consider the sum of the
//		numbers in each pair. If any pair sums to exactly 10, the result is 10.
//		Otherwise if the ab sum is exactly 10 more than either bc or ac sums,
//		the result is 5. Otherwise the result is 0.
//
//		blueTicket(8, 3, 0) → 0
//		blueTicket(9, 2, 0) → 0
//		blueTicket(6, 1, 4) → 10
		
		/*  understand the problem
		 *  pattern = blueTicket(9, 1, 0) → 10 , blueTicket(4, 5, 5) → 10 , blueTicket(9, 0, 1) → 10 , blueTicket(10, 0, 0) → 10
		 *  pattern = blueTicket(9, 2, 0) → 0 , blueTicket(6, 4, 2) → 10 , blueTicket(5, 5, 4) → 5 , blueTicket(9, 2, 0) → 0 , blueTicket(3, 2, 4) → 0
		 * 3 variables , a b and c. 
		 * ab or  bc or ac = 10 then 10
		 * if ab = (bc/ac)+10 then 5
		 * if ab/bc/ac != 0 
		 * public static int blueTicket (int a ,int b , int c){ }
		 */
		
		System.out.println(blueTicket(6,2,0));
		System.out.println(blueTicket(6,1,4));
		System.out.println(blueTicket(9,1,0));
		System.out.println(blueTicket(16,5,6));
		

	}
	public static int blueTicket(int a , int b , int c) {
		if ( (a+b == 10) || (b+c == 10) || (a+c == 10)) {
			return 10;
		} else if (((a + b)== (b + c) + 10) || ((a + b) == (a +c) + 10)) {
			return 5;
		} else {
		return 0;
		}
	
	}
	}
