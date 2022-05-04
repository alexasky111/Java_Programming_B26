package day06_03_02_2022;

public class CategoryNumber {
    public static void main(String[] args) {

        /*
    Task 1 : Assume that you searched a baby toy in Etsy.When you open related category your url is :

        "https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049"
                               (main category)

        According to this result print out main category name

            Input :  https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049

            Output:
                Main Category name is  toys and games

            Input :  https://www.etsy.com/c/toys-and-entertainment?ref=catnav-11049
                                              (main category)

            Output:
                Main Category name is  toys and entertainment
     */
        // SUBSTRING, INDEXOF, CONTAINS, REPLACE

        String url = "https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049";
        // find the same character
        int startIndex = url.indexOf("c/");
        int endIndex = url.indexOf("?");

        String categoryName = url.substring(startIndex+2, endIndex);
                                //this part is included --> this part is not
        System.out.println(categoryName);
        categoryName = categoryName.replace('-', ' ');
        // how to get rid of the end of the string:

        if(url.contains("/")) {

            categoryName = categoryName.substring(0, categoryName.indexOf("/"));

        }


        System.out.println(categoryName);















    }
}
