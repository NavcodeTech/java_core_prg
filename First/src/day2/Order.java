package myfirst;

public class Order {
    private int orderId;
    private String orderLocation;
    private int orderPincode;
    public Order(int orderId, String orderLocation, int orderPincode) {
	super();
	this.orderId = orderId;
	this.orderLocation = orderLocation;
	this.orderPincode = orderPincode;
    }
	public int getOrderId() {
		return orderId;
	}
	public String getOrderLocation() {
		return orderLocation;
	}
	public int getOrderPincode() {
		return orderPincode;
	}


}
