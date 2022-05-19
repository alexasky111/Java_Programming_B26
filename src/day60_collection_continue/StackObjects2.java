package day60_collection_continue;

import java.util.Stack;

public class StackObjects2 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(40);
        stack.add(20);
        stack.add(100);
        stack.push(30);
        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.peek());

    }
}
