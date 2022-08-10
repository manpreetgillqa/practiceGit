package Mystring;

public class MyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x = 1;
		int y = 3;
		
		
		String num1 = "1";
		String num2 = "3";
		
		String name1 = "John";
		String name2 = "Wick";
		
		System.out.println(x+y);
		
		System.out.println(num1+num2);
		
		System.out.println(x+num1);
		
		System.out.println(name1+name2);
		
		System.out.println(name1+" "+name2);
		
		System.out.println(name1 + num1);
		
		String str = "I am starting selenium course";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(26));
		
		System.out.println(str.length());
		
		System.out.println(str.indexOf("s"));
		
		System.out.println(str.lastIndexOf("s"));
		
		System.out.println(str.indexOf("l"));
		
		String str2 = "I am starting selenium course";
		
		System.out.println(str.equals(str2));
		
		String word = " Hello Team ";
		
		System.out.println(word.trim());
		
		System.out.println(word);
		
		String wor = " I am starting selenium course ";
		
		System.out.println(wor.trim());
		
		String hello = "hello world how are you"; //hello,world,how,are,you
		
		String words[] = hello.split(" ");
		
		System.out.println(words[3]);
		
		System.out.println(hello.replace("world" , "team"));
		
		String Hello1 = hello.replace("world","team");
		
		System.out.println(Hello1);
		
		//String manipulation practice
		
		System.out.println(Hello1.toUpperCase());
		
		System.out.println(Hello1.toLowerCase());
		
		System.out.println(Hello1.indexOf("team"));
		
		System.out.println(Hello1.indexOf("Ny"));
		
		// %d is for int , %s is for string , %f is for float 
		
		int age = 29;
		
		String intro = "Manpreet is %d years old";
		
        System.out.println(intro.toUpperCase());
		
		System.out.println(intro.toLowerCase());
		
		System.out.println(intro.length());
		
		System.out.printf(intro,age);
	
		
		
				
				
	}

}
