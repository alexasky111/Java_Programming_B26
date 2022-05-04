package day35_return_method;

public class FixFormat {
    public static void main(String[] args) {
     /*

Fix Format
create a method will accept a String and return a String in proper format. Proper format is:
First character starting as uppercase and the rest as lowercase

      */
    }
    public static String fixFormat(String str){
                //return type    //parameter
        str = str.trim();

        // 1. To pull 1st letter + concatenate w/ the rest of the str
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }
}
