package constructor;

public class Student {

	public String name;
	public int age;
	public String address;
	// creating a constructor
    // public Student () {      
		
	// parameterizing a constructor
	public	Student (String name, int age, String address) {

		
	// constructor has to be the same name as the class but method cannot be.

	// method has two types - return type and void type
		
	// (this) key work is using to define the parameterized variable with the declared variable.
	this.name = name;	
	this.age = age;
	this.address = address;
	}
	
	// Methods
	
	public void x() {
		System.out.println(name);
	
	}
}
