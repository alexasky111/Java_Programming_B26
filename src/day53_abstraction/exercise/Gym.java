package day53_abstraction.exercise;

public class Gym {
    public static void main(String[] args) {
//        Exercise obj1 = new Exercise(); ->this class is abstract->you can't create an obj

        Running obj2 = new Running();
        System.out.println(obj2.name);

        obj2.performExercise();
        System.out.println(obj2.getCaloriesBurned(20));
    }
}
