package learnJava;

public class quizz10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
	System.out.println(nTwice("MANPREET", 3));	
			
	}
	public static String nTwice(String str, int n)
	{	return (str.substring(0, n) + str.substring(str.length()-n));
	}
}

