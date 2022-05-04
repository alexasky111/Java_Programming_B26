package day26_nested_loops;

public class NestedLoopEx2 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.print(i + "A");
            for (int j = 0; j < i; j++) { // 'j' prints as many times based on the 'i'
                System.out.print(j + "B");
            }
            System.out.println();
        }

        System.out.println("--------------------");
        String s = "java";
        for (int i = 0; i < s.length(); i++) { //how many executions
            for (int j = 0; j <= i; j++) { //how many characters
                System.out.print(s.charAt(j));
            }
            System.out.println(); // without it'll put all in the same place
        }


    }
}
