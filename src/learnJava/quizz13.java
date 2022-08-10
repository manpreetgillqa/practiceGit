package learnJava;

public class quizz13 {

	public static void main(String[] args) {
		
		System.out.println(generateAirlineCode("Air India", 1352));
		System.out.println(generateAirlineCode("British Airways", 763));
		
		

		    
		    
	}
	public static String generateAirlineCode(String airlineName ,  int airlineID ) {
		String x = airlineName;
	    String[] initials = x.split(" ");
	    String temp = "";
	    for (int i = 0; i < initials.length; i++) {
	    temp = temp +(initials[i].charAt(0)+"") ;
	    }
	    return temp + airlineID;	
	}
	
}

