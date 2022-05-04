package day50_inheritance.book.app;

public class Instagram extends App {
    //1. depict inheritance relationships: Instagram is a App

    //2. To call parent Constructor
    public Instagram(double version) {
        super("Instagram", version);
    }

    //3. create instance method of Instagram Class
    public void postPicture(){
        System.out.println("Posting picture to Instagram");
    }

}
