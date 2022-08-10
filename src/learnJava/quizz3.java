package learnJava;

public class quizz3 {

	public static void main(String[] args) {
//		4. Given 2 int values greater than 0, return whichever value is nearest to
//				21 without going over. Return 0 if they both go over.
//
//				blackjack(19, 21) → 21
//				blackjack(21, 19) → 21
//				blackjack(19, 22) → 19
		
		/*understand the problem
		 * pattern  =  if (2,4) = 4 , (15,19) = 19 , (16,23) = 16 , (24,25) = 0 
		 * we have two numbers x and y
		 * logic if x > 21 return 0 and if y > 21 return 0
		 * x and y , return the higher number
		 */

		System.out.println(blackjack(18,22));
		
		}
		
		public static int blackjack(int x , int y) {
	
		if (x > 21) x = 0;
		if(y > 21)  y = 0;
		if(x > y) {
			return x;
		}	else {
				return y;	
		}
		
		}
}