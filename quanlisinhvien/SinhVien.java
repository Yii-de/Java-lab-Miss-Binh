import java.util.Scanner;
class SinhVien extends Nguoi {
    protected String lop;
    protected Truong truong;

    public SinhVien() {
    }

    public SinhVien(String ten, int tuoi, char gioiTinh, String lop, Truong truong) {
        super(ten, tuoi, gioiTinh);
        this.lop = lop;
        this.truong = truong;
    }

    
    public String getLop(){
        return ten;
    }
    public void setLop(String lop){
        this.lop=lop;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        System.out.print("Lop: ");
        this.lop = scanner.nextLine();
        this.truong = new Truong();
        truong.nhapThongTinTruong();
    }

    public String toString() {
        return super.toString() + "\nLop: " + lop + "\nTruong" + truong.toString();
    }
}