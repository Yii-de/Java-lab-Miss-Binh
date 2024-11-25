import java.util.Scanner;
public class Nguoi{
    protected String name;
    protected int cmnd,dob;
    public Nguoi(){

    }
    
    public Nguoi(String name, int cmnd, int dob){
        this.name=name;
        this.cmnd=cmnd;
        this.dob=dob;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setCmnd(int cmnd){
        this.cmnd=cmnd;
    }
    public void setName(int dob){
        this.dob=dob;
    }

    public String getName(){
        return name;
    }
    public int getCmnd(){
        return cmnd;
    }
    public int getDob(){
        return dob;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten nguoi thue:");
        this.name=sc.nextLine();
        System.out.println("CMND: ");
        this.cmnd=sc.nextInt();
        System.out.println("Nam sinh: ");
        this.dob=sc.nextInt();
    }

    public String toString(){
        return "Ten:" + name + "\nCMND: " + cmnd + "\nNam sinh: " + dob;
    }

}