package replits;

public class WordsAppearSameTimes {
    /*
    Use a loop to count how many times the characters java and python are found in the given String sentence. Output true if java and python appear the same number of times, otherwise output false.
     */
    public static void main(String[] args) {
        int countJava = 0;
        int countPython = 0;

        String str = "Java is a general-purpose computer-programming language that is concurrent, class-based, object-oriented,[15] and specifically designed to have as few implementation dependencies as possible.";

        for (int i = 0; i < str.length()-5; i++) {
            if(str.substring(i,i+4).equalsIgnoreCase("java")){
                countJava++;
            }
            if(str.substring(i,i+6).equalsIgnoreCase("python")){
                countPython++;
            }
        }
        if(countJava==countPython){
            System.out.println("true");
        }else{
            System.out.println("false");
        }



    }
}
