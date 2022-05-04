package day53_abstraction.person;

public class Tester extends Employee{
    @Override
    public void work() {
        System.out.println("Running test cases");
    }

    @Override
    public void hobby() {
        System.out.println("Coding is my only hobby");
    }
}
