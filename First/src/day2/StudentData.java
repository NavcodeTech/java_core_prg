package myfirst;

public class StudentData {
    
	private String sname;
	private int sid;
	private String saddress;
	private String cname;
	
	
	public StudentData(int sid,String sname,String saddress,String cname)
	{
		this.sid=sid;
		this.sname=sname;
		this.saddress=saddress;
		this.cname=cname;
	}
	public StudentData(int sid,String sname,String saddress)
	{
		this.sid=sid;
		this.sname=sname;
		this.saddress=saddress;
		this.cname="NIT";
	}
	public void show_details()
	{
		System.out.println("Student details:");
		System.out.println("Student's id:"+sid);
		System.out.println("Student's Name:"+sname);
		System.out.println("Student's address:"+saddress);
		System.out.println("Student's college:"+cname);
	}
	

}
