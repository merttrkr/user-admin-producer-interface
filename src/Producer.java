import java.io.IOException;
import java.util.ArrayList;


public class Producer extends User{
	private FileIO fileIO = new FileIO();
	
	

	public Producer( Credential credential, String nameDisplayed) {
		super( credential, nameDisplayed);
		// TODO Auto-generated constructor stub
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
	
	public boolean addproduct(String productType) {
		boolean returntype = false;
		Product product = new Product(getUserID(), getCredential().getUsername(),productType);
		try {
			if (fileIO.addproduct(product)) {
				returntype = true;
				System.out.println("addition successful");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return returntype;
		
	}
	
	
	
		

	


}
