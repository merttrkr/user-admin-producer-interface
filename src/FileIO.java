import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;



public class FileIO implements IFileIO{
	private ArrayList<User> users = new ArrayList<User>();
	private ArrayList<Product> products = new ArrayList<>();
	private ArrayList<Complaint> complaints = new ArrayList<>();
	
	public ArrayList<String> getData( String fileName) { //reading csv file
		final String file = fileName;
		 ArrayList<String> data = new ArrayList<String>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
           
            String line = br.readLine();
            while(line != null) {
            	data.add(line);
            	line = br.readLine();
            }
           br.close();
          

            } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
		return data;
       
	}
	
	@Override
	//reads from User.csv and returns all of the created user objects
	public ArrayList<User> getUsers() {
		
		ArrayList<User> users = new ArrayList<User>();
		
		for (int i = 0; i < getData("User.csv").size(); i++) {
			String[] userStrings = getData("User.csv").get(i).split(";"); //parsing
			
			String userName = userStrings[1];
			String password = userStrings[2];
			Credential credential = new Credential(userName,password);
			String displayedName = userStrings[3];
			String userType = userStrings[4];
			switch(userType) {
				case "Customer":{
					Customer customer = new Customer(credential,displayedName);
					users.add(customer);
					}
				case "Producer":{
					Producer producer = new Producer(credential,displayedName);
					users.add(producer);
					}
				case "Admin":{
					Admin admin = new Admin(credential,displayedName);
					users.add(admin);
					}
				}
			}
		  
		return users;
	}

	@Override
	//writes new user into User.csv when a new registration is made(sign up) 
	public boolean addUser(User user) throws IOException {
		FileWriter csvWriter = new FileWriter("User.csv");
	
		    csvWriter.append(String.join(",", user.toString()));
		    csvWriter.append("\n");
		

		csvWriter.flush();
		csvWriter.close();
		return true;
	}

	@Override
	//reads from Product.csv file and returns all of the created objects 
	public ArrayList<Product> getProducts() {
		ArrayList<Product> products = new ArrayList<Product>();
		
		for (int i = 0; i < getData("Product.csv").size(); i++) {
			String[] productStrings = getData("Product.csv").get(i).split(";"); //parsing
			int producerID = Integer.parseInt(productStrings[1]);
			String producerName = productStrings[2];
			String productType = productStrings[3];
			
			Product product = new Product(producerID,producerName,productType);
			products.add(product);
					}
		return products;
	}


	@Override
	//prints product types on the screen 
	public void displayProductTypes() {
		int i = 1;
		for (String string : getProductTypes()) {
			System.out.println(i + " " + string);
			i++;
		}
	}
	
		

	@Override
	//adds product object into Product.csv
	public boolean addproduct(Product product) throws IOException {
		FileWriter csvWriter = new FileWriter("Product.csv");
		
		csvWriter.append(String.valueOf(product.getProductID()));
		csvWriter.append(",");
		csvWriter.append(String.valueOf(product.getProducerID()));
		csvWriter.append(",");
		csvWriter.append(product.getProductName());
		csvWriter.append(",");
		csvWriter.append(product.getProductType());
		csvWriter.append("\n");
		
	   //* csvWriter.append(String.join(",", product.toString())); might work rather than code above
	    //csvWriter.append("\n");
	

	csvWriter.flush();
	csvWriter.close();
	return true;
	}
	
	private ArrayList<String> getProductTypes() {
		ArrayList<String> productType = new ArrayList<String>();
		for (Product product : products) {
			productType.add(product.getProductType());
		}
		return productType;
	}



	@Override
	public boolean addComplaint(Complaint complaint) throws IOException {
		FileWriter csvWriter = new FileWriter("Complaint.csv");
		
		csvWriter.append(String.valueOf(complaint.getComplaintID()));
		csvWriter.append(",");
		csvWriter.append(String.valueOf(complaint.getCustomerID()));
		csvWriter.append(",");
		
		csvWriter.append(String.valueOf(complaint.getProducerID()));
		csvWriter.append(",");
		csvWriter.append(String.valueOf(complaint.getProductID()));
		csvWriter.append(",");
		csvWriter.append(complaint.getTitle());
		csvWriter.append(",");
		csvWriter.append(complaint.getComplaintDetail());
		csvWriter.append(",");
		csvWriter.append(String.valueOf(complaint.getStatus()));
		csvWriter.append("\n");
		
	   

	csvWriter.flush();
	csvWriter.close();
	return true;
		
	}



	
	
}
