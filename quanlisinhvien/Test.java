import java.util.ArrayList;
import java.util.Scanner;
public class Test{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("So sinh vien: ");
        int N = scanner.nextInt();
        scanner.nextLine();
        SinhVien[] sv = new SinhVien[N];

        for (int i = 0; i < N; i++) {
            sv[i] = new SinhVien();
            System.out.println("Nhap thong tin sinh vien " + i + ":");
            sv[i].nhap();
        }

        System.out.print("\nDanh sach sinh vien:");
        for (SinhVien j:sv) {
            System.out.println(j.toString());
        }

        System.out.println("\nSinh viên có giới tính nữ:");
        for (SinhVien j : sv) {
            if (j.getGioiTinh() == 'F') {
                System.out.println(j.toString());
            }
        }

        System.out.print("\nNhap ten sinh vien can tim: ");
        String tenCanTim = scanner.nextLine();

        boolean found = false;
        for (SinhVien j:sv) {
            if (j.getTen().equalsIgnoreCase(tenCanTim)) {
                System.out.println("Thong tin:");
                System.out.println(j.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Sinh viên không tồn tại trong danh sách.");
        }
    }
}