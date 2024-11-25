import java.util.Scanner;
public class FullTimeEmployee extends Employee implements BonusProvider{
	protected double monthlySalary;
	public FullTimeEmployee() {
		super();
		this.monthlySalary = 0.0;
		
	}

	public FullTimeEmployee(String name, int employeeID, double monthlySalary){
		super(name,employeeID);
		this.monthlySalary=monthlySalary;
	}
	
	//getter and setter
	
	public double calculateSalary(){
		return monthlySalary;
	}
    

	
    public double calculateBonus(){
		return monthlySalary*0.1;
	}

    public void nhap(){
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Luong thang");
		this.monthlySalary=Double.parseDouble(sc.nextLine());
	}
	public String displayInfo(){
		return super.displayInfo() + "\nLuong thang:" + monthlySalary;
		
	}



}
