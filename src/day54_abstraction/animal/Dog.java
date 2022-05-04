package day54_abstraction.animal;

public class Dog extends Animal implements Playable{


    @Override
    public void eat() {
        System.out.println("Dog goes to the bowl and eats");
    }

    @Override
    public void play() {

    }
}
