import java.util.Scanner;

public class KhuPho{
    protected int numberOfppl;
    protected int numberOfHome;
    protected Nguoi[] kp;
    public KhuPho(){

    }

    public KhuPho(int numberOfHome, int numberOfppl){
        this.numberOfHome=numberOfHome;
        this.numberOfppl=numberOfppl;
        this.kp=new Nguoi[numberOfppl];
    }
    //getter and setter
    public void setPple(int numberOfppl){
        this.numberOfppl=numberOfppl;
    }
    public void setHome(int numberOfHome){
        this.numberOfHome=numberOfHome;
    }

    public int getPpl(){
        return numberOfppl;
    }
    public int getHome(){
        return numberOfHome;
    }
    public Nguoi[] getThanhVien(){
        return kp;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nha: ");
        this.numberOfHome = sc.nextInt();
        System.out.println("Nhap thanh vien trong ho: ");
        this.numberOfppl = sc.nextInt();
        System.out.println("Nhap thong tin cac thanh vien trong ho.");
        this.kp = new Nguoi[numberOfppl];
        for(int i =0; i<numberOfppl; i++){
            System.out.println("Nhap thong tin cho thanh vien thu " + (i+1) + ":");
            sc.nextLine();
            System.out.println("Ten: ");
            String name = sc.nextLine();
            System.out.println("Nghe nghiep: ");
            String job = sc.nextLine();
            System.out.println("Tuoi: ");
            int tuoi = sc.nextInt();
            kp[i] = new Nguoi(name,job,tuoi);
        }
    }
    public void display(){
        System.out.println("So nha cua ho dan la:" + numberOfHome);
        System.out.println("So thanh vien trong ho: " + numberOfppl);
        for(Nguoi j: kp){
            j.display();
        }
    }

    public void sort(){
        for(Nguoi j: kp){
            if(j!=null && j.getTuoi()==80){
                System.out.println("Nhung nguoi huong tho 80:");
                j.display();
            }
        }
    }
}
