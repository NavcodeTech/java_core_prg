package myfirst;

public class Product1 {
private int prdId;
private String prdName;
private float prdCost;
private Order order;



public Product1(int prdId, String prdName, float prdCost, Order order) {
	super();
	this.prdId = prdId;
	this.prdName = prdName;
	this.prdCost = prdCost;
	this.order = order;
}
public int getPrdId() {
	return prdId;
}
public String getPrdName() {
	return prdName;
}
public float getPrdCost() {
	return prdCost;
}

public Order getOrder() {
	return order;
}

}
