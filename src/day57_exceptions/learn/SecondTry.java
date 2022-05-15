package day57_exceptions.learn;

public class SecondTry {
    public static void main(String[] args) {
        try{
            String s = null;
            System.out.println(s.length()); //null.length(); -->goes to line 11 and executes, won't run the rest of the code below !
            int [] a = {1,2,3,4};
            System.out.println(a[10]);

        }catch(NullPointerException e){ //hasn't been instantiated, object that doesn't have value
            System.out.println("Caught a null pointer exception");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught the Array index out of Bounds");
        }
        System.out.println("Done");
    }
}
