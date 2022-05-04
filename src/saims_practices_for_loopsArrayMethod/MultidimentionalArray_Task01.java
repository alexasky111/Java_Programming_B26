package saims_practices_for_loopsArrayMethod;

public class MultidimentionalArray_Task01 {
    public static void main(String[] args) {
        /*
        Given a 2D array with values:
{3, 5, 1}
{1, 6, 10}
{5, 21, 10}
Calculate and find the biggest diagonal
         */

        // 1. To assign the 2D Array
        int [][] nums = {
                {3, 5, 1}, //element 0
                {1, 6, 10},//element 1
                {5, 21, 10},//element 2
        };

        // 2. To assign the diagonals and an empty storage to compare biggest diagonal
        int biggestDiagonal = 0;
        int firstDiagonal = nums[0][0]+nums[1][1]+nums[2][2];
        int secondDiagonal = nums[0][2]+ nums[1][1]+nums[2][0];

        if (firstDiagonal>secondDiagonal){
            biggestDiagonal=firstDiagonal;
            System.out.println(biggestDiagonal);
        } else if(secondDiagonal>firstDiagonal){
            biggestDiagonal=secondDiagonal;
            System.out.println(biggestDiagonal);
        }

/*

if an array was
a b c
d e f
g h i
aei and ceg would be the diagonals
 */

        // 1. To concatenate through elements of 2D Array
        char [][] letters = {
            { 'a', 'b', 'c'},
            {'d', 'e', 'f'},
            { 'g', 'h', 'i'}
        };

        System.out.println("The diagonals of the Array are: "+letters[0][0]+letters[1][1]+letters[2][2]+" and "+letters[0][2]+letters[1][1]+letters[2][0]);





    }
}





















