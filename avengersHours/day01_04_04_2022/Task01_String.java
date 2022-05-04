package day01_04_04_2022;

public class Task01_String {
    public static void main(String[] args) {
          /*
    Write a method that accepts a String (date with time) and creates a timeStamp for your automation report

         String date= "10/10/2022 14:59:00";
          timeStamp(date); // 10102020145900
     */

        String date= "10/10/2022 14:59:00";
        date = date.replace("/",""); //new object created
        System.out.println("1-->"+date);

        date = date.replace(" ", "");  //new object created again
        System.out.println("2-->"+date);
        date = date.replace(":", "");
        System.out.println("3-->"+date);

        System.out.println(timeStamp("10/10/2022 14:59:00"));

    }
    public static String timeStamp(String dateFromUI){
       return dateFromUI = dateFromUI.replace("/","").replace(" ", "").replace(":","");

    }

//    public static String timeStamp(String date){
//        String fixed = "";
//        for (char i = 0; i < date.length(); i++) {
//            char ch = date.charAt(i);
//            if(Character.isDigit(ch)){
//                fixed += ch;
//            }
//        }
//        return fixed;
//    }
}
