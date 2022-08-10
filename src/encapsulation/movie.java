package encapsulation;

public class movie {

	private String title;
	
	private String rating;
	
	// getter method
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
	if (rating == "G" || rating == "PG" || rating == "PG-13" || rating == "R") {
		this.rating = rating;
	}else {
		this.rating = "NR";
			
		}
		
	}
	
}
