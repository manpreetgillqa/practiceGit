package ClassAndMethods;

public class math2 {
	public static void main(String[] args) {
		
	addition1(2,3);	
	System.out.println(addition2(4,5));
		
	}
	int total;
	// non return method

	public static void addition1 (int a , int b) {
//		int total = a + b;
		System.out.println(a+b);
	}
	
	// return method
	public static int addition2 (int a , int b) {
		int total = a + b;
		return total;
	}
	
//	public int subtraction ( int a , int b ) {
//		int total = a - b ;
//		return total; 
//	}
	
	// return type parameterized method
	public double salary (double baseSalaryPerHour , double regularHours , double overTimeHours , double priceOfTheProduct , double numberOfSales , double commissionsPercentage , double tax) {
	
	double baseSalary = baseSalaryPerHour * regularHours;
	System.out.println("Base Salary is " + baseSalary);
	
	double overTimeSalary = baseSalaryPerHour * 1.5 * overTimeHours;
	System.out.println("OverTime is " + overTimeSalary);
	
	double commissionsEarnings = (numberOfSales * priceOfTheProduct * commissionsPercentage);
	System.out.println("Commission is " + commissionsEarnings);
	
	double grossIncome = (baseSalary + overTimeSalary + commissionsEarnings);
	System.out.println("Gross Income is " + grossIncome);
	
	double netIncome = grossIncome * (1-tax);
	System.out.println("Net Income is " + netIncome * tax);
	
	return netIncome;

	}
	
}
