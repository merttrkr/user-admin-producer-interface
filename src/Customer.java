import java.util.ArrayList;

public class Customer extends User{

	public Customer( Credential credential, String nameDisplayed) {
		super(credential, nameDisplayed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<Complaint> displayComplaints() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	//delete a complaint
	public boolean changeStatus(Complaint complaint) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean addComplaint() {
		return false;
	}
	
	

}
