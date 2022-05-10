package day05_05_09_2022;

public abstract class Animal { //can not be final, it should be eligible to be inherited
    /*
-Write an abstract class Animal that contains 2 instance variables: name and age.

                *Provide getters and setters for these variables
                *Add an abstract method getAgeInHumanYears() that returns int.
                *Define 2 args constructor that initializes instance variables.
 */


        String name;
        int age;

        public Animal(String name, int age) { //can an abstract class have constructor? Yes, but it must be called in subclass with super()
            this.name = name;
            this.age = age;
        }

        public String getName() { //we can have non-abstract methods in an abstract class
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public abstract int getAgeInHumanYears(); //abstract methhods-> abstract classes and interfaces

        //can an abstract method be final?
        //no, because final methods can not be overridden

        //can an abstract method be private?
        //no, because private methods can not be inherited

        //can an abstract method be static?
        //no, they can not be overridden
}
