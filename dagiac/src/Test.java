import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai cac canh: ");
        double[] canh = new double[3];
        
        for (int i=0; i<3; i++){
            System.out.print("Canh " + (i+1) + ": ");
            canh[i] = sc.nextDouble();
            sc.nextLine();
        }

        TamGiac tg = new TamGiac(canh);
        tg.in();
        System.out.print("Chu vi: " + tg.tinhChuVi());
        if(tg.kiemTra()){
            System.out.print("Dien tich: " + tg.dienTich());
        } else{
            System.out.println("Error.");
        }
        sc.close();
    }
}