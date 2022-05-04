package day54_abstraction.animal;

import day54_abstraction.language.Language;

public final class Parrot extends Bird implements Flyable, Language {
    @Override
    public void eat() {
        System.out.println("Parrot wobble over the seeds");
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    public void hi() {
        System.out.println("HelloHello");
    }

    @Override
    public void bye() {
        System.out.println("ByeBye");
    }
}
