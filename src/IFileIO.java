import java.io.IOException;
import java.util.ArrayList;

public interface IFileIO {
	public ArrayList<User> getUsers();
	public boolean addUser(User user) throws IOException;
	public ArrayList<Product> getProducts() ;
	public void displayProductTypes();
	public boolean addproduct(Product product) throws IOException;
	public boolean addComplaint(Complaint complaint) throws IOException;
	
	
	
}
