package ArrayListQuiz;

import java.util.HashSet;

public class quiz13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crate hashSet


        HashSet <String> states = new HashSet<String>();

        states.add("NY");

        states.add("PA");

        states.add("GA");

        states.add("CT");

        states.add("NJ");

        states.add("MA");

        states.add("NH");

        states.add("MN");

        states.add("VT");


        System.out.println ("The HashSet :" + states);


        // Create an array

        String [] states_array = new String [states.size()];
        states.toArray(states_array);

        //Print as an array


        System.out.println ( "States as array elements: " );
        for (String element : states_array) {
            System.out.println(element);
        }

	}

}
