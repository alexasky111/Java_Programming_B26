package day23_05_03_2022.cydeoTask;

public class Employee extends Person{
    private String jobTitle, employeeID;
    private double salary;

    public Employee(String name, char gender, int age, String jobTitle, String employeeID, double salary) {
        super(name, gender, age);
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
        this.salary=salary;
    }
    public void work(){
        System.out.println(getName() + " is working");
    }

    public void attendMeeting(){
        System.out.println(getName() + " is attending a meeting");
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString()+
                "jobTitle='" + jobTitle + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", salary=" + salary +
                '}';
    }
}
