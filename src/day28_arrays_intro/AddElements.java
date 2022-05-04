package day28_arrays_intro;

public class AddElements {
    public static void main(String[] args) {

       int [] numbers = {3,6,10};
        System.out.println("Hardcoded sum: "+ (numbers[0]+numbers[1]+numbers[2])); //only hardcoded
        int sum = 0;
// D Y N A M I C
        for (int i = 0; i < numbers.length; i++) { //Why i < 3 ->   BECAUSE THE LENGTH OF THE ARRAY is THREE ELEMENTS !!!
        sum += numbers[i];
           }
        System.out.println(sum);







    }
}
