import java.util.Scanner;
public class ATM {
    Scanner sc = new Scanner(System.in);
    public void withdraw(Account ac){
        System.out.println("Enter withdraw amount: ");
        double withdrawAmount = sc.nextDouble();
        sc.nextLine();
        ac.withdraw(withdrawAmount);
    }

    public void deposit(Account ac){
        System.out.println("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();
        sc.nextLine();
        ac.deposit(depositAmount);
    }

    public void viewAccount(Account ac){
        System.out.println("Information:" + ac.toString());
    }
    
    public static void main(String[] args){
        Account ac = new Account();
        System.out.println("Nhap thong tin tai khoan:");
        ac.nhap();
        ATM atm = new ATM();
        atm.viewAccount(ac);
        atm.withdraw(ac);
        atm.deposit(ac);
    }
}
