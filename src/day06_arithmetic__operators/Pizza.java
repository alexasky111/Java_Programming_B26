package day06_arithmetic__operators;

public class Pizza {
    public static void main(String[] args) {

        String typeOfPizza = "Veggie";
        int numberOfSlices = 8;
        int numberOfPeopleEating = 3;

        System.out.println("We ordered a "+typeOfPizza+" pizza with "+numberOfSlices+" slices, "+numberOfPeopleEating+" people ate 2 slices each with "+(8%3)+" left over");

    }
}
