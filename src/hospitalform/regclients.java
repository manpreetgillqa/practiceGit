package hospitalform;

public class regclients extends patient{
	private int clientId;
	
	public void setcId(int clientId) {
		this.clientId = clientId;
	}
    public int getcId() {
    	return clientId;
    }
    public void showRegClientData() {
    	System.out.println("Patient Name : " + getfname() + " " + getlname());
		System.out.println("Patient Details: ");
		System.out.println("Client ID: " + getcId());
    }
}


