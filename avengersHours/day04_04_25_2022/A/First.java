package day04_04_25_2022.A;

public class First {

    public int a;
    protected int b;
    int c;
    private int d;
    public static int e;

    public void met(){
        a=5;
        b=6;
        c=7;
        d=8;

        e=9;
    }

    public static void main(String[] args) {
        First obj = new First();
        obj.met();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);

        System.out.println(e);
    }
}
