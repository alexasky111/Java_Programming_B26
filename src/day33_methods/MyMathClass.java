package day33_methods;

public class MyMathClass {
    public static void add(double numOne, double numTwo){ //For parameters must declare separate, can't do "double numOne, numTwo"
// VOID METHOD DOES NOT RETURN ANYTHING BACK; WE ONLY PRINT
        System.out.println(numOne+" + "+numTwo+" = "+(numOne+numTwo));
    }
    public static void subtract(double numOne, double numTwo){

        System.out.println(numOne+" - "+numTwo+" = "+(numOne-numTwo));
    }
    public static void multiply(double numOne, double numTwo){

        System.out.println(numOne+" * "+numTwo+" = "+(numOne*numTwo));
    }
    public static void division(double numOne, double numTwo){
        if(numTwo != 0) {
            System.out.println(numOne + " / " + numTwo + " = " + (numOne + numTwo));
        } else {
            // out-->err will print in RED color means invalid
            System.err.println("Cannot divide by zero");
        }
    }

    public static void main(String[] args) {
        add(4.5, 6.1);
        add (4, 6); // int will work bc of implicit casting
        division(4,0);
    }
}
