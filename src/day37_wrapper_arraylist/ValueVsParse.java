package day37_wrapper_arraylist;

public class ValueVsParse {
    public static void main(String[] args) {
        // parse method returns primitive type; valueOf returns object
        String s = "30";
        //To convert String "30" into int number 30
        int seconds = Integer.parseInt(s);
        //To conver the "30" String into the Integer wrapper class object
        Integer.valueOf(s);

        //Still can store it in primitive type it is doing implicit unboxing
        int i2 = Integer.valueOf(s); //==> shouldn't do it
        /*
        Integer.valueOf(s); --> converts the "30" String into the Integer Object
        int i2 = --> im trying to store the value into a primitive variable

        primitive = object type [unboxing]
                 */
        Integer i3 = Integer.parseInt(s);
        /*
        Integer.parseInt(s); --> converts the "30" String into the primitive datatype
        int
        Integer i3 = --> im trying to store the value into an Integer object

        object type = primitive [autoboxing]
                 */
        String s2 = String.valueOf(30);//converts the 30 int to a String
        System.out.println(s2+5); // 305
    }
}
