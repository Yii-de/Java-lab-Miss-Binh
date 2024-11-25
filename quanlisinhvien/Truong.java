import java.util.Scanner;

class Truong {
    private String ten;
    private String diaChi;
    private String hieuTruong;

    public Truong() {
    }

    public Truong(String ten, String diaChi, String hieuTruong) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.hieuTruong = hieuTruong;
    }

    public void nhapThongTinTruong() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ten truong: ");
        this.ten = scanner.nextLine();
        System.out.print("Dia chi truong: ");
        this.diaChi = scanner.nextLine();
        System.out.print("Hieu truong: ");
        this.hieuTruong = scanner.nextLine();
    }

    public String toString() {
        return "Ten truong: " + ten + "\nDia chi: " + diaChi + "\nHieu truong: " + hieuTruong;
    }
}