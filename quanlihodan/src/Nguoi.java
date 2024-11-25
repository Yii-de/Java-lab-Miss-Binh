import java.util.Scanner;
public class Nguoi{
    protected String name;
    protected String job;
    protected int tuoi;

    public Nguoi(){
    }

    public Nguoi(String name, String job, int tuoi){
        this.name=name;
        this.job=job;
        this.tuoi=tuoi;
    }
    //getter and setter
    public void setName(String name){
        this.name=name;
    }
    public void setJob(String job){
        this.job=job;
    }
    public void setName(int tuoi){
        this.tuoi=tuoi;
    }

    public String getName(){
        return name;
    }
    public String getJob(){
        return job;
    }
    public int getTuoi(){
        return tuoi;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten: ");
        this.name=sc.nextLine();
        System.out.println("Nghe nghiep: ");
        this.job=sc.nextLine();
        System.out.println("Tuoi: ");
        this.tuoi=sc.nextInt();
    }
    public void display(){
        System.out.println("Ten: " + name + "\nNghe nghiep: " + job + "\nTuoi: " + tuoi);
    }
    
}
