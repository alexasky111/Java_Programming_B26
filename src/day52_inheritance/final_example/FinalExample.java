package day52_inheritance.final_example;

public class FinalExample {
    final int a = 5;//this belongs to objects
    final int b;

    public static final String PLANET = "Earth"; //this belongs to the Class, constant variable
    public FinalExample(int b){ //to call the constr and make the value first, assign to final and then the value cant be changed
        this.b = b;
    }


}
