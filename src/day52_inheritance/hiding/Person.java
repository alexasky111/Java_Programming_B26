package day52_inheritance.hiding;

public class Person {
    String name = "James Bond";

}
//inheriting passing one var to another
class SecretIdentity extends Person{
    String name = "DNOB SEMAJ"; //we created another name var in the sub class, but it was already being inherited so now we are hiding the one from the parent
}
class Runner{
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);

        SecretIdentity secretIdentity = new SecretIdentity();
        System.out.println(secretIdentity.name);
    }
}
