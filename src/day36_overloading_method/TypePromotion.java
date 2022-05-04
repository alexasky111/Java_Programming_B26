package day36_overloading_method;

public class TypePromotion {
    public static void main(String[] args) {
        use(3); // it will find the closest type to number 3 --> long method is the closest
        use(3.5); // it will find the closest type to number 3.5 --> double method is the closest
        use(1.2f); // it will find the closest type to number 1.2f --> float method
        use(3L); // --> long method
        use(3F); // --> float method
        use((double) 3); // --> casting to double
        short s = 5;
        use(s); // it will go to long method bc there is not closer like int

        //can't use d for double bc it is a default value
    }
    // Overloading the same method "use" w/ different parameters
    public static void use(float f ){
        System.out.println("calling float method");
    }
    public static void use(double d) {
        System.out.println("calling double method");
    }
    public static void use(long l) {
        System.out.println("calling long method");
    }
}
