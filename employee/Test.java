import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so nhan vien: ");
		int n;
		try{
			n = sc.nextInt();
			if (n<2||n>5)
				throw new Exception("Nhap trong khoang 2 den 5");
		}catch(Exception e){
			System.out.print(e.getMessage());
			sc.close();
			return;
		}
		System.out.println("Nhap nhan vien Fulltime");
		int k;
		try{
			k = sc.nextInt();
			if (k>n)
				throw new Exception("Error");
		}catch(Exception e){
			System.out.print(e.getMessage());
			sc.close();
			return;
		}
		int h = n - k;
		FullTimeEmployee[] ft = new FullTimeEmployee[k];
		PartTimeEmployee[] pt = new PartTimeEmployee[h];
		System.out.println("Nhan vien Full-time:");
		for (int i = 0; i < k; i++){
			ft[i]= new FullTimeEmployee();
			ft[i].nhap();
			System.out.println(ft[i].displayInfo());
		}
		System.out.println("Nhan vien Part-time:");
		for (int j = 0; j < h; j++){
			pt[j] = new PartTimeEmployee();
			pt[j].nhap();
			System.out.println(pt[j].displayInfo());
		}
		FullTimeEmployee tg;
		System.out.print("Xep theo luong thuong:");
		for(int i = 0; i<k; i++){
			for(int j=i; j<k; j++){
				if(ft[i].calculateSalary() < ft[j].calculateSalary()){
					tg = ft[i];
					ft[i] = ft[j];
					ft[j] = tg;
				}
			}
		}
		for (int i=0; i<k; i++){
			System.out.println("Luong nhan vien full-time" + i + ": ");
			System.out.println(ft[i].calculateSalary());
		}
		System.out.print("Xep theo luong tang ca:");
		for(int i = 0; i<k; i++){
			for(int j=i; j<k; j++){
				if(ft[i].calculateBonus() < ft[j].calculateBonus()){
					tg = ft[i];
					ft[i] = ft[j];
					ft[j] = tg;
				}
			}
		}
		for (int i=0; i<k; i++){
			System.out.println("Luong tang ca nhan vien full-time" + i + ": ");
			System.out.println(ft[i].calculateBonus());
		}

		PartTimeEmployee tmg;
		for(int i = 0; i<k; i++){
			for(int j=i; j<k; j++){
				if(pt[i].calculateSalary() < pt[j].calculateSalary()){
					tmg = pt[i];
					pt[i] = pt[j];
					pt[j] = tmg;
				}
			}
		}
		for (int i=0; i<k; i++){
			System.out.println("Luong nhan vien full-time" + i + ": ");
			System.out.println(pt[i].calculateSalary());
		}
		for(int i = 0; i<k; i++){
			for(int j=i; j<k; j++){
				if(pt[i].calculateBonus() < pt[j].calculateBonus()){
					tmg = pt[i];
					pt[i] = pt[j];
					pt[j] = tmg;
				}
			}
		}
		for (int i=0; i<k; i++){
			System.out.println("Luong tang ca nhan vien full-time" + i + ": ");
			System.out.println(pt[i].calculateBonus());
		}
		System.out.println("Nhap so luong can kiem tra:");
		double sA = 0;
		try{
			sA = sc.nextDouble();
			sc.nextLine();
			if(sA<0)
				throw new Exception("Nhap so duong");
			for (int i= 0; i<k;i++)
				if(sA <= ft[i].calculateSalary()){
					System.out.println(ft[i].name + "co luong lon hon so luong can kiem tra");
				}
			for (int i=0; i<h; i++)
				if(sA <= pt[i].calculateSalary()){
					System.out.println(pt[i].name + "co luong lon hon so luong can kiem tra");
				}
		
		}catch(Exception e){
			System.out.print(e.getMessage());
			sc.close();
		}


	}
		
}


