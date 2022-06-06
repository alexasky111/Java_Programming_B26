package day65_streams;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamMethods2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        List<Integer> byTwo = list.stream().map(e->e*2).collect(Collectors.toList());
        // to use .map() you give some lambda expression
        System.out.println(list);
        System.out.println(byTwo);

        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday","Friday","Saturday","Sunday"));
        List<String> abr = days.stream().map(day -> day.substring(0,3)).collect(Collectors.toList());
        System.out.println(days);
        System.out.println(abr);

        List<Integer> list2 =new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        List<Integer> evens = list2.stream().filter(p->p%2==0).collect(Collectors.toList());
        List<Integer> odds = list2.stream().filter(p->p%2==1).collect(Collectors.toList());
        System.out.println(list2);
        System.out.println(evens);
        System.out.println(odds);

        System.out.println(list2.stream().filter(p->p%2==0).count());
        System.out.println(list2.stream().filter(p->p%2==1).distinct().count()); //finding how many unique even numbers there are

        List<String> str = new ArrayList<>(Arrays.asList("java","javascript", "selenium", "cypress", "jaVa", "hello world", "JAVA"));
        long java = str.stream().filter(word-> {
        word = word.toLowerCase();
        return word.contains("java");
        }).count();
        System.out.println(java);
        System.out.println(str.stream().filter(p->p.toLowerCase().contains("java")).collect(Collectors.toList()));

        System.out.println();
        //forEach
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,7,8,9,6,5));
        list3.stream().filter(p -> p % 2 == 0).forEach(e-> System.out.println(e)); // printing each element
        list3.stream().filter(p -> p % 2 == 0).forEach(System.out::println);

        /*
        .stream(): creating a stream from ny arraylist
        .filter(): only keeping all the even nums in stream
        .forEach(): do an action by on the lambda expression
        lines 46-47 are the same
         */

        List<Integer> list4 = new ArrayList<>(Arrays.asList(5,10,20,25,15));
        System.out.println("Div by 5 "+list4.stream().allMatch(p->p%5==0));
        System.out.println("Even "+list4.stream().allMatch(p->p%2==0));
        System.out.println("More than 30 "+list4.stream().anyMatch(p->p>30));
        System.out.println("More than 20 "+list4.stream().anyMatch(p->p>30));
        System.out.println("More than 20 "+list4.stream().noneMatch(p->p>30));
    }
}
