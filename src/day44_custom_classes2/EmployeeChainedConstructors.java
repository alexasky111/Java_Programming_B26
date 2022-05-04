package day44_custom_classes2;

public class EmployeeChainedConstructors {
    /*
      create a class called Employee

       - data:

           name, id, job title, salary

           */
    String name;
    int id;
    String jobTitle;
    double salary;

    /*

    - constructor

        - create a constructor that creates an Employee object with the name and job title

        - create a constructor that creates an Employee object with the name, id, job title, and salary

    */
    public EmployeeChainedConstructors(String name, String jobTitle) {
        // 'this' is to tell the compiler I want to access the instance variables
        this.name = name;
        this.jobTitle = jobTitle;

    }

    public EmployeeChainedConstructors(String name, int id, String jobTitle, double salary) {
        this(name, jobTitle);
        this.id = id;
        this.salary = salary;
    }

    /*
            - method:

                goToMeeting()
                    when this method is called print:
                        $name is going to a meeting

                toString()
                    print all the employees information

         */
    // only accessible by each object,
    // static means belongs to the class; it means all objects would be going to the meeting at the same time
    public void goToMeeting() {
        //now it knows I want here an instance variables
        System.out.println(name + " is going to a meeting");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
