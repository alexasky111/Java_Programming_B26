package day18_04_2022;

public class UsingBankAcc {
    public static void main(String[] args) {
        BankAccount bankAccount1 =new BankAccount("Alexa Gochak", 123456778885l,110000);

        System.out.println(bankAccount1.accountHolder);
        System.out.println(bankAccount1.accountNum);
        System.out.println(bankAccount1.balance);

        bankAccount1.deposit(20000);
        bankAccount1.deposit(30000);
        System.out.println(bankAccount1.balance);

        bankAccount1.withdraw(20000);
        bankAccount1.withdraw(30000);
        System.out.println(bankAccount1.balance);
        bankAccount1.checkBalance();

        bankAccount1.deposit(0);
        bankAccount1.checkBalance();

        bankAccount1.withdraw(120000);
        bankAccount1.checkBalance();

    }
}
