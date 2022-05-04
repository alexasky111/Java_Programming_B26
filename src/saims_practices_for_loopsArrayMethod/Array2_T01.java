package saims_practices_for_loopsArrayMethod;

public class Array2_T01 {
    public static void main(String[] args) {
        /*
 Website checker
        Given some urls determine how many .com, .org, and .edu websites
there are. Also keep track of an ‘other’ category for websites that have
a different domain

        Sample websites for an array:
bing.com, wikimedia.org, twitter.com, amazonaws.com, japanpost.jp, mysql.com,
nasa.gov, linkedin.com, ucla.edu, github.io, spotify.com, mozilla.org, nba.com,
comcast.net, tamu.edu, utexas.edu,
         */
        String [] url = {"bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com","nasa.gov", "linkedin.com", "ucla.edu", "github.io", "spotify.com", "mozilla.org", "nba.com","comcast.net", "tamu.edu", "utexas.edu"};
        int countCom = 0;
        int countOrg = 0;
        int countEdu = 0;
        int other = 0;

        for (int i = 0; i < url.length; i++) {

            if (url[i].contains(".com")) {
                countCom++;
            } else if (url[i].contains(".org")){
                countOrg++;
            } else if (url[i].contains(".edu")){
                countEdu++;
            }else {
                other++;
            }

        }


        System.out.println("url ending w/ .com "+countCom+"\nurl ending w/ .edu "+countEdu+"\nurl ending w/ .org "+countOrg+"\nand others: "+other);









    }
}
