package interview_tasks.from_generalpdf;

public class Task49 {

    /*
    14 write a program which prints out the numbers from 1 to 30:
 for numbers which are divisible by 3, print "FIN" instead of the number.
for numbers which are divisible by 5, print "RA" instead of the number
for numbers which are a divisible by both 3 and 5, print "FINRA" instead of the number
     */
    public static void main(String[] args) {

        finRa(1,30);
    }

    public static void finRa(int num1, int num2) {

        String res = "";

        for (int i = num1; i < num2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res += "Finra\n";
            } else if (i % 3 == 0) {
                res += "Fin\n";
            } else if (i % 5 == 0) {
                res += "Ra\n";
            } else {
                res += i + "\n";
            }
        }
        System.out.println(res);
    }
}
