package day51_inheritance.season;

public class CheckSeason {

    public static void main(String[] args) {
        Winter winter = new Winter(5,-30);
        winter.activity();
        System.out.println(winter);

        Spring spring = new Spring(20,0);
        spring.activity();
        System.out.println(spring);
    }
}
