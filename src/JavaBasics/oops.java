package JavaBasics;

public class oops {

	public static void main(String[] args) {
		// 4 pillars of oops inheritance, encapsulation , polymorphism , abstraction
		
		System.out.println("Whats up dawg ?");
		person p1 = new person();
		p1.age = 29;
		p1.name =  "Manpreet";
		System.out.println(p1.name + " is " + p1.age);
		
		person p2 = new person (30,"Sukh");
//		p2.age = 30;
//		p2.name = "Sukh";
		System.out.println(p2.name + " is "  + p2.age);
		
		p1.walk();
		p1.eat();
		p2.walk();
		p2.eat();
		p1.walk(6000);
		p2.walk(0);
		System.out.println(p2.name + " is lazy");
		System.out.println(person.count);
		
		developer d1 = new developer(29, "Manpreet");
		d1.walk();
		d1.walk(6000);
	

	}
	}
class developer extends person {
	public developer (int age , String name) {	
		super (age,name);
	}
	void walk () {
		System.out.println("Developer " + name +" is walking" );
	}
	void walk(int steps) {
		System.out.println("QA " + name + " walked " + steps + " steps");
	}

}
class qa extends person{
     public qa (int age, String name) {
    	 super (age,name);


}
     
}
class doctor extends person{
	public doctor (int age , String name) {
		super (age, name);
	}
}

     class person {
    	  String name;
    	  int age;
    	static   int count;
    	  
    	  public person() {
    	   count++;
    		  System.out.println("creating an object");
    	  }
    	  
    	  public person (int age , String name) {
    		this.name = name;
    	    this.age = age;
    	  }
    	  
    	  
    	  void walk () {
    		  System.out.println(name +" is walking");
    	  } void eat () {
        	  System.out.println(name +" is eating");  
          }
    	  void walk(int steps) {
    		  System.out.println(name + " walked " + steps +"  Steps");
    	  }
    	  void doWork() {
    		  
    	  }
    	
    	 
    		
    	  
    		  
    		 
        
      
}
