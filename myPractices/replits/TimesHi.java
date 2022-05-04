package replits;

public class TimesHi {
    /*
    Use a loop to count how many times the characters hi are found in the given String str. Only consider the lowercase characters for hi.
     */
    public static void main(String[] args) {
        String str = "ashhd hi nn hi ndls hi";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'h' && str.charAt(i+1)=='i'){
                count++;
            }
        }
        System.out.println(count);
    }


}
