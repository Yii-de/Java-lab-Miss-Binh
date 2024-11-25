import java.util.Scanner;
public abstract class Employee {
		//attributes
		protected String name;
		protected int employeeID;
		
		//contructor
		public Employee() {
			this.name = "";
			this.employeeID=0;
		}
		public Employee(String name, int employeeID) {
			this.name=name;
			this.employeeID= employeeID;
		}

		public abstract double calculateSalary();
		
		public String displayInfo() {
			return "Ten:" + name + "\nID:" + employeeID;
			}
		
		public void nhap(){
			Scanner sc = new Scanner(System.in);
			System.out.println("Ten nhan vien");
			this.name = sc.nextLine();
			System.out.println("ID:");
			this.employeeID = sc.nextInt();
		}
}
