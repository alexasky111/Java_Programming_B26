package day55_polymorphism.animal;

public class Reptile extends Animal{
    int numberOfClaws;
    @Override
    public void eat(){
        System.out.println("Reptile is eating");
    }
}
