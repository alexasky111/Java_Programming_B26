package day23_05_03_2022.cydeoTask;

public class Teacher extends Employee{
    public Teacher(String name, char gender, int age, String jobTitle, String employeeID, double salary) {
        super(name, gender, age, jobTitle, employeeID, salary);
    }

    @Override
    public void work() {
        super.work();
    }

    @Override
    public void attendMeeting() {
        super.attendMeeting();
    }
}
