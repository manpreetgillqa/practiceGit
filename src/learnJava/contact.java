package learnJava;

public class contact {
	static String first_name;
	static String last_name;
	static String Address;

	public static void records(String fname,String lname,String address ) {
	first_name=fname;
	last_name=lname;
	Address=address;
}	
	public static void showrecords() {
	System.out.println(first_name);
	System.out.println(last_name);
	System.out.println(Address);
	}	
}
