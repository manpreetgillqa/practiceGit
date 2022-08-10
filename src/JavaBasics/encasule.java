package JavaBasics;

public class encasule {

	public static void main(String[] args) {
    laptop l1 = new laptop ();
    l1.setPrice(31);
    System.out.println(l1.getPrice());
    
    
    }

	}

	
	class laptop {
		int ram;
	private	int price;
	public void setPrice(int price) {
	boolean isAdmin = true;
	if(!isAdmin) {
		System.out.println("No access");
	}else{
    this.price = price;
	}		
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	
	
	
	
	}
