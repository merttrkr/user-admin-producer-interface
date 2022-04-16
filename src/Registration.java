import java.io.IOException;

public class Registration {
	private FileIO filewriter;
	private String type;
	private Credential credential;
	private String nameDisplayed;
	
	public Registration(String nameDisplayed, Credential credential,String type) {
		this.nameDisplayed= nameDisplayed;
		this.credential = credential;
		this.type = type;
	}
	
	
	//this method writes new customers or producers in relevent csv files and return true if addition is successful
	public boolean signup() {
		boolean returntype = false;
		filewriter = new FileIO();
		switch (type.toLowerCase()) {
		case "p":
			Producer producer = new Producer(credential, nameDisplayed) ;
			try {
				if (filewriter.addUser(producer)) {
					returntype = true;
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "c":
			Customer customer = new Customer(credential, nameDisplayed);
			System.out.println(customer.getNameDisplayed());
			try {
				if (filewriter.addUser(customer)) {
					returntype = true;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		default:
			break;
		}
		return returntype;
	}

	//getters setters
	public FileIO getFilewriter() {
		return filewriter;
	}

	public String getType() {
		return type;
	}

	public Credential getCredential() {
		return credential;
	}

	public String getNameDisplayed() {
		return nameDisplayed;
	}
}
