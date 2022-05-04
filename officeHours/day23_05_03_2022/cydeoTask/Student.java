package day23_05_03_2022.cydeoTask;

public class Student extends Person {
    private String schoolName, studentID;

    public Student(String name, char gender, int age, String schoolName, String studentID) {
        super(name, gender, age);
        this.schoolName = schoolName;
        this.studentID = studentID;
    }
    public void study() {
        System.out.println(getName()+" is studying");
    }
    public void attendClass() {
        System.out.println(getName()+" is attending a class");
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() { //super. refers toString() Patent m-thod
        return "Student{" +
                super.toString()+
                "schoolName='" + schoolName + '\'' +
                ", studentID='" + studentID + '\'' +
                '}';
    }
}
