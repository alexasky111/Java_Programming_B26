package day65_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {
        //Creating Streams
        int [] arr = {1,2,3,4,5};
        Arrays.stream(arr);

        List<Integer> list = new ArrayList<>(Arrays.asList(4,5,6,7,8,8,9));

        //distinct() -> removes duplicates, allows to get the unique chars
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4,5,5,6,6,7,7,8,8,9));
        // .stream() -> converts the list to a stream
        // .collect(Collectors.toList()) -> converts the stream back to a list
        System.out.println(list2.stream().distinct().collect(Collectors.toList()));
        System.out.println("Original list: "+list2); //this list didn't change
        //but you can reassign
        //list2 = list2.stream().distinct().collect(Collectors.toList());

        int[] arr2 = {1,2,2,3,5,1,2,2,4,4,5};
        arr2 = Arrays.stream(arr2).distinct().toArray();
        System.out.println(Arrays.toString(arr2));

        System.out.println();
        //skip()
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,20));
        // .skip(4) -> skips 1st 4 elements
        System.out.println(list3.stream().skip(4).collect(Collectors.toList()));
        System.out.println(list3.stream().skip(7).collect(Collectors.toList()));
        //using .skip() with an array
        String [] arr3 = {"java", "hello", "world", "pen", "computer"};
        System.out.println(Arrays.toString(Arrays.stream(arr3).skip(3).toArray()));
        System.out.println();

        //.limit() -> to keep a certain number of elements in the array list
        //Arrays.toArray -> when you have an arr, Arrays.collect(Collectors.toList()) -> when you have a Collection dataType,
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,20));
        System.out.println(list4.stream().limit(6).collect(Collectors.toList()));
        System.out.println(list4.stream().limit(5).skip(3).collect(Collectors.toList()));
        System.out.println(list4.stream().skip(3).limit(4).collect(Collectors.toList()));

        System.out.println();

        //count
        List<Integer> list5 = new ArrayList<>(Arrays.asList(1,1,1,2,3,4,5,6,7,8,9,9,7,8,5));
        System.out.println(list5.stream().count());//counted all the nums in Array List
        System.out.println(list5.stream().distinct().count()); //counted how many unique

        //Task: find how many diff letters there is(no about duplicates)
        String str = "aaaabbbccchhheee";
        //counted how many letters I have not including duplicates and converting into an array right away
        System.out.println(Arrays.stream(str.split("")).distinct().collect(Collectors.toList()));
        System.out.println(Arrays.stream(str.split("")).distinct().count());
        //.collect() - is the one that converts!!! Can also do .toArray()->but it's easier to print w/ Collectors.toList()
        //.distinct() - is the one that finds the unique chars

    }
}
