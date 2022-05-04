package day07_unary_operators;

public class Store {
    public static void main(String[] args) {
        String store = "Target";
        int numberOfTvs = 100;

        System.out.println("Person comes into the store and they bought a tv");
        System.out.println("Number of tvs now: "+ --numberOfTvs);

        System.out.println("Person comes into the store and they bought a tv");
        System.out.println("Number of tvs now: "+ --numberOfTvs);

        System.out.println("Person comes into the store and they put tb into their cart");
        System.out.println("Numbers of tvs in the store: "+ numberOfTvs--);
        System.out.println("Person bought one TV now, I have now: "+numberOfTvs);

        System.out.println("I get a shipmnet");
        numberOfTvs = numberOfTvs + 13; //that's the shipment
        System.out.println("Tvs in stock: "+ numberOfTvs);


    }
}
