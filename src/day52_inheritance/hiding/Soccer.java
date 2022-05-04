package day52_inheritance.hiding;

public class Soccer extends Sports {

    public static void cheer() {
        System.out.println("Cheering from the child class");
    }
    /*
    looks like we are overriding but we are not, bc the m-thod is static
    we are hiding the cheer m-thod from the parent class
     */
}
//
