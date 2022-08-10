package encapsulation;

public class testMovie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		movie Movie = new movie();
		Movie.setTitle("Avengers");
		Movie.setRating("G");
		
		System.out.println(Movie.getTitle());
		System.out.println(Movie.getRating());

	}

}
