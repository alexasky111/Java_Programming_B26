package day43_custom_classes1;

public class ThisKeyword {
    //can't access this local variable in the main method, bc it is local to the Constructor
    int a=100;
    public ThisKeyword(int a){
        a=400;
        System.out.println(a);//it will be 400, it doesn't affect our instance variable at all (int a=100)

        // 'this' is a keyword that accesses references/instance variables; It is a reference to the object/instance; It is used to tell the compiler the difference btw local var and instance var
        this.a=600;
    }
}
