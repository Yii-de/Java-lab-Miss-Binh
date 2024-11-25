
import java.util.Scanner;

public class Motor implements IMotor {
    protected String code; // Mã xe
    protected String name; // Tên loại xe
    protected double capacity; // Dung tích xi lanh
    protected int num; // Kiểu truyền lực là mấy số

    // Constructor
    public Motor(String code, String name, double capacity, int num) {
        this.code = code;
        this.name = name;
        this.capacity = capacity;
        this.num = num;
    }

    public Motor() {
    }

    // Getters and Setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    // Implement methods
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã xe: ");
        code = sc.nextLine();
        System.out.print("Nhập tên xe: ");
        name = sc.nextLine();
        System.out.print("Nhập dung tích xi lanh: ");
        capacity = sc.nextDouble();
        System.out.print("Nhập kiểu truyền lực (số): ");
        num = sc.nextInt();
    }

    public void display() {
        System.out.println("Mã xe: " + code);
        System.out.println("Tên xe: " + name);
        System.out.println("Dung tích xi lanh: " + capacity);
        System.out.println("Kiểu truyền lực (số): " + num);
    }

    public void change() {
        input();
    }
}

