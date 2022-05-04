package saims_practices_for_loopsArrayMethod;

public class Array2_T02 {
    public static void main(String[] args) {
        /*
        Gradebook Example
Example:
Names = [“Mike”, “Joe”, “Ana”, “Ali”, “Joanna”]
Scores = [80, 54, 100, 66, 94]
Grades= [‘B’, ‘D’, ‘A’, ‘C’, ‘A’] -> Need to find and store these based on score
Output:
Mike | 80 | B
Joe | 54 | D
Ana | 100 | A
Ali | 66 | C
Joanna | 94 | A
         */
        String [] names = {"Mike", "Joe", "Ana", "Ali", "Joanna"};
        int [] scores = {80, 54, 100, 66, 94};
        char [] grades = new char [5];

        for (int i = 0; i < names.length; i++) {
            if (scores[i] > 85){
                grades[i] = 'A';
            } else if (scores[i] > 75){
                grades[i] = 'B';
            } else if (scores[i] > 65){
                grades[i] = 'C';
            } else {
                grades[i] = 'D';
            }
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]+" | "+scores[i]+" | "+grades[i]);

        }











    }
}
