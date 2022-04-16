import java.util.Random;

public abstract class User implements IUser{
	private final int userID = new Random().nextInt(100) ;
	private Credential credential;
	private String nameDisplayed;
	
	
	public User(Credential credential, String nameDisplayed) {
		
		this.credential = credential;
		this.nameDisplayed = nameDisplayed;
	}
	
	
	public int getUserID() {
		return userID;
	}
	
	public void setCredential(Credential credential) {
		this.credential = credential;
	}

	public void setNameDisplayed(String nameDisplayed) {
		this.nameDisplayed = nameDisplayed;
	}

	public String getNameDisplayed() {
		return nameDisplayed;
	}
	public Credential getCredential() {
		return credential;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return userID + credential.getUsername()+credential.getPassword()+nameDisplayed ;
	}
}
