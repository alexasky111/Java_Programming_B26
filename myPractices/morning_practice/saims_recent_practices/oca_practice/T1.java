package morning_practice.saims_recent_practices.oca_practice;

import java.util.Arrays;

public class T1 {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2}, {3, 4}};
        arr[1] = arr[0];
        System.out.println(Arrays.toString(arr[1]));//gives a hashcode

        int[][] arr1 = {{1, 2, 3}, {3, 4}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(arr1[i][j] + " ");//1,2,3,4
            }
        }

        System.out.println("Result " + (3 + 4));
        String str = " ";
        str.trim();
        System.out.println(str.length());
        System.out.println(str.equals("") + " " + str.isEmpty());//false, false

        String[][] arr3 = {{"A", "B", "C"}, {"D", "E"}};
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.println(arr3[i][j]);
                if (arr3[i][j].equals("B")) {
                    break; //ABDE
                }
            }
        }

        int[] num1 = new int[3];
        int[] num2 = {1, 2, 3, 4, 5};
        num1 = num2;
        for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);//1,2,3,4,5
        }

        int x = 100;
        int a = x++;
        int b = ++x;
        int c = x++;
        //int d = (a<b)?(a<c)?a:(b<c)?b:c; - compile error

        System.out.println();
        int num = 10;
        add10(10);
        System.out.println(num);// 10


        int numbers[];
        numbers = new int[2];
        numbers[0] = 10;
        numbers[1] = 20;

        numbers = new int[4];
        numbers[2] = 30;
        numbers[3] = 40;
        System.out.println(Arrays.toString(numbers));//0,0,30,40

        String str1 = "Batch 11";
        int z = str1.trim().length();
        System.out.println(z);//8

        double e = 10;
        //switch (e){ --> SWITCH DOESN'T ACCEPT BOOLEAN AND DOUBLE/FLOAT

        String str4 = "";
        System.out.println("str4.length() = " + str4.length());

    }




    static void add10(int num) {
        num = num + 10;
    }
}
