package conditions;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
	
		int testscore = 100;
		
		char grade;
		
		Scanner Entry1 = new Scanner(System.in);
		System.out.println("Enter Score:");
	
		int score = Entry1.nextInt();              
		System.out.println("You entered " + score);
		
		if(testscore >= 90) {
			grade = 'A';
			System.out.println(grade);
		}
		else if (testscore >= 80) {
			grade = 'B';
			System.out.println(grade);
		} else if (testscore >= 70) {
			grade = 'C';
			System.out.println(grade);
		} else if (testscore >= 60) {
		    grade ='D';
		    System.out.println(grade);
	     } else if (testscore >= 50) {
	    	 grade = 'E';
	    	 System.out.println(grade);
	     } else {
		   grade = 'F';
	     System.out.println(grade);
	}
	}
}
