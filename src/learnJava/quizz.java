package learnJava;

public class quizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. Given an array of ints, we'll say that a triple is a value appearing 3
//		times in a row in the array. Return true if the array does not contain
//		any triples.
//
//		noTriples([1, 1, 2, 2, 1]) → true
//		noTriples([1, 1, 2, 2, 2, 1]) → false
//		noTriples([1, 1, 1, 2, 2, 2, 1]) → false
		
		int age[]= {1, 1, 2, 2, 1};
		int age1[]= {1, 1, 2, 2, 2, 1};
		int age2[]= {1, 1, 1, 2, 2, 2, 1};
		
		System.out.println(NoTriples(age));
		System.out.println(NoTriples(age1));
		System.out.println(NoTriples(age2));
	 }
	public static boolean NoTriples(int[] numbers) {
		int age[]= numbers;
//		int countofTriples = 0;
		int length = age.length;
		boolean result = true;
		
		for( int i = 0 ; i < length - 2 ; i++) {
			//		System.out.println(age[i] + " ; " +  age[i+1] + " ; " + age [i+2]);
					if ((age[i] == age[i+1])&&(age[i+1] == age[i+2])) {
					result = false;
//					countofTriples++;
			    	break;
					} else {
					result = true;
					}
				}
		return result;
	}
		
}
