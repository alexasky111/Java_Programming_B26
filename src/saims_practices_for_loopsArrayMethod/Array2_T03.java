package saims_practices_for_loopsArrayMethod;

public class Array2_T03 {
    public static void main(String[] args) {
        /*
 Countries
        Given a String array of countries:
String[] countries = {
"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
"Albania", "Portugal", "Philippines", "Armenia", "Colombia",
"Honduras", "Indonesia", "United States"
};
- Find and print all the first and last characters of each country
- Find and print all the countries that end with the letter ‘a’
- Create “contains logic” to check if there is a certain country in the array. Can check for
the United States, or use Scanner to check any country
         */

        String [] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia", "Colombia",
                "Honduras", "Indonesia", "United States"};
        String initials = "";
        int count = 0;
        for (int i = 0; i < countries.length; i++) {

        initials += ""+countries[i].charAt(0) + countries[i].charAt(countries[i].length()-1) + ", ";
            count++;


        }
        System.out.println(initials);

        for (int i = 0; i < countries.length; i++) {

            if (countries[i].endsWith("a")){
                System.out.println(countries[i]+", ");
            }

        }

        for (int i = 0; i < countries.length; i++) {

            if (countries[i].contains("United States")){
                System.out.println("The Array contains " + countries[i]);
            }

        }




    }
}
