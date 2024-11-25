public class TamGiac extends DaGiac{
    
    public TamGiac(){
        super();
    }
    public TamGiac(double kichThuoc[]){
        super(3,kichThuoc);
    }

    public boolean kiemTra(){
        double a = kichThuoc[0];
        double b = kichThuoc[1];
        double c = kichThuoc[2];
        return (a+b>c) && (a+c>b) && (b+c>a);
    }

    public double dienTich(){
        if(!kiemTra()){
            System.out.println("Tam giac khong hop le!");
        }
        double a = kichThuoc[0];
        double b = kichThuoc[1];
        double c = kichThuoc[2];
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}