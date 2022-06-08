package interview_tasks.mentor_sessions.part4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Task025 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed","Alex","Olga"));
        System.out.println(removeAhmed(list));
    }
    /*
25) ArrayList - Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
     */
    public static ArrayList<String> removeAhmed(ArrayList<String> list){

        Iterator<String> it = list.iterator();

        while (it.hasNext()){
            if(it.next().equals("Ahmed")){
                it.remove();
            }
        }

        return list;
    }

}
