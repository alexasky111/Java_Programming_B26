package day45_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;

public class UseHobby {
    public static void main(String[] args) {
        ArrayList<Hobby> allHobbies = new ArrayList<>(Arrays.asList(
                new Hobby("painting"),
                new Hobby("crafting", 1000.40),
                new Hobby("kayaking", 1200, true, true),
                new Hobby("bicycling", 100, false, false)
        ));
        System.out.println(allHobbies);

        for (Hobby each : allHobbies) {
            each.doIt();
        }
        ArrayList<Hobby> removeOutdoors = new ArrayList<>(allHobbies);

//        removeOutdoors.addAll(Arrays.asList(
//                new Hobby("bicycling", 100, false, false)
//        ));


        removeOutdoors.removeIf(each -> each.isOutdoors == null || each.isOutdoors);
        System.out.println(removeOutdoors);

        ArrayList<Hobby> removeOtherPeople = new ArrayList<>(allHobbies);
        removeOtherPeople.removeIf(each -> each.requiresOthers == null || each.requiresOthers);
        System.out.println(removeOtherPeople);

        System.out.println("+++++++++++++++");
        ArrayList<Hobby> cheap = new ArrayList<>(allHobbies);
        cheap.removeIf(each -> each.annualCost > 500);
        System.out.println(cheap);
    }

}
