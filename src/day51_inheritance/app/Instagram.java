package day51_inheritance.app;

public class Instagram extends App{

    public Instagram(double version){
        super("Instagram", version); //to satisfy construction conditions
    }
    public void postPictures(){
        System.out.println("Posting pic to Instagram");
    }
}
