package day44_custom_classes2;

public class UseSong {
    public static void main(String[] args) {
        //I need overloaded constructors in order to chain and then call the method
        Song song1 = new Song("wakawaka"); //4 different ways to make this object
        System.out.println(song1);

        Song song2 = new Song("viva la vida", 3.5);
        System.out.println(song2);

        Song song3 = new Song("thriller",4.0,"Michael Jackson", "pop");
        System.out.println(song3);
    }

}
