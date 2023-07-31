package myfirst;

public class ProductMainO {
public static void main(String[] args) {
	Order order=new Order(1,"noida",7677667);
	Product1 prd=new Product1(10001,"formal pant",1500,order);
	System.out.println("Product details:");
	System.out.println("Id:"+prd.getPrdId());
	System.out.println("Name:"+prd.getPrdName());
	System.out.println("Cost:"+prd.getPrdCost());
	
	Order ord2=prd.getOrder();
	
	System.out.println(ord2.getOrderId());
	System.out.println(ord2.getOrderLocation());
	System.out.println(ord2.getOrderPincode());
}
}
