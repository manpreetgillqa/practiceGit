package learnJava;

public class Country extends contact {
	static int phonenumber;
	static String country;
	
	public static void moredetails (int pnumber,String ctry) {
		phonenumber = pnumber;
		country = ctry;
		
	}
	public static void showmorerecords() {
		System.out.println(phonenumber);
		System.out.println(country);
	}

}
