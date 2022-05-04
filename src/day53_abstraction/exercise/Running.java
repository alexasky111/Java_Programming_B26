package day53_abstraction.exercise;

public class Running extends Exercise{
    public Running(){
        super("Running");
    }

    @Override
    public void performExercise() {
        System.out.println("Running for fun, not sure who does this");
    }

    @Override
    public int getCaloriesBurned(int minutes) {
        return minutes * 5;
    }
}
