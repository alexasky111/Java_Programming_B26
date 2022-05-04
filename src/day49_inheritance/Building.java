package day49_inheritance;

public class Building {
    public static void main(String[] args) {
        Person obj = new Person();//obj belongs to the super class
        obj.name = "James Bond";
        obj.age = 40;
        obj.favHobby = "spy stuff";
        obj.talk();
        //obj.study - this is a method made in a sub class

        Student obj2 = new Student();//obj belongs to the sub class
        obj2.name = "Jorge";
        obj2.age = 10;
        obj2.favHobby = "drawing";
        obj2.talk();
        // the above variables and methods were inherited from the Person class

        obj2.funLevel = 100;
        obj2.study();
        // the above variables and methods belong to the sub class - Student
    }
}
