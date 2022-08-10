package Polymorphism;

public class calculator {
	// two types of polymorphism 
	//overload
	//override
	
	
	//overload : is when two methods have same name but different number of parameters or different data type
	public void add(int a , int b) {
		int total = a+b;
		
		System.out.println(total);
		
	}
	
	public void add(int a , int b , int c) {
		int total = a+b;
		System.out.println(total);
    }
	
	public void sub(int a , int b) {
	int total = a - b ;
	System.out.println(total);
	}
	
	public void sub(int a , int b , int c) {
	int total = a - b - c ;
	System.out.println(total);
	}
	
}
