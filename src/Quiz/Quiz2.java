package Quiz;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	 int num1 = 25;
	 int num2 = 78;
	 int num3 = 87;
	 
	 if((num1>=num2) && (num1>=num3)) {
		 System.out.println("The greatest number is = "+num1);
	 } else if((num2>=num1) && (num2>=num3)) {
		 System.out.println("The greatest number is = "+num2);
	 } else {
		 System.out.println("The greatest number is = "+num3);
	 }
	 }	
	}

