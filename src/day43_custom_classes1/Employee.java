package day43_custom_classes1;

public class Employee {
    String name;
    int id;
    String jobTitle;
    int salary;

    public Employee(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public Employee(String name, int id, String jobTitle, int salary) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void goToMeeting(){
        System.out.println(name+" is going to a meeting");
    }

    @Override
    public String toString() {
        String object = name;

        if(id != 0){
            object+= " | "+id;
        } if(jobTitle != null){
            object+=" | "+jobTitle;
        } if (salary != 0){
            object+=" | "+salary;
        }
        return object;
    }
}
