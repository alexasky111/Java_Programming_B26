package day18_string_continue;

public class UpperAndLower {
    public static void main(String[] args) {
        String str = "sNow"; // -> String literal

        System.out.println(str.toUpperCase()); // becomes SNOW
        System.out.println(str.toLowerCase()); // becomes snow
        System.out.println(str); // prints original version

        String word = "HELLO"; // this object does not get changed EVER! -> String literal
        word = word.toLowerCase(); // without assigning it will be again HELLO
        System.out.println(word);
// this is the difference btw primitive and non-primitive -> w/ String it has to make the whole string object, with non-primitive (int, short, long, double, byte, etc) can change the value/object a=4, a=4++ => sout(a)=5
        int a = 4;
        a++;
        a += 5; // it doesn't make the whole another object, it's just adding

        System.out.println(a);
        String word2 = word + "WORLD";
        System.out.println(word2);
        System.out.println(word);

        word += "new text"; // word = word + "next text". It is ALWAYS going to make a new object

        String old = "mark";
        String newValue = old.toUpperCase();
        System.out.println(old);
        System.out.println(newValue);

    }
}
