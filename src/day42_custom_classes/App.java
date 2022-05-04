package day42_custom_classes;

public class App {
    //instance variables:
    //the app will have name of the app
    String name;
    //some kind of version
    double version;
    //instance var isFree
    boolean isFree;

    //instance methods(m-thod that belongs to every object):
    public void run(){
        System.out.println(name + " is running");
    }
    public void update(){
        System.out.println(name + " is updating");
        version +=1.1;
    }



}
