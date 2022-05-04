package day54_abstraction.creating;

public class Book implements Create{
    //my class book has abstract m-thods inherited, so I have to override them(can't have absttact m-thod in a non abstract class)


    @Override
    public void read() {
        System.out.println("reading");
    }

    @Override
    public void write() {
        System.out.println("writing");
    }
}
