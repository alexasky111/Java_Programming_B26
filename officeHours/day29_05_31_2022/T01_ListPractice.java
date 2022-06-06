package day29_05_31_2022;

import java.util.*;

public class T01_ListPractice {
    public static void main(String[] args) {
        Integer[] nums = {1,2,3,4,5,6,7,8,9};

        System.out.println("Array List");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(nums));
        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.size());

        System.out.println("Linked List");

        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(nums));
        System.out.println(linkedList);
        linkedList.addFirst(0);
        linkedList.addLast(100);

        System.out.println("linkedList.getFirst() = " + linkedList.getFirst());
        System.out.println("linkedList.getLast() = " + linkedList.getLast());
        System.out.println(linkedList.get(0));
        System.out.println(linkedList);

        Vector<Integer> vector = new Vector<>(Arrays.asList(nums));
        System.out.println(vector);
        System.out.println("vector.get(0) = " + vector.get(0));
        System.out.println(vector.size());

        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(nums));
        System.out.println(stack);
        //push()
        stack.push(10);
        System.out.println(stack);

        //pop()
        Integer a = stack.pop(); //removes last element from stack and returns it
        System.out.println(a);

        System.out.println("------difference btw add() and push()------");
        System.out.println(stack.add(11)); //returns true
        System.out.println(stack.push(12)); //returns 12

        //POP() -> removes
        for (int i = 0; i < stack.size(); i++) {
            System.out.println("stack.get(i) = " + stack.pop());
        }
        System.out.println();

    }
}
