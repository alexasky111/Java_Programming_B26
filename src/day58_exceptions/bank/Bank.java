package day58_exceptions.bank;

public class Bank {
    double balance;

    public void withdraw(double amountToTakeOut){
        if(amountToTakeOut > balance){
            throw new NotEnoughMoneyException("Balance only has "+balance);
        }
        balance -= amountToTakeOut;
    }
}
