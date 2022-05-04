package day49_inheritance.homework;

public class Corporation {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.name = "Alexandra";
        employee.isFullTime = true;
        employee.salary = 110_000;
        employee.work();
        System.out.println(employee.name+" "+employee.isFullTime+" "+employee.salary);
        //All instance var and work() m-thod is accessible from Super Class

        //employee.test() - is from sub class
        //employee.develop() - is from sub class

        Developer developer = new Developer();
        developer.develop();
        developer.name = "Alexandra";
        //developer.test - is from sub class not Super
        //developer.bugsFound - is from sub class not Super

    }

}
