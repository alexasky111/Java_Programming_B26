package saims_practices_for_loopsArrayMethod;

public class Task01_Arrays1 {
    public static void main(String[] args) {
        /*
        Ask the user to enter their first name
Convert the name into a char array
print the first and last letter of the name
         */
String name = "Alexandra";
char [] nameArr = name.toCharArray();
String str = new String(nameArr);
        System.out.println(nameArr);
        System.out.println(""+ nameArr[0] + nameArr[nameArr.length-1]);






    }
}
