package day40_arrayList_continue2;

import java.util.ArrayList;
import java.util.Arrays;

public class JobTitles {
    public static void main(String[] args) {

        ArrayList<String> allJobs = new ArrayList<>();
        allJobs.addAll(Arrays.asList("SDET","Developer", "PO", "CEO","Dev op", "QA","BA", "Chef", "Doctor", "Police Officer", "PO"));

        ArrayList<String> jobs1 = new ArrayList<>(allJobs);
        jobs1.removeAll(Arrays.asList("PO","QA","BA")); //using removeAll method-a bulk method, that removes ALL occurrences of Strings in the argument
        System.out.println(jobs1);

        ArrayList<String> jobs2 = new ArrayList<>(allJobs);
        jobs2.retainAll(Arrays.asList("SDET", "Developer", "Dev op", "PO")); // this bulk method will remain only given String in the argument and remove everything else
        System.out.println(jobs2);

        ArrayList<String> jobs3 = new ArrayList<>(allJobs);
        System.out.println(jobs3.containsAll(Arrays.asList("Chef","CEO")));
        System.out.println(jobs3.containsAll(Arrays.asList("Doctor", "Nurse")));
    }
}
