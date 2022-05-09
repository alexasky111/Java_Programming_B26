package day55_polymorphism.clothes;

public class Store {
    public static void main(String[] args) {
        //all possible objects of tshirts
        TShirt tShirt1 = new TShirt();//reference of itself

        tShirt1.wear();

        Clothes tshirt2 = new TShirt();//reference of Parent(any Super Class)
        tshirt2.wear();

        Object tshirt3 = new TShirt();
//        tshirt3.wear(); --> Object is a parent of all classes it doesn't know wear() method, bc it doesn't have a reference to wear() method
//        HasHood tshirt4 = new TShirt(); --> Tshirt class does not implement HasHood interface
        //-----------------------
        System.out.println();
        //all possible objects of tshirts
       Jacket jacket1 = new Jacket();//reference of itself
       jacket1.wear();
       jacket1.putOnHood();

       Clothes jacket2 = new Jacket();//reference of the Super Class
        jacket2.wear();
 //       jacket2.putOnHood(); --> Clothes reference doesn't know/have access to a putOnHood() method
        Object jacket3 = new Jacket();
//        jacket3.wear();
//        jacket3.putOnHood();
        //Obj class doesn't have reference to wear() or putOnHood() methods

        HasHood jacket4 = new Jacket();
//        jacket4.wear(); HasHood reference doesn't have visibility to wear() method
        jacket4.putOnHood();
        System.out.println();

        buy(tShirt1);
        buy(jacket1);
        buy(new TShirt());
        buy(new Jacket());
    }
    public static void buy(Clothes clothes){
        if(clothes instanceof TShirt){
            System.out.println("Bought TShirt");
        } else if (clothes instanceof Jacket) {
            System.out.println("Bought a cool jacket");
        }
    }

//   public static void buy(TShirt tShirt){}
//    public static void buy(TShirt tShirt){}
}
