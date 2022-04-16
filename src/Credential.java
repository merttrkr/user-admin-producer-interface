
public class Credential {
	private String username;
	private String password;
	
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public Credential() {
		// TODO Auto-generated constructor stub
	}
	
	public Credential(String username, String password) {
		this.username = username;
		this.password = username;
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Username : " + username+  " Password: " + password;
}
	
	
	

}
