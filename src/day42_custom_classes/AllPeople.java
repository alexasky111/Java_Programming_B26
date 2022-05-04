package day42_custom_classes;

public class AllPeople {
    public static void main(String[] args) {
        //This is not a valid way to access instance variables
//        System.out.println(Person.name);

        //1.To create an object of the Person class
        Person personOne = new Person();
        //2. If I want to make one more person I need to make one more object
        //Instantiation --> making an object; just like Scanner input = new Scanner(System.in);
        Person personTwo = new Person();

        personOne.name = "James";
        personOne.age = 40;
        personOne.height = 5.10;
        personOne.isMarried = false;

        //printing the instance variables
        System.out.println(personOne.name);
        System.out.println(personOne.age);
        System.out.println(personOne.height);
        System.out.println(personOne.isMarried);
        System.out.println();

        System.out.println(personTwo.name);
        System.out.println(personTwo.age);
        System.out.println(personTwo.height);
        System.out.println(personTwo.isMarried);



    }
}
