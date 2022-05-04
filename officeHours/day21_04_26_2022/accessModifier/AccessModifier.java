package day21_04_26_2022.accessModifier;

public class AccessModifier {
    public static void main(String[] args) {
        Person person = new Person();

        //1- Public
        person.name = "Mike";

        //2- Private
        //person.age = 0; it is not visible

        //3- Default --> in the same package
        person.ID = 1;

        //4- Protected
        //-Same Package
        person.Dob = "06.06.2006";

        //-Inheritance --> there is no inheritance
        AccessModifier accessModifier = new AccessModifier();
       // accessModifier.Dob --> no access bc no inheritance

    }
}
