package day6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Insurance {
	private int insuranceId;
	private String insuranceName;
	private int insuranceYear;
	private float insurancePremium;
	public Insurance(int insuranceId, String insuranceName, int insuranceYear, float insurancePremium) {
		super();
		this.insuranceId = insuranceId;
		this.insuranceName = insuranceName;
		this.insuranceYear = insuranceYear;
		this.insurancePremium = insurancePremium;
	}
	@Override
	public String toString() {
		return "Insurance [insuranceId=" + insuranceId + ", insuranceName=" + insuranceName + ", insuranceYear="
				+ insuranceYear + ", insurancePremium=" + insurancePremium + "]";
	}
	
	public int getInsuranceId() {
		return insuranceId;
	}
	public String getInsuranceName() {
		return insuranceName;
	}
	public int getInsuranceYear() {
		return insuranceYear;
	}
	public float getInsurancePremium() {
		return insurancePremium;
	}
	public static void displayInsurance(List<Insurance> ins)
	{
		System.out.println();
		for(Insurance insurance:ins)
		{
			System.out.println(insurance);
		}
	}
	
	/*public static void main(String[] args) {
		Insurance insurance[]=new Insurance[4];
		
		insurance[0]=new Insurance(10003,"Naveen kumar",2,45000);
		insurance[1]=new Insurance(10004,"Arvind Kejriwal",3,30000);
		insurance[2]=new Insurance(10002,"Narendra Modi",1,28000);
		insurance[3]=new Insurance(10006,"Nitish Kumar",4,29000);
		
		List<Insurance> insList= Arrays.asList(insurance);
		System.out.println("Unsorted");
		displayInsurance(insList);
		
		Collections.sort(insList, new InsuranceSortById());
		displayInsurance(insList);
		Collections.sort(insList, new InsuranceSortByName());
		displayInsurance(insList);
	}*/
}
class InsuranceMain
{
	public static void displayInsurance(List<Insurance> ins)
	{
		System.out.println();
		for(Insurance insurance:ins)
		{
			System.out.println(insurance);
		}
	}
	public static void main(String[] args) {
Insurance insurance[]=new Insurance[4];
		
		insurance[0]=new Insurance(10003,"Naveen kumar",2,45000);
		insurance[1]=new Insurance(10004,"Arvind Kejriwal",3,30000);
		insurance[2]=new Insurance(10002,"Narendra Modi",1,28000);
		insurance[3]=new Insurance(10006,"Nitish Kumar",4,29000);
		
		List<Insurance> insList= Arrays.asList(insurance);
		System.out.println("Unsorted");
		displayInsurance(insList);
		
		Collections.sort(insList, new Comparator<Insurance>(){

			@Override
			public int compare(Insurance o1, Insurance o2) {
				
				return o1.getInsuranceName().compareTo(o2.getInsuranceName());
			}
			
		});
		System.out.println("after sorted");
		displayInsurance(insList);
		
		Collections.sort(insList, (a,b)->Float.valueOf(a.getInsurancePremium()).compareTo(Float.valueOf(b.getInsurancePremium())));
		
		System.out.println("after sorted using lambda-sortby Insurance premium");
		displayInsurance(insList);
	}
}
class InsuranceSortById implements Comparator<Insurance>
{

	@Override
	public int compare(Insurance o1, Insurance o2) {
		/*if(o1.getInsuranceId()<o2.getInsuranceId())
			return 1;
		else if(o1.getInsuranceId()>o2.getInsuranceId())
			return -1;
		else
		return 0;*/
		return Integer.valueOf(o1.getInsuranceId()).compareTo(Integer.valueOf(o2.getInsuranceId())) ;
	}
	
}

class InsuranceSortByName implements Comparator<Insurance>
{

	@Override
	public int compare(Insurance o1, Insurance o2) {
		// TODO Auto-generated method stub
		return o1.getInsuranceName().compareTo(o2.getInsuranceName());
	}
	
}