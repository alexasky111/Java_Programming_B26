package day53_abstraction.person;

public class UsingPerson {
    public static void main(String[] args) {
//        Person person = new Person();--> it is an abstract class cannot be instantiated
        Tester tester = new Tester();
        tester.name = "Alex";
        tester.age = 27;
        tester.jobTitle = "SDET";
        tester.salary = 100_000;

        System.out.println(tester);

//        Employee employee = new Employee(); --> it is an abstract class cannot be instantiated

        Chef chef = new Chef();
        chef.hobby();
        chef.work();
        System.out.println(chef);

    }
}
