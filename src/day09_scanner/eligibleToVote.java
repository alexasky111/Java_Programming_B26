package day09_scanner;

public class eligibleToVote {
 /*
        create and assign these variables:

            name
            are they citizen
            do have criminal background
            age

        determine if they are eligible to vote, they can only vote if they are a citizen, have no criminal background and are about age 18

     */

    public static void main(String[] args) {

        String name = "James Bond";
        boolean isCitizen = true;
        boolean hasCriminalBackground = false;
        int age = 49;

        boolean isEligibleToVote = age >= 18 && isCitizen && !hasCriminalBackground;

                                   // true && true && (!false -> true)
        // I am checking if my age is 18 , citizen, not a criminal, BUT we need IS NOT A CRIMINAL, so we have to use NOT "!"

        System.out.println(name + " is eligible to vote "+ isEligibleToVote);



    }
}
