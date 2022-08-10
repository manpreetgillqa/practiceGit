package nonprimitive;

public class StringMutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      StringBuffer sbf = new StringBuffer("Navin");
		
	  sbf.append(" Reddy");
	  
	  System.out.println(sbf);
	  
	  sbf.delete(8, 9);
	  
	  System.out.println(sbf);
//	  
//	  sbf.delete(5,10);
//	  
//	  System.out.println(sbf);
//	  
	  
	  
	  
	}

}
