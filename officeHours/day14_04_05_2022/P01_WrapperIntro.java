package day14_04_05_2022;

public class P01_WrapperIntro {
    /*
    Task 1 : Please implement this method to return the sum of all integers found in the parameter String.

                    String s="jav45ai1000sgre1at82"
                     result: 45+1000+1+82 ----> 1128
     */
    public static int sumOfDigits(String str) {

        String digits = "0";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {

            if(Character.isDigit(str.charAt(i))){
                digits += str.charAt(i);
            } else {
                sum += Integer.parseInt(digits);
                digits = "0";
            }
        }
       return sum+Integer.parseInt(digits);
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits("jav45ai1000sgre1at82"));
    }
    /*
    for (){
    if(isDigit){
    digits=each;
    } else {
    sum = convert these digits to Int
    reset the digits variable
    }
    }
    System.out.println(sum);
     */

}
