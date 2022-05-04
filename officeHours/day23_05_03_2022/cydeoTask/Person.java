package day23_05_03_2022.cydeoTask;

public class Person {
    String name;
    char gender;
    int age;

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void drink() {
        System.out.println(name + " is drinking");
    }

    public Person(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}
