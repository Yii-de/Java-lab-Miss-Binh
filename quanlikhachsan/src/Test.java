import java.util.*;
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so phong duoc thue: ");
        n = sc.nextInt();
        KhachSan[] ks = new KhachSan[n];
        for(int i=0; i<n; i++){
            System.out.println("Nhap thong tin cho nguoi thue " + (i+1) + ":");
            ks[i] = new KhachSan();
            ks[i].input();
        }
        System.out.println("Nhap so CMND cua nguoi thue de hien gia tien: ");
        int k = sc.nextInt();
        for(int i=0; i<n; i++){
            if(ks[i].getCmnd() == k){
                System.out.println("Nguoi thue " + (i+1) + " phai tra: " + ks[i].calculatePrice());
            }
        }
    }
}
