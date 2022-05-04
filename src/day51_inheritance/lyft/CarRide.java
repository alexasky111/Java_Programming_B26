package day51_inheritance.lyft;

import org.w3c.dom.ls.LSOutput;

public class CarRide {

    public static void main(String[] args) {
        Lyft obj1 = new Lyft("James");
        System.out.println(obj1.calculateRate(10));

        LyftXL obj2 = new LyftXL("James");
        System.out.println(obj2.calculateRate(10));
    }

}
