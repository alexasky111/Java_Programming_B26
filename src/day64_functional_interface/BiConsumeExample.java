package day64_functional_interface;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
public class BiConsumeExample {

    public static void main(String[] args) {
        BiConsumer<String, Integer> printNTimes = (str,n)->{
            for (int i = 0; i < n; i++) {
                System.out.print(str+" ");
            }
        };
        printNTimes.accept("java", 10);
        System.out.println();

        Map<String, Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        // forEach() is a method defined in the map interface which allows you to define the BiConsumer implementation you want to execute with the keys and values. Interally it uses a for each loop to iterate through the entry set
        map.forEach((key, value) -> {
            System.out.println(value + key.length());
        });
    }


}
