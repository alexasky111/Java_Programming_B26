package day44_custom_classes2;

public class ChainExample {

    public ChainExample(){
        //this(4); this is not valid bc the chaining contain themselves
        System.out.println("First");
    }

    public ChainExample(int i){
        this();
        System.out.println("Second");
    }
    public  ChainExample(String a){
        this();
        System.out.println("Third");
    }
    public ChainExample(double d){
        this(0);
        System.out.println("Fourth");
    }
}
