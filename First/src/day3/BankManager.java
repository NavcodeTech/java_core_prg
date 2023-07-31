package day3;

public class BankManager extends Manager{
	private float pf;
	private float hra;
	public BankManager(int empId, String empName, float empSalary, float pf, float hra) {
		super(empId, empName, empSalary);
		this.pf = pf;
		this.hra = hra;
	}
	
	public float getPf() {
		return pf;
	}

	public float getHra() {
		return hra;
	}

	@Override
	public void ManagerInfo() {
		System.out.println("Bank Manager data");
		System.out.println("Id:"+getEmpId());
		System.out.println("Name:"+getEmpName());
		System.out.println("Salary"+getEmpSalary());
		System.out.println("Pf:"+getPf());
		System.out.println("Hra:"+getHra());
		System.out.println("Gross salary "+((getEmpSalary()-getPf()*getEmpSalary())+
				(getEmpSalary()+getHra()*getEmpSalary())));
		
	}
	
	
	
	
    
}
