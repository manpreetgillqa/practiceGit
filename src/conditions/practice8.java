package conditions;

public class practice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Inventory for a small clothing store

		// F - Female , M - Male , S - Shelf
		        int productID = 105;
		        String descriptionNlocation;
		        switch (productID) {

		        case 101 : descriptionNlocation = "F - Green - S 1 Top";
		        break;

		        case 103 : descriptionNlocation = "M - Brown - S 1 Bottom";
		        break;

		        case 105 : descriptionNlocation = "M - Green - S 1 Middle";
		        break;

		        case 107: descriptionNlocation = "F - Blue - S 2 Bottom";
		        break;

		        default : descriptionNlocation = "Incorrect product ID";

		        }
		        System.out.println(descriptionNlocation);
		    }

	}

