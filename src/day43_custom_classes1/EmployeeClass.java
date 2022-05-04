package day43_custom_classes1;

public class EmployeeClass {
    public static void main(String[] args) {

        //To create an array of objects
        Employee employees [] = new Employee[4];
        employees[0] = new Employee("Alex", 333, "Sdet", 110_000);
        employees[1] = new Employee("Hanna", 333, "Sdet", 115_000);
        employees[2] = new Employee("Aleksey", 333, "QA", 110_000);
        employees[3] = new Employee("Victoria", 333, "Developer", 120_000);

        //To find salaries over 100k
        String over100K = "";
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].salary > 100000){
                over100K += employees[i].salary+" ";
            }
        }
        System.out.println("Over 100k offers are: "+over100K);

        //To find the max salary
        int max = 0;
        for (int i = 0; i < employees.length; i++) {
            max = employees[i].salary;
            if(employees[i].salary > max){
                max = employees[i].salary;
            }
        }
        System.out.println("Max salary is "+ max);





    }


}
