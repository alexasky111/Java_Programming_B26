package day50_inheritance.book.app;

public class Youtube extends App{

    public Youtube(double version){
        super("Youtube", version);
    }

    public void watchVideo(){
        System.out.println("Watching Java tutorial");
    }
}
