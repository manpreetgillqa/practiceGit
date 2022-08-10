package Quiz;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
/* stringBuffer and stringBuilder are almost the same , the difference between the two is that
 stringBuilder is synchronized and thread safe while stringBuilder is faster.*/	
		
//	 StringBuffer str = new StringBuffer ("Jatt");
		
     StringBuilder str = new StringBuilder ("Jatt");
     
     System.out.println(str);
     
     str.append(" Loves Jatti ");
     
     System.out.println(str);
     
     str.delete(10,16);
     
     System.out.println(str);
     
     str.reverse();
     
     System.out.println(str);
     
     str.reverse();
     
     System.out.println(str);
     
     str.insert(10," Laado");
     
     System.out.println(str);
     
     str.replace(0, 4, "Manpreet");
     
     System.out.println(str);
     
     
	}

}
