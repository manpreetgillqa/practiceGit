package Quiz;

public class quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
//		double num1 = 25.586;
//		double num2 = 25.589;
//		
//		if(num1 == num2) {
//		System.out.println("They are same");
//		
//	    } else {
//	    System.out.println("They are different");
//	}		
//	}
  	double num1 = 25.586;
	double num2 = 25.589;
	
	// round num1 to third decimal place
	num1 = Math.round(num1 * 1000);
	num1 = num1/1000;
	
	
    // round num2 to third decimal place
	num2 = Math.round(num2 * 1000);
	num2 = num2/1000; 
	
	if(num1 == num2) {
		System.out.println("They are same");
		
	    } else {
	    System.out.println("They are different");
	}		
}	
}
