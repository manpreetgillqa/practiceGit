package learnJava;

public class quizz11 {

	public static void main(String[] args) {
//		10. Given a string, return recursively a "cleaned" string where adjacent
//				chars that are the same have been reduced to a single char. So
//				"yyzzza" yields "yza".
//				stringClean("yyzzza") → "yza"
//				stringClean("abbbcdd") → "abcd"
//				stringClean("Hello") → "Helo"

		
		System.out.println(stringClean("j"));
		
		
	}
	
	public static String stringClean(String str) {
		 if (str.length() < 2) return str;
		 if (str.charAt(0) == str.charAt(1))
		 return stringClean(str.substring(1));
		 else
	     return str.charAt(0) + stringClean(str.substring(1));

		
	}

}
