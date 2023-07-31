package day3;

public class WaterBottle {
	private int id;
	private String type;
	private float cost;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getType() {
		return type;
	}
	public float getCost() {
		return cost;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}

	{
		this.id=10002;
		this.type="Steel Bottle";
		this.cost=300;
		
		//System.out.println("Init block 2");
	}
	{
		this.id=10001;
		this.type="Plastic Bottle";
		this.cost=200;
		//System.out.println("Init block1");
	}
	
	public WaterBottle()
	{
		//System.out.println("Constructor");
		this.id=10003;
		this.type="Wooden Bottle";
		this.cost=300;
		
	}
	public static void bottleInfo(WaterBottle w)
	{
		System.out.println("Bottle information");
		System.out.println("Id:"+w.id);
		System.out.println("Type:"+w.type);
		System.out.println("Cost:"+w.cost);
	}
	public static void main(String[] args) {
		WaterBottle w1=new WaterBottle();
		
		bottleInfo(w1);
	}
}

class MyWaterBottle extends WaterBottle
{
	 String location;
	 String state;
	//@Override
	public static void bottleInfo(MyWaterBottle b) {
		System.out.println("Bottle information");
		System.out.println("Id:"+b.getId());
		System.out.println("Type:"+b.getType());
		System.out.println("Cost:"+b.getCost());
		System.out.println("Cost:"+b.location);
		System.out.println("Cost:"+b.state);
	}
}
