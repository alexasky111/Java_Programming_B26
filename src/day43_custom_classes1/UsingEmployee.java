package day43_custom_classes1;

public class UsingEmployee {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Alexa", "UI Automation Engineer");
        employee1.goToMeeting();
        System.out.println(employee1);

        Employee employee2 = new Employee("Oleksandra",3333,"Lead Sdet", 110_000);
        employee2.goToMeeting();
        System.out.println(employee2);
    }


}
