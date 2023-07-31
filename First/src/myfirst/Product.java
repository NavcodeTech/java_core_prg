package myfirst;

public class Product {
	
	int productId;
	String productName;
	float productCost;
	
	public Product()
	{
		super();
		System.out.println("default const");
		productId=80001;
		productName="java begi book";
		productCost=899;
	}
	
	public Product(int productId, String productName,float productCost)
	{
		super();
		System.out.println("overloading const");
		this.productCost=productCost;
		this.productId=productId;
		this.productName=productName;
	}
     
	public void productInfo()
	{
		System.out.println("\nproduct information ");
		System.out.println("\tid : "+productId);
		System.out.println("\tName :  "+productName);
		System.out.println("\tcost  : "+productCost);
	}
	

}
