import java.util.ArrayList;

public class Admin extends User {

	
	public Admin(Credential credential, String nameDisplayed) {
		// TODO Auto-generated constructor stub
		super(credential, nameDisplayed);
	}

	@Override
	public ArrayList<Complaint> displayComplaints() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean changeStatus(Complaint complaint) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
