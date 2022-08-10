package conditions;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int i = 75;
		char grade;
		if (i <= 75) {
			grade = 'A';
			System.out.println(grade);
			if(i < 75) {
				System.out.println("i is smaller than 75");
			}
		}
		
	}

}
