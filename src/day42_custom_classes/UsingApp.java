package day42_custom_classes;

import java.util.Scanner;

public class UsingApp {
    public static void main(String[] args) {
        //we made an object cydeo of an App Class
        App cydeo = new App();
        cydeo.name = "Cydeo";
        cydeo.version = 5.5;
        cydeo.isFree = true;
//        App.run(); -- invalid
//        App.update(); -- invalid
        //To call the App method correctly
        cydeo.run();
        cydeo.update();
        //To print instances of the Class
        System.out.println(cydeo.name);
        System.out.println(cydeo.version);
        System.out.println(cydeo.isFree);

        new App().run(); // doesn't have a reference --> creates a new null object and calls tun method

        System.out.println(new Scanner(System.in).nextLine()); //when i'm running this line the consul is waiting for me to type smth; I can't come to the next position and say nextLine() bc I didn't creat a Scanner object, i never made a reference directly to it

    }
}
