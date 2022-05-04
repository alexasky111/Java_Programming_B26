package day23_05_03_2022.cydeoTask;

public class Student extends Person {
    String schoolName, studentID;

    public Student(String name, char gender, int age, String schoolName, String studentID) {
        super(name, gender, age);
        this.schoolName = schoolName;
        this.studentID = studentID;
    }
    public void study() {
        System.out.println(name + " is studying");
    }
    public void attendClass() {
        System.out.println(name + " is attending a class");
    }

}
