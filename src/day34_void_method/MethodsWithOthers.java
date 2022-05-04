package day34_void_method;


public class MethodsWithOthers {
    public static void main(String[] args) {
        System.out.println(dayInWords(4));

        int [] arr = {5,1,2,3,4};
        System.out.println(firstEvenNumber(arr));
    }
//    public static String dayInWords(int day){
//        String strDay = "";
//        switch (day){
//            case 1:
//                strDay = "Monday";
//                break;
//            case 2:
//                strDay = "Tuesday";
//                break;
//            case 3:
//                strDay = "Wednesday";
//                break;
//            case 4:
//                strDay = "Thursday";
//                break;
//            case 5:
//                strDay = "Friday";
//                break;
//            case 6:
//                strDay = "Saturday";
//                break;
//            case 7:
//                strDay = "Sunday";
//                break;
//            default:
//                strDay = "Invalid";
//        }
//        return strDay;
//    }
public static String dayInWords(int day){
    String strDay = "";

    //Return already stops the method, no need to break;
    switch (day){
        case 1:
            return "Monday";

        case 2:
            return "Tuesday";

        case 3:
            return "Wednesday";

        case 4:
            return "Thursday";

        case 5:
            return "Friday";

        case 6:
            return "Saturday";

        case 7:
            return "Sunday";

        default:
            return "Invalid";
    }

}

public static int firstEvenNumber(int [] nums){
    for (int num : nums) {
        if (num % 2 == 0){
            return num;
        }

    }
    return 0; // I am setting a default, if it is a return method-->must be return value, there's a chance no return value
}



}
