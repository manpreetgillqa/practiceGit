package conditions;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int day = 9;
		
		String currentDay;
		
		switch(day) {
		
		case 1: currentDay = "Mon";
		break;
		
		case 2: currentDay = "Tues";
		break;
		
		case 3: currentDay = "Wed";
		break;
		
		case 4: currentDay = "Thurs";
		break;
		
		case 5: currentDay = "Fri";
		break;
		
		case 6: currentDay = "Sat";
		break;
		
		case 7: currentDay = "Sun";
		break;
		
		default: currentDay = "incorrect number";
		
		}
		
		System.out.println("Today is " + currentDay);

		
	}

}
