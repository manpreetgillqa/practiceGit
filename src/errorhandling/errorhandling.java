package errorhandling;

import java.util.Scanner;

public class errorhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("What is your number ");
		
		try {
		//int n = scan.nextInt();
		int n = scan.nextInt();
		System.out.println(n);
	
		}
		catch ( Exception e) {
		System.out.println("Its an error");
	}
	}
}
		
	/**	try {
			int [] a = {4,5,1};
			System.out.println(a[3]);
		}
		catch (ArrayIndexOutOfBoundsException j) {
			System.out.println("An exception happened");
		}
		}
		
	}**/


