package day60_collection_continue;

import java.util.Stack;

public class StackObjects {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        System.out.println(stack);

        System.out.println("Top of my stack is: "+stack.peek()); //returns whats at the top of your stack -> last element added

        stack.pop(); //this removes the elements at the top of the stack and returns it
        System.out.println(stack);
        System.out.println("Top of my stack is: "+stack.peek()); //returns whats at the top of your stack -> last element added

        System.out.println(stack.pop()); //removes c which is at the top of the stack and returns it
        System.out.println(stack);
        System.out.println(stack.remove(0)); //removing the element from index 0, not following lifo anymore in this method
        System.out.println(stack);



    }


}
