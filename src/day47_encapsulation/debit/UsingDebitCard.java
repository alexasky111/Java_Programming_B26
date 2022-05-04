package day47_encapsulation.debit;

import day47_encapsulation.debit.DebitCard;

public class UsingDebitCard {
    public static void main(String[] args) {
        //It'll run the static block immediately because the Class was called/used
        System.out.println(DebitCard.accountType);

        DebitCard obj1 = new DebitCard(1234567891011121l, "James", 10000000);

        System.out.println(obj1);
        System.out.println();

        DebitCard obj2 = new DebitCard(123456789, "Ben", 1007800000);
        System.out.println(obj2);

        System.out.println(DebitCard.accountType);//obj2.accountType

        //valid
        DebitCard obj3 = new DebitCard(12345678912233445l, "James","Visa",7000, 100780000);
        System.out.println(obj3);

        //invalid
        DebitCard obj4 = new DebitCard(12345678912233445l, "James","Money",7, 100780000);
        System.out.println(obj4);
    }
}
