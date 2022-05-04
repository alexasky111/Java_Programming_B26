package day34_void_method;

public class CurrencyType {
    public static void main(String[] args) {
        /*
        create a method that will accept a currency type(String) and a currency amount (double)[as dollars] and convert the currency from dollars to a different type

Use the following information to convert from given dollars to the desired currency type

1 dollar = 0.91 euro
1 dollar = 121.03 yen
1 dollar = 14.85 lira
1 dollar = 1,217.52 won
1 dollar = 181.45 rupee

Note: Don't worry about decimal formats, focus on method
Ex:
	Input:
		euro, 100

	Output:
		91

Ex:
	Input:
		yen, 50

	Output:
		6051.5
____________________________
         */
        System.out.println(convertedAmount("euro", 100));
        System.out.println(convertedAmount("yen", 1000));
        System.out.println(convertedAmount("something", 10));

    }
    public static String convertedAmount (String currencyType, double currencyAmount){

        switch (currencyType){
            case "euro":
                return currencyAmount*0.91 + " euro";
            case "yen":
                return currencyAmount*121.03 + " yen";
            case "lira":
                return currencyAmount*14.85 + " lira";
            case "won":
                return currencyAmount*1217.52 + " won";
            case "rupee":
                return currencyAmount*181.45 + " rupee";
            default :
                return "Invalid curerency";
        }


    }
}
