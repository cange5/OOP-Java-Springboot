package models;

public class BankAccount {
    static String bankName;
    String accountNumber;
    double balance;

    public static void setBankName(String name){
       bankName=name;
    }

    public void deposit(double amount){
        this.balance=amount;
    }

    public double withDraw(double amount){
        if(amount < this.balance){
            this.balance=this.balance-amount;
            System.out.println("Operazione avvenuta con successo!");
            return this.balance;
        }else{
            System.out.println("Non hai abbastanza soldi sul conto!");
            return this.balance;
        }
    }

    public void getAccountInfo(){
        System.out.println(
                "Account Number: " + this.accountNumber + "Balance: " + this.balance + "Name of the Bank: " + bankName
        );
    }
}