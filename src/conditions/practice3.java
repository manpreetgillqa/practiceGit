package conditions;

public class practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//NHL player jerseys with int variables
		 
	    int jersey_number = 91;
	    
	    String player_name;
	    
	    switch (jersey_number) {
	    
	    case 91: player_name = "john";
	    break;
	    
	    case 34: player_name = "auston";
	    break;
	    
	    case 16: player_name = "mitch";
	    break;
	    
	    case 97: player_name = "connor";
	    break;
	    
	    case 87: player_name = "crosby";
	    break;
	    
	    default: player_name = "not in NHL";
		}		
		System.out.println("Jersey belongs to " + player_name);
		    
	    }
		

}
