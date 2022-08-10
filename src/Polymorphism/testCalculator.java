package Polymorphism;

public class testCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculator cal = new calculator ();
		
		cal.add(0, 0);
		cal.add(0, 0, 0);
        
		cal.sub(0, 0);
		cal.sub(0, 0, 0);
		
		modernCalculator mc = new modernCalculator();
		
		mc.add(0, 0);
		mc.add(0, 0, 0);
	}

}
