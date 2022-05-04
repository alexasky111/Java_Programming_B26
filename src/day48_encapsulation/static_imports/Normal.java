package day48_encapsulation.static_imports;

import my_Utilities.StringUtil;

import java.util.Arrays;

public class Normal {
    public static void main(String[] args) {
        int [] a = {1,23,44,5,6};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        //Math is a Class in Java, it is accessed through a Class, so the var is static
        System.out.println(Math.PI); //--> its in the java.lang package, so it's automatically imported

        System.out.println(StringUtil.reverse("java")); //calling some static m-thods
    }
}
