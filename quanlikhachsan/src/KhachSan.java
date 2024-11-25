import java.util.Scanner;
public class KhachSan extends Nguoi{
    protected int ngayTro,giaPhong;
    protected String loaiTro;
    public KhachSan(){
        super();
    }
    public KhachSan(String name, int cmnd, int dob, String loaiTro, int ngayTro, int giaPhong){
        super(name,cmnd,dob);
        this.ngayTro = ngayTro;
        this.loaiTro = loaiTro;
        this.giaPhong = giaPhong;
    }
    public void setLoaiTro(String loaiTro){
        this.loaiTro = loaiTro;
    }
    public void setNgayTro(int ngayTro){
        this.ngayTro = ngayTro;        
    }
    public void setGiaPhong(int giaPhong){
        this.giaPhong = giaPhong;

    }

    public String getLoaiTro(){
        return loaiTro;
    }
    public int getNgayTro(){
        return ngayTro;
    }
    public int getGiaPhong(){
        return giaPhong;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhap loai phong: ");
        this.loaiTro=sc.nextLine();
        System.out.println("Nhap ngay tro: ");
        this.ngayTro=sc.nextInt();
        System.out.println("Nhap gia phong: ");
        this.giaPhong=sc.nextInt();
    }

    public double calculatePrice(){
        return ngayTro * giaPhong;
    }

    public String toString(){
        return super.toString() + "\nLoai phong: " + loaiTro + "\nGia phong: " + giaPhong + "\nNgay tro" + ngayTro;
    }
    
}
