package day19_string;

public class IndexOfMethod {
    public static void main(String[] args) {

        String s = "pen";
        System.out.println(s.indexOf("p")); // give you an index number based on the letter  "p" is 0
        System.out.println(s.indexOf("e"));
        System.out.println(s.indexOf("n"));
        System.out.println(s.indexOf("x")); // returns -1, whenever you use characters that don't exist it gives you -1-hardcoded
        System.out.println(s.indexOf("pe")); // gives you an index where it starts only
        System.out.println(s.indexOf("pz")); // they have to be next to each other, there are no sequence of characters like this






    }
}
