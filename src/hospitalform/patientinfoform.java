package hospitalform;

public class patientinfoform {

	public static void main(String[] args) {
		walkin WALKIN = new walkin();
		WALKIN.setfname("Mani");
		WALKIN.setlname("GILL");
		WALKIN.setwalkinId("MG");
		
		regclients REGC =  new regclients();
		REGC.setfname("wohoo");
		REGC.setlname("xyz");
		REGC.setcId(123456);
		
		WALKIN.showWalkinData();
		REGC.showRegClientData();
		
		
	}

}
