package interview_tasks.mentor_sessions;

public class OddEvenNumbers {
    public static void main(String[] args) {
        checkEvenOrOdd(0);
    }
    public static void checkEvenOrOdd(int num){
        if(num>=0) {
            if (num % 2 == 0) {
                System.out.println("Number is even");
            }else if( num%2==1){
                System.out.println("Number is odd");
            }
        }else{
            System.out.println("Number must be more than 0");
        }
    }
    /*
    Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"
     */


}
