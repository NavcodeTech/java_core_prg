package myfirst;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1=new Product();
		Product product2=new Product(70001,"mobile",12000);
		Product product3=new Product(70002,"bike",18000);		
		Product product4=new Product(70001,"bag",15000);
		Product product5=new Product(70001,"book",2000);
		
		product1.productInfo();
		product2.productInfo();
		product3.productInfo();
		product4.productInfo();
		product5.productInfo();
	}

}
