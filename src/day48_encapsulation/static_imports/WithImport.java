package day48_encapsulation.static_imports;

import my_Utilities.StringUtil;

import java.util.Arrays;
import static java.util.Arrays.*;
import static java.lang.Math.*;
import static my_Utilities.StringUtil.reverse;
//This line imports all the static members from the Array Class

public class WithImport {
    public static void main(String[] args) {
        int [] a = {1,23,44,5,6};
        sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(PI);
        System.out.println(abs(-1)); //is a plus num
        System.out.println(reverse("apple"));
    }
}
