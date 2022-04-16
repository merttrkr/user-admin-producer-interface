import java.util.ArrayList;

public class Login implements ILogin{
	
	private FileIO flo = new FileIO();
	private ArrayList<User> users = flo.getUsers();
	

	
	@Override
	public boolean isLoginvalid(Credential inputCredential) {
		for (User user : users) {
			if (user.getCredential().equals(inputCredential)) {
				System.out.println("login successfull");
				return true;
			}
		}
		return false;
	}

}
