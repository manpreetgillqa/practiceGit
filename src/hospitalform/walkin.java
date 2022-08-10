package hospitalform;

public class walkin extends patient{
	private  String walkinId;
	private  int walkinDate;


		public void setwalkinId(String walkinId) {
			this.walkinId = walkinId;
		}
		public String getwalkinId() {
			return walkinId;
		}
		
		public void setwalkinDate(int walkinDate) {
			this.walkinDate = walkinDate;
		}
		public int getwalkinDate() {
			return walkinDate;
		}
		
		public void showWalkinData() {
			System.out.println("Patient Name : " + getfname() + " " + getlname());
			System.out.println("Patient Details: ");
			System.out.println("Walkin ID: " + getwalkinId());
		}
		
		
		
}
