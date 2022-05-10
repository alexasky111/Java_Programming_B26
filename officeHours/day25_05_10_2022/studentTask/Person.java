package day25_05_10_2022.studentTask;

public abstract class Person {
   /*
     Person (abstract)
                instance variables:   name, age
                abstract method:      sleep()
     */


    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public  abstract void sleep();

    public String getName() {
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
}

