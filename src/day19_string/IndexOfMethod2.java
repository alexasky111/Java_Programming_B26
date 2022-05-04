package day19_string;

public class IndexOfMethod2 {
    public static void main(String[] args) {
        System.out.println("java");
        String s = "java";
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));

        String s2 = "abcbcb";
        System.out.println(s2.indexOf('b'));
        System.out.println(s2.lastIndexOf('b'));
        System.out.println(s.indexOf("cb")); // gives 2 -> shows only where string starts -> "c"
        System.out.println(s2.indexOf("cbd")); // cbd sequence gives an index -1
        System.out.println('z'); // when characters not in the string, there's no index to it -> gives you -1
    }
}
