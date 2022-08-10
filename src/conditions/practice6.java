package conditions;

public class practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Airline Ticket
		
		int ticket_price = 200;
		
		String Class ;
		
		    if (ticket_price >= 1000) {
			Class = "Business";
			System.out.println("Traveller flying " + Class);
		    }else if (ticket_price >= 500) {
		    Class = "Premium Economy";
			System.out.println("Traveller flying " + Class);
		    } else {
			Class = "Economy";
			System.out.println("Traveller flying " + Class);
			}
			
		}
		

		

	}

