
import java.util.Scanner;

public class Jupiter extends Motor {
    protected int warranty; // Thời gian bảo hành

    public Jupiter() {
    }

    public Jupiter(String code, String name, double capacity, int num, int warranty) {
        super(code, name, capacity, num);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập thời gian bảo hành (tháng): ");
        warranty = sc.nextInt();
    }

    public void display() {
        super.display();
        System.out.println("Thời gian bảo hành(thang): " + warranty);
    }
}