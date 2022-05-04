package day24_loops;

public class CountJava_2 {
    public static void main(String[] args) {
        String str = "java is a java language java";
        int count = 0;
        // keep running while it contains java and delete if you have java

        while (str.contains("java")) {
            //reassign
            str = str.replaceFirst("java", "****");//replace -> changes all of them, replaceFirst -> only first occurrence
            count++;
        }
        System.out.println(count);
        System.out.println(str);


    }
}
