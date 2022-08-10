package learnJava;

public class quizz14 {

	public static void main(String[] args) {
		
//		String str = "Ha";
//		
//		if ( str.length()==1) {
//			System.out.println(str+str+str);
//			
//		}
//		else {
//			System.out.println(str.substring(0, 2)+str.substring(0, 2)+str.substring(0, 2));
//		}
		
		
//		String x = "Manpreet Gill Jatt";
//		String [] initials = x.split(" ");
//		String temp = "";
//		for (int i = 0 ; i <initials.length ; i++) {
//		temp = temp + (initials[i].charAt(0)+"");
//		System.out.print(temp);
//			
//		}
		
	
		
		
		
		
		

//		String a = "Hello";
//		String b = "Hello";
//		if (a.length()==b.length()) {
//			System.out.println(a+b);
//		}
//		else if (a.length()>b.length()) {
//		System.out.println(a.substring(a.length()-b.length(), a.length())+b);
//		}
//		else {
//			System.out.println(a+b.substring(b.length()-a.length(), b.length()));
//		}
			
	}

	public static String endUp(String str) {
		  if (str.length()<=3) 
		  return str.toUpperCase();
		  String temp = str.substring(0,str.length()-3);
		  String temp1 = str.substring(str.length()-3,str.length()).toUpperCase();
		  return temp + temp1;
		}
	public static String everyNth(String str, int n) {
		  String temp = "";
		  for (int i = 0 ; i <str.length() ; i = i + n) {
		 temp = temp + str.charAt(i);
	}
	return temp;		  
		}
	public static boolean frontAgain(String str) {
		  if(str.substring (0,1).equals (str.substring((str.length()-1),str.length())))
		  return true;
		  return false;
		}
	
	
}
