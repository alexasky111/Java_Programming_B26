package day25_05_10_2022;

public class Abstraction {
     /*
What is Abstraction ?
	- Abstraction:
				   Focus on essentials , not worry about details
				   Focus on name of actions , not worry about implementation
				   Hiding implementation
	- Abstraction can be done in 2 ways: Abstract Classes, Interface
	- Abstraction helps with "organazing the code", "reusing the code", "less duplicate code"
	- Abstraction cannot exist without inheritance
1- ABSTRACT CLASSES
How can we create abstract class ?
	- Abstract keyword is used to create abstract classes
	- An abstract class can not be instantiated (we cant create OBJECT from this CLASS)
	- Goal is to provide reusable variables and methods to sub classes
	- Abstract Class can have non-abstract and abstract methods
	- Abstract Class can not be  final
	- Can have everything the regular class can have + abstract methods
	- So abstract class only shows WHAT it can do, but not HOW by using abstract methods.
- Methods
	- abstract keyword is used to create abstract method
	- Abstract method does not have body, only have signature
	- Abstract methods may not be declared private or final,static
	- Abstract methods may only be defined in abstract classes OR interfaces
	- Implementing an abstract method in a subclass follows the same rules for overriding a method
		Ex :public abstract void update();
- Concrete Class
	- A non-abstract subClass of abstract Class
	- FIRST CONCRETE class MUST implement all inherited abstract methods
    A --> Abstract
    abstract method1();
    B extends A --> Abstract
    C extends B --> Concrete
 ===== QUESTIONS ====
1- Can we create OBJECT from abstract class ?
    NO, we cant create it
    public abstract class Browser {
    }
    Browser browser = new Browser (); // ERROR
2- What is abstract method ?
    is a method without body / no implememtation and can be placed in interface or abstract class
    public abstract class Browser {
        public abstract void getTitle();
        public abstract void navigate();
    }
3- Where do you add implementation for abstract class ?
    - is added in first concrete class
    - We need to follow all overriding rules
     public  class Chrome extends Browser  {
       public abstract void getTitle(){
         //implementation
       }
        public abstract void navigate(){
        //implementation
       }
    }
4- Can we add non-abstract methods in abstract classes ?
    - Yes we can
    public abstract class Browser {
        public abstract void getTitle();
        public abstract void navigate();
        public void refresh(){
        //implemenation
        }
    }
5- Is this mandatory to have abstract method in abstract class ?
    NO.Abstract class can have  0(ZERO) abstract method as well
6- Can we add constr in abstract class ?
    YES
 public abstract class Browser {
        public abstract void getTitle();
        public abstract void navigate();
        public void refresh(){
        //implemenation
        }
        public  Browser(){
            //constructor
        }
    }
7- If we cant create OBJECT how can we call constr ?
    - From child with super keyword
8- Can we add instance or static variable for abstract classes ?
- Can have everything the regular class can have + abstract methods
9- Can we have static block for  abstract classes ?
- Can have everything the regular class can have + abstract methods
10- Can abstract class extends another abstract class ?
    - YES
    public abstract class A{}
	public abstract class B extends A{}
11 - Can abstract class extends another non - abstract class ?
    - YES
12- Can a class extends multiple abstract classes ?
    - NO --> DIAMOND ISSUE / PROBLEM
13- Can we have static method in abstract classes
    - Yes we can .If it has an implementation
        public abstract class A{
        public static void aMethod (){
            // implementation
        }
        }
14- Can an abstract method be static ?
    - NO . Abstract methods meant to be overriden
15- Can an abstract method be final ?
    - NO . Final methods can not be overriden
16- If the abstract class does not any abstract methods , can we init them ?
    - NO.It is not possible to create OBJECT from abstract classses
     */
}
