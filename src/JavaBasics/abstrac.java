package JavaBasics;

public class abstrac {

	public static void main(String[] args) {
		Audi a1 = new Audi ();
		a1.start();
		BMW b1 = new BMW ();
		b1.start();
		

	}

}

class Audi extends car {

	@Override
	void start() {
		System.out.println("Audi is starting");
		
	}

	@Override
	void stop() {
		System.out.println("Audi is stopped");
		
	}
	
}
class BMW extends car{

	@Override
	void start() {
		System.out.println("BMW is starting");
		
	}

	@Override
	void stop() {
		System.out.println("BMW is stopped");
		
		
	}
	
}

abstract class car {
	int price;
	 abstract void start();
	abstract void stop();
	void brakes () {
		System.out.println("Car is breaking");
	}
}
