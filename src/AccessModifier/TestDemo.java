package AccessModifier;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// object for no access modifier
		TestNoModifier t = new TestNoModifier();
		t.display();
		// we have access in the same class and package only 
		
		
		// object for private access modifier
		TestModifierWithPrivate t1 = new TestModifierWithPrivate();
	    // t1.
		
	}

}
