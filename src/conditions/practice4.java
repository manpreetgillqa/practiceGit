package conditions;

public class practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//NHL player jerseys with String variables
		
		String player_name = "auston";

        int jersey_number;

        switch (player_name) {

        case "john": jersey_number = 91;
        break;

        case "auston": jersey_number = 34;
        break;

        case "mitch": jersey_number = 16;
        break;

        case "connor": jersey_number = 97;
        break;

        case "crosby": jersey_number = 87;
        break;

        default: jersey_number = 0;
        }
        System.out.println( player_name  + "Wears jersey number " + jersey_number);
		
		
	}

}
