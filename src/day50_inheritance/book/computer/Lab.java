package day50_inheritance.book.computer;

public class Lab {
    public static void main(String[] args) {
        Computer obj1 = new Computer("Generic os", 300);
        System.out.println(obj1);

        Windows ob2 = new Windows(500);
        //            new Computer("Windows", 500);
        System.out.println(ob2);

//        Mac obj3 = new Mac("Mac", 300);
        Mac obj3 = new Mac(300);
        System.out.println(obj3);
    }
}
