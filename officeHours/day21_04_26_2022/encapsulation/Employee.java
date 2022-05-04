package day21_04_26_2022.encapsulation;

public class Employee {
    /*
     Task  1 : EmployeeTask

         Create an Employee Class:

    			private variables:
    				name, gender, age, salary

    			Encapsulate all the private fields

    				1. Name can not be empty
    				2. gender can not anything other than female or male
    				3. age can not be less than 18
    				4. salary can not be zero or negative
     */

    private String name;
    private char gender;
    private int age;
    private double salary;


    public Employee(String name, char gender, int age, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }
    }

    public String getGender() {
        if (gender == 'M') {
            return "Male";
        } else if (gender == 'F') {
            return "Female";
        } else {
            return "Undefined";
        }
    }

    public void setGender(char gender) {
        if (gender == 'F' || gender == 'M') {
            this.gender = gender;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 18) {
            this.age = age;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
