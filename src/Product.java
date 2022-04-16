import java.util.Random;

public class Product {
	private final int productID = new Random().nextInt(100) ;
	private int producerID;
	private String productName;
	private String productType;
	
	public Product(int producerID,String productName, String productType) {
		this.producerID = producerID;
		this.productName = productName;
		this.productType = productType;
	}
	
	
	
	//getters setters

	public int getProductID() {
		return productID;
	}

	public int getProducerID() {
		return producerID;
	}

	public String getProductName() {
		return productName;
	}

	public String getProductType() {
		return productType;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return producerID + productName+ productType;
	}
	
	
}
