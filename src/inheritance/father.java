package inheritance;

public class father extends grandfather {
	
	
	protected	int x ;
	public void eyeColor() {

	
		System.out.println("he got blue eyes");
}
	
	public void atheletic () {
		System.out.println("He plays soccer");
	}
	
	public int age() {
		 x = 5 ;
		return x;
	}
	
	public static void main(String[] args) {
		father f = new father();
	
	}
	
}

