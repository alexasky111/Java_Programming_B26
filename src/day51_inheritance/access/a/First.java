package day51_inheritance.access.a;

public class First {

    //these are instance variables, to use them we need an object of the class
    public int one = 1;
    protected int two = 2;
    int three =  3;
    private int four = 4;

    public static void main(String[] args) {
        First obj1 = new First();
        System.out.println(obj1.one);
        System.out.println(obj1.two);
        System.out.println(obj1.three);
        System.out.println(obj1.four);
    }
}
