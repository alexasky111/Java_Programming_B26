package interview_tasks.from_generalpdf;

public class CountingValleys {

    public static void main(String[] args) {
        String str = "UDDDUDUU";
        int steps = 8;

        System.out.println("countingValleys(steps,str) = " + countingValleys(steps, str));
    }


    public static int countingValleys(int steps, String path) {

        int level = 0;
        int valleys = 0;

        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'U') {
                level++;
            } else if (path.charAt(i) == 'D') {
                if (level == 0) {
                    valleys++;
                }
                level -= 1;
            }
        }
        return valleys;
    }
}
