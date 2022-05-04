package day35_return_method;

public class CurrencyConverter {
    public static void main(String[] args) {
        System.out.println(convert("euro",100));

    }
    public static double convert(String type, double amount){
        // 1. Because we are using switch it must match exactly
        switch (type.toLowerCase()) {
            case "euro":
                return amount * 0.91;
            case "yen":
                return amount * 121.03;
            case "lira":
                return amount * 12.85;
            case "won":
                return amount * 1_217.52;
            case "repee":
                return amount * 181.45;
            default:
                return 0; // In all cases I will have a return type
        }
    }
}
