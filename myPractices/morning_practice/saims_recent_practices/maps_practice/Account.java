package morning_practice.saims_recent_practices.maps_practice;


public class Account {
    /*
    Create a class called Account which maintenance the balance of account
it should allow user to deposit and withdraw money from the account
whenever the balance goes to 0 or below 0 it should display exception -->"SufficientFundNotAvailable";
     */
    double balance;



    public void withdraw(double amountToTakeOut) {

        if (amountToTakeOut > balance) {
            throw new SufficientFundNotAvailable("Balance only has " + balance);
        }

        balance -= amountToTakeOut;
        System.out.println(balance);
    }

    public void deposit(double amountToDeposit) {

        balance += amountToDeposit;
        System.out.println("You have too much money deposited");
    }

}


