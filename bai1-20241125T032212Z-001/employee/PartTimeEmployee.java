
import java.util.Scanner;

public class PartTimeEmployee extends Employee implements BonusProvider{
	protected double hourlyRate;
	protected int hoursWorked;
	public PartTimeEmployee() {	
		super();
	}
	
	//contructor
	public PartTimeEmployee(String name, int employeeID, double hourlyRate, int hoursWorked) {
		super(name,employeeID);
		this.hourlyRate=hourlyRate;
		this.hoursWorked=hoursWorked;
	}

	
	public double calculateSalary() {
		return hourlyRate*hoursWorked;
	}

	public double calculateBonus(){
		return calculateSalary() * 0.05;
	}
	
	public String displayInfo() {
		return super.displayInfo() + "\nGio lam:" + hourlyRate + "\nLuong theo gio:" + hoursWorked;
		
	}

	public void nhap(){
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Luong theo gio:");
		this.hourlyRate = sc.nextDouble();
		sc.nextLine();
		System.out.println("Gio lam:");
		this.hoursWorked = sc.nextInt();
	}


}
