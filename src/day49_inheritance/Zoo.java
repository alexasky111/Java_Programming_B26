package day49_inheritance;

public class Zoo {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.species = "Generic animal";
        animal.numberOfLegs = 0;
        animal.walk();

        Dog dog = new Dog();
        dog.species = "Dog";
        dog.numberOfLegs = 4;
//        dog.roar(); --> weren't made in parent class

        Lion lion = new Lion();
        //Q: how many instance vars does the lion obj have access to? - 3

        //Q: how many instance m-thods? - 2
        lion.roar();
        lion.species = "species";
        lion.walk();
//        lion.bark(); --> weren't made in parent class

    }
}
