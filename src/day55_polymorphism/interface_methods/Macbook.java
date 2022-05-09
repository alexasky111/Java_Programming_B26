package day55_polymorphism.interface_methods;

public class Macbook implements Mac{
    @Override
    public void turnOn(){
        System.out.println("Mac is turning on");
    }
}
class Runner{
    public static void main(String[] args) {
        System.out.println(Mac.NAME);
        System.out.println(Mac.OS);
//        System.out.println(Macbook.NAME);
//        System.out.println(Macbook.OS);
//      You can access the static var from the child class reference, but you should use the interface to access
      Mac.company();

//        Mac.turnOn; - not valid need an obj to call it

        Macbook obj = new Macbook();
        obj.turnOn();
        obj.faceTime();
//        obj.company(); static classes from an interface are not inherited, so they can't be accessed from objects only by the interface'
    }
}
