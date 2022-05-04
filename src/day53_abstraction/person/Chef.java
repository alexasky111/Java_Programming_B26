package day53_abstraction.person;

public class Chef extends Employee{
    @Override
    public void work() {
        System.out.println("Cooking a 3 course meal");
    }

    @Override
    public void hobby() {
        System.out.println("Trying new food");
    }
}
