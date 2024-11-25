public class DaGiac{
    protected int canh;
    protected double kichThuoc[];
    public DaGiac(){
        this.canh= 0;
    }

    public DaGiac(int canh, double kichThuoc[]){
        this.canh=canh;
        this.kichThuoc=kichThuoc;
    }

    public double tinhChuVi(){
        double chuVi=0;
        for (double canh:kichThuoc){
            chuVi += canh;
        }
        return chuVi;
    }

    public void in(){
        System.out.print("So canh cua da giac: ");
            for(double canh : kichThuoc){
                System.out.println(canh + ".");
            }
        System.out.println();
    }
}