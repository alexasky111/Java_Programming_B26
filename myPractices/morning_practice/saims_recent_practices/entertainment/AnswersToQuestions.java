package morning_practice.saims_recent_practices.entertainment;

public class AnswersToQuestions {
    /*

    1. List the is a relation of all the classes:
    * Streaming is a child of Entertainment (Entertainment is a Parent)
    * Netflix is a child of Streaming (Streaming is a Parent)
    * YouTube is a child of Streaming (Streaming is a Parent)
    * LiveShow is a child of Entertainment (Entertainment is a Parent)
    * KevinHart is a child of LiveShow (LiveShow is a Parent)

    Single level inheritance:

    Multi level inheritance: Entertainment is a Parent of LiveShow & LiveShow is a Parent to KevinHart; Entertainment is a Parent of Streaming & LivStreaming is a Parent to Netflix & Youtube;

    Hierarchical level inheritance: Entertainment is a Parent to a child Streaming & LiveShow; Streaming is a Parent to a child Netflix & Youtube;

    2. What is the purpose of super keyword?
    * it is a reference to a parent instance variables

    3. Why do we use constructor chaining?
    * for a better reusability of the code

    4. Why must a sub class call the parent class constructor to create the object?
    * it is a rule of inheritance: constructors are not inherited, but each child class must call the Parent constructor

    5. What is the difference between this() and super()?
    * this() calls a constructor in the same class and super() calls a parent constructor?

    6. What is the default constructor?
    * each class has a default constructor in order to create an object of a class

    7. How does it change if you create your own constructor?
    * it dissapears as soon as you create a constructor w/ parameters

    8. How does it change the super class interactions?
    * you must call the super class constructor when working w/ its sub classes

    9. What is the difference between method overloading and method overriding?
    * overloading - to keep method's name and change the parameters, then return value(optional); overriding - to keep method's signiture and change the implementation of the method

    10. Which things are inherited from one class to another?
    * all instance variables, methods, static members, protected members;
     except final,  constructors

    11. What is inheritance?
    * OOP concept that allows to get data from a parent class to a child class, using extends keyword

    12. What is encapsulation?
    * OOP concept that allows to protect/hide information from direct access w/ a help of private access modifier. To access encapsulated data - you must generate getter & setter

    13. What is the difference between all the access modifiers?
    * The difference is in the level of allowance to access data: public-access anywhere in the project, protected - (have to implement a concept of Inheritance) is not visible to World(is visible outside of package only if there is subclass) can be instantiated from sub class object only, default - anywhere in the same package, private(encapsulation concept) - access only in the same class

    14. How are protected and default different?
    * protected is used through inheritance concept, default is accessed within a package only

    15. Can you override static methods?
    *No, we can not override static method in java. Static methods are those which can be called without creating object of class, they belong to the class they were created in.

    16. What are final variables, final methods, and final classes?
    * those that cannot be changed/reassigned. Final class can't be a Parent class



     */
}
