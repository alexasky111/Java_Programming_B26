package day23_05_03_2022.cydeoTask;

public class Cydeo {
    public static void main(String[] args) {


        Student student = new Student("Mike", 'M', 25, "Cydeo", "17625365723");

        Tester tester = new Tester("john", 'M',25,"Tester", "1767634", 110_000);

        //OVERRIDEN METHODS
        tester.attendMeeting();
        tester.work();
        tester.drink();

        //Comes from Parent
        tester.eat();
        tester.sleep();

    }
}
