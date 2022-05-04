package day44_custom_classes2;

public class UseEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Alex", "Senior Sdet");
        //reference of an object    //a Constructor
        System.out.println(employee1);

        Employee employee2 = new Employee("Vova",28,"Senior Sdet", 120_000);
        System.out.println(employee2);
    }
}
