package interview_tasks.mentor_sessions.part1;

public class LiveFinra {
    /*
    3) Numbers - FINRA
Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */
    public static void main(String[] args) {
        printFinra();

    }

    public static void printFinra() {

            for (int i = 0; i <= 45; i++) {
            if(i==0){
                continue;
            }
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.print("FINRA ");
            } else if (i % 3 == 0) {
                System.out.print("FIN ");
            } else if (i % 5 == 0) {
                System.out.print("RA ");
            } else {
                System.out.print(i + " ");
            }


        }


    }
}
