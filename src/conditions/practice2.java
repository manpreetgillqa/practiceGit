package conditions;

public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int areacode = 416;
		
		String location;
		
		switch(areacode) {
		
		case 929: location = "brooklyn";
		break;
		
		case 716: location = "ottawa";
		break; 
		
		case 416: location = "toronto";
		break;
		
		case 215: location = "LA";
		break;
		
		default : location = "incorrect number";
		
		}
		
		System.out.println("This phone call is from " + location);
		
		

	}

}
