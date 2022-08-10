package HelloWorld;

import inheritance.Human;

public class grandfather extends Human{
	
	public void rich () {
		System.out.println("he got a lot of properties");
		
		communication();
		
		
		
	}
	public static void main (String args[]) {
		grandfather g1 = new grandfather();
		g1.rich();
	}

}
