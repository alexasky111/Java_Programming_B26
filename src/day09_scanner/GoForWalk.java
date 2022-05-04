package day09_scanner;

public class GoForWalk {
    public static void main(String[] args) {

        //We want to go for a walk
        // we will go for a walk if it is not raining AND the weather is above 70
        // There is no need to check if it is raining

        boolean isRaining = false;
        int temperature = 60;

        System.out.println(!isRaining & temperature > 70); //I want to go for a walk if it's not raining; No need to check temperature because it's raining

    }
}
