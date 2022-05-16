package morning_practice.saims_recent_practices.social_media;

import java.time.LocalTime;
import java.util.ArrayList;

public class Instagram extends SocialMedia implements hasPictures {


    private int numberOfFollowers;
    private int numberOfFollowings;
    private ArrayList<Picture> pictures;

    public int getNumberOfFollowers() {
        return numberOfFollowers;
    }

    public void setNumberOfFollowers(int numberOfFollowers) {
        this.numberOfFollowers = numberOfFollowers;
    }

    public int getNumberOfFollowings() {
        return numberOfFollowings;
    }

    public void setNumberOfFollowings(int numberOfFollowings) {
        this.numberOfFollowings = numberOfFollowings;
    }


    public ArrayList<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(ArrayList<Picture> pictures) {
        this.pictures = pictures;
    }

    static {
        SocialMedia.platform = "Instagram";
    }

    public Instagram(String username, String password, String fullName) {

        this.username = username;

        if (password.contains(username)) {
            System.out.println("Password contained username. Default password created: ");
            this.password = "password";
        } else {
            this.password = password;
        }
        for (int i = 0; i < fullName.length(); i++) {

            if (!Character.isLetter(fullName.charAt(i)) && fullName.charAt(i) != ' ') {
                System.out.println("invalid name");
                this.fullName = "no name";
                break;
            }

        }
        this.fullName = fullName;
        this.pictures = new ArrayList<>();
    }
    /*
    • Implement all the abstract methods coming from the Social Media class
o Direct messaging (String username, String message)
- print = %message sent to %username
o Post (Object body)
- Let’s keep it simple and say our variable body will be a picture)
Add the picture object
o Notifications ()
- Checks the current time. If the time is between 10 am - 8 pm print "Notification",
otherwise print "Sleep mode"
Note: use this code to get the current hour: LocalTime.now().getHour()
- The return value will be given in 24 hour format.
     */

    @Override
    public void directMessaging(String username, String msg) {
        System.out.println(msg + " sent to " + username);
    }

    @Override
    public void post(Object body) {
        System.out.println("adding new photo" + body);
        getPictures().add((Picture) body);

    }

    @Override
    public void notifications() {
        if (LocalTime.now().getHour() >= 10 && LocalTime.now().getHour() <= 20) {
            System.out.println("Notification");
        } else {
            System.out.println("Sleep mode");
        }
    }

    @Override
    public void likePicture() {
        System.out.println("Liking picture");
    }

    @Override
    public void unLikePicture() {
        System.out.println("unliking picture");
    }

    @Override
    public void sharePicture() {
        System.out.println("sharing picture");
    }

/*
    • Create a class Instagram that will inherit the SocialMedia class
• Add additional instance variables: number of followers, number of
followings, and pictures (ArrayList of Pictures)
• Set the platform for all objects to be "Instagram"
• Encapsulate the variables
• Create a constructor to initialize the username and password
- Set up the user's person url:
"Instagram.com/" + $username
• Implement all the abstract methods coming from the Social Media class
o Direct messaging (String username, String message)
- print = %message sent to %username
o Post (Object body)
- Let’s keep it simple and say our variable body will be a picture)
Add the picture object
o Notifications ()
- Checks the current time. If the time is between 10 am - 8 pm print "Notification",
otherwise print "Sleep mode"
Note: use this code to get the current hour: LocalTime.now().getHour()
- The return value will be given in 24 hour format.
     */
}
