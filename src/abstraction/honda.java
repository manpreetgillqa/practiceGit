package abstraction;

public class honda extends modernCar implements car, motor {
	
	// these methods are coming from interfaces
	
	public void carShape() {
	
	System.out.println("Aerodynamic with 2 people capacity");
}

public void start() {	
	System.out.println("Let's Drive");
}
public void stop() {	
	System.out.println("need brakes");
}
// This is a honda class method

public void radio() {
	System.out.println("let's play music");
}
public void engine() {
	System.out.println("engine with turbo");
}
public void fuelType() {
	System.out.println("diesel fuel type");
}

	public void hydraulicBrake() {
		System.out.println("Hydraulic brake");
	}
//	public void hydraulicPower() {
//		System.out.println("Hydraulic power");
//	}
	
	public void logo() {
		System.out.println("logo with H");
	}
	
}
