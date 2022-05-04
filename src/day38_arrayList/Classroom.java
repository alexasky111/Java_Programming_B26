package day38_arrayList;

import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {
        // 1. To assign and declare an ArrayList
        ArrayList<String> group = new ArrayList<>();
        System.out.println(group.size());
        group.add("Selo"); // 0
        group.add("Alex"); // 1
        group.add("Eda"); // 2
        group.add("Nav"); // 3
        group.add("Neli"); // 4
        System.out.println(group);
        System.out.println(group.size());
        System.out.println("First student = " + group.get(0));
        System.out.println("Second student = " + group.get(1));
        System.out.println("Third student = " + group.get(2));
        System.out.println("Fourth student = " + group.get(3));
        System.out.println("Fifth student = " + group.get(4));

        System.out.println("=========================================================");
        // 2. To loop through Array List --> size() instead of length()
        for (int i = 0; i < group.size(); i++) {

        // 3. To iterate through Array List one element at a time
            System.out.println("Student " + (i + 1) + " " + group.get(i));
        }
        System.out.println("=========================================================");
        // 4. To loop through w/ For Each Loop
        for ( String student : group ) { // student == group.get(i)
            System.out.println("Student " + student);

        }
    }
}
