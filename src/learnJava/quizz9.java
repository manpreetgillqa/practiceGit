package learnJava;

public class quizz9 {
	static String first_name;
	static String last_name;
	static String Address;


	public static void main(String[] args) {
	
	records("Manpreet","Gill","Kitchener");
	showrecords();
	System.out.println("===========================================");
	
	records("Sukh","Mann","Brampton");
	showrecords();
	System.out.println("===========================================");
	
	records("Sukha","Dhillon","Malton");
	showrecords();
	System.out.println("===========================================");
	
	records("Vicky","Kandola","Cambridge");
	showrecords();

	}
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
