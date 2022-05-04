package day26_nested_loops;

public class Print_Numbers_One_To_Five {
    public static void main(String[] args) {
        for ( int j = 0; j < 5; j++) {
            for (int i = 1; i <= 5; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
