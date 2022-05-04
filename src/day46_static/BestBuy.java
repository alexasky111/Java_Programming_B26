package day46_static;

public class BestBuy {
    String location;
            static String headquaters = "Richfield, Minnesota, US";
            static String day = "Wednesday";
            static int numberOfComp = 100;

            public BestBuy(String location){
                this.location = location;

            }
            public void openStore(){
                System.out.println("opening a store"+location);
            }
            public static void reStock(){ numberOfComp +=20;
            }
}
