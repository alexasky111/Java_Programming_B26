package day34_void_method;

public class CreditScore {
    public static void main(String[] args) {
        getCreditScore(); // this value is not used
        int creditScore = getCreditScore();
        System.out.println(creditScore);
        System.out.println(getCreditScore()+50);

        System.out.println(isGoodCreditScore(780));
        //this method returns boolean type and accepts an int type
        System.out.println(isGoodCreditScore(getCreditScore()));
        System.out.println(isGoodCreditScore(500) ? "Good Score" : "Bad Score");
    }
    public static int getCreditScore(){
        return 800;
    }
    public static boolean isGoodCreditScore(int creditScore){
       //taking the parameter, based on the parameter,checking if the score good
        if(creditScore>=700){
            return true;
        }else{
            return false;
        }
    }
    /*
    public static boolean isGoodCreditScore(int creditScore){
    return creditScore >=700;
    }
     */
}
