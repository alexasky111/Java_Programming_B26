package day54_abstraction.animal.homework;

public final class Target extends Shopping{

    @Override
    public void buyItem() {
        System.out.println("Buying an item");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning an item");
    }
}
