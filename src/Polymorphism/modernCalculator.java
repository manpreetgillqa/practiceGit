package Polymorphism;

public class modernCalculator extends calculator {

	
	// override is when two methods have the same name , same number of parameters and different body.
	
	@Override
	public void add (int a , int b) {
		int total = (a+b)*2;
		System.out.println(total);
	}	
	
	@Override
	public void add(int a , int b , int c) {
		int total = a+b;
		System.out.println(total);
	}	
	
  	@Override
	public void sub(int a , int b) {
	   int total = a - b ;
	   System.out.println(total);
	}	
}



