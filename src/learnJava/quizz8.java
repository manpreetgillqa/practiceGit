package learnJava;

public class quizz8 {
	
	static String fname;
	static String lname;
	static String address;


	public static void main(String[] args) {
		
		record1();
		showrecords();
		
		System.out.println("==============================");
		
		record2();
		showrecords();
		
		System.out.println("==============================");
		
		record3();
		showrecords();
		
		System.out.println("==============================");
		
		record4();
		showrecords();
	}
	public static void record1() {
		fname="manpreet";
		lname="gill";
		address= "Kitchener";	
	}
	public static void record2() {
		fname="sukh";
		lname="mann";
		address= "Brampton";
	}
	public static void record3() {
		fname="sukha";
		lname="dhillon";
		address= "malton";
	}
	public static void record4() {
		fname="vicky";
		lname="kandola";
		address= "cambridge";
	}
	public static void showrecords() {
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(address);
	}
	
		
	
}
