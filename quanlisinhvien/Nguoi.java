import java.util.Scanner;
class Nguoi {
    protected String ten;
    protected int tuoi;
    protected char gioiTinh;

    public Nguoi(){

    }

    public Nguoi(String ten, int tuoi, char gioiTinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ten: ");
        this.ten = scanner.nextLine();
        System.out.print("Tuoi: ");
        this.tuoi = scanner.nextInt();
        System.out.print("Gioi tinh: ");
        this.gioiTinh = scanner.next().charAt(0);
        scanner.nextLine();
    }

    public void setTen(String ten){
        this.ten=ten;
    }
    public void setTuoi(int tuoi){
        this.tuoi=tuoi;
    }
    public void setGioiTinh(char gioiTinh){
        this.gioiTinh=gioiTinh;
    }

    public String getTen(){
        return ten;
    }

    public int getTuoi(){
        return tuoi;
    }

    public char getGioiTinh(){
        return gioiTinh;
    }
    public String toString() {
        return "Ten: " + ten + "\nTuoi: " + tuoi + "\nGioi tinh: " + gioiTinh;
    }
}