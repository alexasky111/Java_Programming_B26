package Interview_Questions;

public class SumOfDigits {
    public static void main(String[] args) {
        /*
       Task 01 : SumOfDigits

        Write a program that can return the sum of digits from  a  string
             		Ex:
             			input: A1B2C3

             			output: 6
             					1+2+3
   */

        String str = "A1B2C3";
        //            012345
        // Manually  - Hardcoded --It will run and give output only for this data

        // str.charAt(1) -- returns char data
//        System.out.println("Hard coded: "+ str.charAt(1)-48+str.charAt(3)-48+str.charAt(5)-48);
        // Dynamic ---it will run for all kind of data

        // first check each char
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(each>= '0' && each<='9') {
                sum +=each-48;

            }

        }
        System.out.println("Dynamic" + sum);




    }
}
