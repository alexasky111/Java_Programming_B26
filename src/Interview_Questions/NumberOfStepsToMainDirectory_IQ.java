package Interview_Questions;

public class NumberOfStepsToMainDirectory_IQ {
    public static void main(String[] args) {
        /*
    Task 5 :     Number of Steps to Main directory  --- Interview Task

    			 We have a record of every time a change of directory is performed.The different change directory functions are as follow ;

    				 ../  Move to parent folder of current folder
    				 ./   Remain in the same folder
    				 x/   Move to the child folder named x


    				 Write a method to Find the minimum steps required to go back to main directory from current folder.The sequence of operations performed after entering the main directory provided


    				 Input : {"x/","y/","../","z/","./"}

    				 Output : 2
         */
        String[] input = {"x/", "y/", "../", "z/", "./"};
        minSteps(input);

    }
public static void minSteps(String [] steps){
        int count = 0;
    for (String eachStep : steps) {
        switch(eachStep){
            case "./":
                break;
            case "../":
                count--;
                break;
            default:
                count++;
                break;

        }

    }
    System.out.println(count);

        }












    }

