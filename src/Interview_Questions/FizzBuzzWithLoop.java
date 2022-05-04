package Interview_Questions;

public class FizzBuzzWithLoop {
    public static void main(String[] args) {
        fizzBuzz(1,100);
    }
    public static void fizzBuzz(int startNum, int endNum){
        for (int i = 0; i <=endNum ; i++) {
            if((i%3 == 0) && (i%5)==0){
                System.out.println("FizzBuzz ");
            }else if(i%3==0){
                System.out.println("Fizz ");
            }else if(i%5==0){
                System.out.println("Buzz ");
            }else{
                System.out.println(i+" ");
            }
        }
    }
}
