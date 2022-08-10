package encapsulation;

public class MovieTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		movie Movie = new movie();
		Movie.setTitle("Top-Gun");
		Movie.setRating("PG-13");
		
		System.out.println(Movie.getTitle());
		System.out.println(Movie.getRating());


	}

}
