package day06_03_02_2022;

public class P02_SearchResult {
    public static void main(String[] args) {
       /*
        Task 2 : Assume that you searched a word in Google  Search Engine.After that you took a result message like this


       "About 3,640,000,000 results (0.78 seconds)"

        According to this result print out search Time and number of Result

        Input :  "About 640,000,000 results (0.78 seconds)"

        Output:
                    Result number is 640,000,000
                    Response time is 0.78 seconds
         */

        String result = "About 640,000,000 results (0.78 seconds)"; // I need to find position of 6 and end of 0

        int startIndex = result.indexOf(" ");
                int endIndex = result.indexOf(" ", startIndex+1); // end point is not included that's why we use +1
        String searchResult = result.substring(startIndex+1, endIndex); // end index is not included no need for +1
        System.out.println("search result = "+searchResult);

        startIndex = result.indexOf("(");
        endIndex = result.indexOf(")");

        String searchTime = result.substring(startIndex+1,endIndex);
        System.out.println("searchTime = "+ searchTime);





    }
}
