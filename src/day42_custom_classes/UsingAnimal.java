package day42_custom_classes;

public class UsingAnimal {
    public static void main(String[] args) {
        Animal bird = new Animal();
        bird.population = 1000000;
        bird.species = "Bird";

        //when you print smth the toString method is automatically called bc it is already in a class
        System.out.println(bird);
        System.out.println(bird.toString()); //here inteliji is telling you're calling the m-thod twice; the calling is unnecessary bc toString is in the Class already
//        Animal.toString --> is invalid bc it is not a static method
    }
}
