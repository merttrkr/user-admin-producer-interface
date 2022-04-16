import java.util.Random;

public class Complaint {
	private final int complaintID = new Random().nextInt(100) ;
	private int customerID;
	private int producerID;
	private int productID;	
	private String title;
	private String complaintDetail;
	private STATUS status;
	
	public Complaint(String title,String complaintDetail ) {
		// TODO Auto-generated constructor stub
	}
	

	//getters setters

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getComplaintDetail() {
		return complaintDetail;
	}

	public void setComplaintDetail(String complaintDetail) {
		this.complaintDetail = complaintDetail;
	}

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}

	public int getComplaintID() {
		return complaintID;
	}
	public int getCustomerID() {
		return customerID;
	}


	public int getProducerID() {
		return producerID;
	}


	public int getProductID() {
		return productID;
	}

	
}
