package day21_04_26_2022.encapsulation;

public class UsingEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("Mike", 'M', 24, 150_000);
        System.out.println(employee);
        //since it is private we need to access w/ public getter/setter
        //employee.age = 25;

        //change name
        employee.setName("");
        System.out.println(employee.getName());
        //change age
        employee.setAge(15);
        System.out.println(employee.getAge());
        //change salary
        employee.setSalary(100000);
        System.out.println(employee.getSalary());
        //increase the salary of employee +20K
        employee.setSalary(employee.getSalary()+20000);
        System.out.println(employee.getSalary());
        //decrease the salary of employee -30K
        System.out.println(employee.getSalary()-30000);
        System.out.println(employee.getSalary());

        //get gender of Employee
        System.out.println(employee.getGender());
    }
}
