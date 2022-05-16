package day58_exceptions.person;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class RecapTry {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("bye");

        try {
            System.out.println(list.get(1));
            String str = null;
            System.out.println(str.toLowerCase());

        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException catch block");
            System.out.println(e.getMessage());
        }catch (NullPointerException e){
            System.out.println("No obj");
            e.printStackTrace();
        }
        System.out.println(list);
        System.out.println();

        try{
            Thread.sleep(-3000);
        }catch(InterruptedException | IllegalArgumentException e){
            System.out.println("wrong numbers");
            System.out.println(e.getMessage());
        }finally{
            System.out.println("last line for the sleep try");
        }
    }
}
