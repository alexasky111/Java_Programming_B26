package day23_05_03_2022.cydeoTask;

public class Employee extends Person{
    String jobTitle, employeeID;
    double salary;

    public Employee(String name, char gender, int age, String jobTitle, String employeeID, double salary) {
        super(name, gender, age);
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
        this.salary=salary;
    }
    public void work(){
        System.out.println(name+ " is working");
    }

    public void attendMeeting(){
        System.out.println(name+ " is attending a meeting");
    }
}
