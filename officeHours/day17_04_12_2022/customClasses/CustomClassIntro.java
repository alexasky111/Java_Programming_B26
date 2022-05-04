package day17_04_12_2022.customClasses;

import java.util.Objects;

public class CustomClassIntro {
    @Override
    public String toString() {
        return "CustomClassIntro{" +
                "instanceVariable='" + instanceVariable + '\'' +
                '}';
    }
    /*
    --> Class is a blueprint/template for objects
        we can create Class without objects
        Class doesn't consume our memory, but objects do

        Car                   c =                                new                                    Car();
       Class                Reference Var/Object Name          keyword to create new Object         Constructor

        Arrays.toString(); - toString is a static method
    --> Object is an instance of the Class
        we can't create an object without Class

     */
    String instanceVariable; //null

    /*
    What is instanceVariable? --> can be called attributes/datas/fields
    --> Belongs to objects (Each object has their own copy)
        Must be created in Class but outside any methods
   How can we access them?
   --> We need to create One Object to access them (variable/methods)

   Car c = new Car();
   c.instanceVariable = "BMW"; //change-assign value
   --> sout(c); - prints whole object
   --> sout(c.instanceVariable); - prints one reference

     */

    public CustomClassIntro(){
        System.out.println("Constructor is running");
        instanceVariable = "Hello from Constructor";
        System.out.println(instanceVariable);
    }



    public void instanceMethod(){

        /*
        What is instanceMethod?

        Car c = new Car();
        c.instanceMethod(); // to call instance method from Object
         */
        System.out.println("instance method is running");
        instanceVariable="Instance variable from instance method";
        System.out.println(instanceVariable);

        String localVariable = "Local variable from instance Method";
        System.out.println(localVariable);

        /*
        What is local variable?

        -->belongs Method | Scope
        -->exists only inside SCope or Method

         */
        if(true){
            String localVariableFromIf = "If statement";
        }
        //localVariableFromIf = "Only valid in related method



    }
}
