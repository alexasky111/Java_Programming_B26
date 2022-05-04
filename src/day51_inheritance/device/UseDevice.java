package day51_inheritance.device;

import org.w3c.dom.ls.LSOutput;

public class UseDevice {

    public static void main(String[] args) {
        TV obj1 = new TV("LG","original", 100.50,true);
        System.out.println(obj1);

        obj1.useDevice();

        Phone obj2 = new Phone("Iphone", "XII", 1200, true);
        System.out.println(obj2);
        obj2.useDevice();
    }

}
