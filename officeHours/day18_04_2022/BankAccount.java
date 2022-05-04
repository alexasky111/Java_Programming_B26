package day18_04_2022;

public class BankAccount {

    //To create instance variables
    String accountHolder;
    long accountNum;
    double balance;

    //To create a Constructor
    public BankAccount(String accountHolder, long accountNum, double balance) {
        this.accountHolder = accountHolder;
        this.accountNum = accountNum;
        this.balance = balance;
    }

    //To create instance m-thods
    public void deposit(double deposit) {
        if (deposit <= 0) {
            System.err.println("Depositing amount cannot be zero or negative");
        } else {
            balance += deposit;
            System.out.println("Your balance is $" + balance);
        }
    }
    public void withdraw(double withdraw){
        if(withdraw>balance){
            System.err.println("Insufficient balance");
        }else if(withdraw <= 0){
            System.err.println("Withdrawing amount can not be negative or zero");
        }else{
            balance -= withdraw;
            System.out.println("Your balance is $"+balance);
        }
    }

    public void checkBalance(){
        System.out.println("As of today, "+accountNum+" available balance is $"+balance);
    }

    public String toString(){
        return "The balance for a customer: "+accountHolder+" is $"+balance+" of the account number "+accountNum;
    }

}
