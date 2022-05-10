package interview_tasks.from_generalpdf;

public class Task14To19 {
    public static void main(String[] args) {
        swapNumbers(10,20);
        int[] arr = new int[100];
        returnDivisibleBy(arr);

        System.out.println(passwordIsValid("asdffg!A"));

    }

    public static String oddOrEven(int n) {
        return (n % 2 == 0 ? "Even" : "Odd");
    }
        /*
    //14 Use String
int a=5;
if number is odd output will be odd, if number is even output will be even
     */

    public static String findARemainder(int a, int b){
        return (a+" divided by "+b+" is: "+a/b+" and remainder is "+a%b);
    }
    /*
    //16  USE WHILE LOOP
int num1=5;
int num2=2;
output
5 devided by 2 is: 2 and remainder is 1
     */
    /*
    //17
int  a = 10;
        int  b  = 20;

        output
      a  20
      b  10
     */

    public static void swapNumbers(int a, int b) {
        a = a + b; //10+20=30
        b = a - b; //30-20=10
        a = a - b; //30-10=20
        System.out.println("a " + a + "\nb " + b);
    }


    public static void returnDivisibleBy(int[] arr) {
        String divBy15 = "";
        String divBy5 = "";
        String divBy3 = "";

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 15 == 0) {
                divBy15 += arr[i] + " ";
            } else if (arr[i] % 5 == 0) {
                divBy5 += arr[i] + " ";
            } else if (arr[i] % 3 == 0) {
                divBy3 += arr[i] + " ";
            } else {
                continue;
            }
        }

        System.out.println(divBy15 + "\n" + divBy5 + "\n" + divBy3);

    }
        /*
        String divisibleBy15 ="";
        String divisibleBy5 ="";
        String divisibleBy3="";

        int[] arr = new int[100];
Divisible By 15: 15 30 45 60 75 90
Divisible By 5: 5 10 20 25 35 40 50 55 65 70 80 85 95 100
Divisible By 3: 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
     */


    public static boolean passwordIsValid(String str) {
        if (str.length() >= 6 && !str.contains(" ")) {
            int countLower = 0;
            int countUpper = 0;
            int countDigits = 0;
            int countSpecial = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    countLower++;
                }
            }

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) >= 'A' && str.charAt(j) <= 'Z') {
                    countUpper++;
                }
            }

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    countDigits++;
                }
            }

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 33 && str.charAt(i) <= 41) {
                    countSpecial++;
                }
            }

            return (countDigits > 0 && countLower > 0 && countUpper > 0 && countSpecial > 0);

        }
        return false;
    }
/*
19
 Write a return method that can verify if a password is valid or not.
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
 */
}
