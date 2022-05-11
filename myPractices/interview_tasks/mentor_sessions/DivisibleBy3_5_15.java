package interview_tasks.mentor_sessions;

public class DivisibleBy3_5_15 {
    public static void main(String[] args) {

        divisibleBy3_5_15(100);
    }

    public static void divisibleBy3_5_15(int a) {
        String divisibleBy3_5_15 = "Divisible By 15 ";
        String divisibleBy3 = "Divisible By 3 ";
        String divisibleBy5 = "Divisible By 5 ";

        for (int i = 1; i <= a; i++) {
            if (i % 15 == 0) {
                divisibleBy3_5_15 += i + " ";
            } else if (i % 3 == 0) {
                divisibleBy3 += i + " ";
            } else if (i % 5 == 0) {
                divisibleBy5 += i + " ";
            }
        }
        System.out.println(divisibleBy3_5_15);
        System.out.println(divisibleBy5);
        System.out.println(divisibleBy3);
    }
}
    /*
    5) Numbers - Divisible by 3, 5, 15
Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section
ex:
Output:
Divisible By 15 15 30 45 60 75 90
Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
     */



