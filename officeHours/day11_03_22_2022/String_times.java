package day11_03_22_2022;

public class String_times {
    public static void main(String[] args) {

        String words = "";
        stringTimes("Hi", 5);

    }

    public static void stringTimes(String word, int num) {
        String str = "";
        for (int i = 0; i < num; i++) {
            str += word;
        }
        System.out.println(str);
    }

}
