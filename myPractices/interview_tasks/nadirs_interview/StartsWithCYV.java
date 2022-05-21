package interview_tasks.nadirs_interview;

public class StartsWithCYV {
    public static void main(String[] args) {
        String str = "cyvjdjsksh";
        System.out.println(checkString(str));
    }

    public static boolean checkString(String str){

        return str.startsWith("cyv");
    }
}
