import java.util.Scanner;
public class Account{
    protected String accountNumber;
    protected String ownerName;
    protected double amount;
    protected String accountType;

    public Account(){}

    public Account(String accountNumber, String ownerName, double amount, String accountType){
        this.accountNumber=accountNumber;
        this.ownerName=ownerName;
        this.amount=amount;
        this.accountType=accountType;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public double getAmount(){
        return amount;
    }

    public String getAccountType(){
        return accountType;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }

    public void setOwnerName(String ownerName){
        this.ownerName=ownerName;
    }

    public void setAmount(double amount){
        this.amount=amount;
    }

    public void setAccountType(String accountType){
        this.accountType=accountType;
    }

    public String toString(){
        return "Account No: " + accountNumber + "\nOwner Name: " + ownerName + "Amount: " + amount + "AccountType" + accountType;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number: ");
        this.accountNumber = sc.nextLine();
        System.out.println("Enter owner name: ");
        this.ownerName = sc.nextLine();
        System.out.println("Enter amount:");
        this.amount = sc.nextDouble();
        sc.nextLine();      
        do{
            System.out.println("Enter AccountType: ");
            this.accountType = sc.nextLine();
            if(accountType.equals("Normal") == false && accountType.equals("Bussiness")==false){
                System.out.println("Error. Enter again");
            }
        }while(accountType.equals("Normal") == false && accountType.equals("Bussiness")==false);
        sc.close();
    }

    public void deposit(double depositAmount){
        if (depositAmount > 0){
            this.amount += depositAmount;
            System.out.println("Successfully deposit. Balance: " + amount);
        }
        else{
            System.out.println("Invalid Number.");
        }
    }

    public void withdraw(double withdrawAmount){
        if(withdrawAmount > 0 && withdrawAmount <= this.amount){
            this.amount = this.amount - withdrawAmount;
            System.out.println("Withdraw Sucessful. Balance:" + this.amount);
        } else{
            System.out.println("Invalid number");
        }
    }
}
