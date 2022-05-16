package morning_practice.saims_recent_practices.social_media;

import java.time.LocalTime;
import java.util.ArrayList;

public class Facebook extends SocialMedia implements hasGroups {

    private int age;
    private int numberOfFriends;

    private ArrayList<Post> posts;

    int numberOfGroups;

    static {
        SocialMedia.platform = "Facebook";
    }

    public Facebook(String username, String password) {
        this.username=username;
        if (password.contains(username)) {
            System.out.println("Password contained username. Default password created: ");
            this.password = "password";
        } else {
            this.password = password;
        }
        /*
        - Create and assign the user's person url by using 'facebook.com/' and adding
their username at the end
- Create an empty ArrayList of Posts
         */
        this.personalUrl = "facebook.com/" + username;
        this.posts = new ArrayList<>();
    }

    public Facebook(String username, String password, String fullName) {
        this(username, password);

        for (int i = 0; i < fullName.length(); i++) {

            if (!Character.isLetter(fullName.charAt(i))) {
                System.out.println("invalid name");
                this.fullName = "no name";
                break;
            }

        }
        this.fullName = fullName;

        /*
        Overload the constructor to accept the username, password, and the user’s
name. Chain previous constructor
- If the name entered has any characters that are not letters from the
alphabet, then the name is invalid. In this case print “invalid name” and assign the
name value to be ‘no name’
         */
    }

    public Facebook(String username, String password, String fullName, int age, int numberOfFriends) {
        this(username, password, fullName);
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
            this.age = 0;
        }

        if (numberOfFriends <= 5000 && numberOfFriends > 0) {
            this.numberOfFriends = numberOfFriends;
        } else {
            System.out.println("Invalid numberOf");
            this.numberOfFriends = 0;
        }

        /*
        • Overload the constructor to accept the username, password, the user’s
name, age and number of friends. Chain previous constructor
- Only store the age and number of friends into the variables if they are valid
numbers.
- The age cannot be a negative number
- The number of friends cannot be negative or more than 5000.
If they are invalid print “Invalid (age/number of friends) and keep the values as
the default of 0.
         */
    }
    /*
    • Implement all methods coming from Social Media class
o Direct messaging (String username, String message)
- print = %message sent to %username
o Post (Object body)
- Creates a Post object (the class we made earlier, and store the Post
objects to the ArrayList of Posts)
o Notifications ()
- Checks the current time. If the time is between 8 am - 5 pm print
"Notification", otherwise print "Sleep mode"
Note: use this code to get the current hour: LocalTime.now().getHour()
- The return value will be given in 24 hour format.
     */

    @Override
    public void directMessaging(String username, String msg) {
        System.out.println(msg + " sent to " + username);
    }

    @Override
    public void post(Object obj) {

        posts.add(new Post("New Post"));

        System.out.println(obj.toString());
    }

    @Override
    public void notifications() {

        if (LocalTime.now().getHour() >= 8 && LocalTime.now().getHour() <= 17) {
            System.out.println("Notification");
        } else {
            System.out.println("Sleep mode");
        }
    }

    @Override
    public String toString() {
        return "Facebook{" +
                "age=" + age +
                ", numberOfFriends=" + numberOfFriends +
                ", posts=" + posts +
                ", personalUrl='" + personalUrl + '\'' +
                ", accountLength=" + accountLength +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }

    public boolean sendFriendRequest(Facebook obj) {

        if (numberOfFriends >= 5000) {
            System.out.println("You have reached the limit of friends.");
            return false;
        }

        if (obj.numberOfFriends >= 5000) {
            System.out.println(obj.username + " cannot accept any more friend request.");
            return false;
        }
        System.out.println("Friend request sent to " + obj.username);
        numberOfFriends++;

        return true;

    }

    /*
    Create a sendFriendRequest method that will accept a Facebook object and
send them a friend request. The method should return a boolean:
if the friend request was sent (true) or if the friend request was not
sent (false).
- If your friend list is at the 5000 limit then do not send the
request and print “You have reached the limit of friends.”
- If the user you are trying to send the request to has already hit
the limit, then print “$theUsersName cannot accept any more friend
request.
- If both the user and you are under the limit print “Friend
request sent to $theUsersName” and increase your number of friends
by one.
     */

    @Override
    public void joinGroup(String group) {
        System.out.println(username + " has joined " + group);
        numberOfGroups++;
    }

    @Override
    public void leaveGroup(String group) {
        System.out.println(username + " has left " + group);
        numberOfGroups--;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        this.numberOfFriends = numberOfFriends;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }
    /*
    Create a class for a Facebook which inherits the SocialMedia class and has
additional instance variables:
age, number of friends, and posts (ArrayList of Post)
• Encapsulate all the variables.
• Set the platform for "Facebook" using static block
• Create a constructor that will create a Facebook by taking the username and
password.
- If the password contains the username, then it is not a valid password and
should not be saved. In this case Print “Password contained username. Default
password created: ‘password’ and set the password for the user to the default of
‘password’.
- Create and assign the user's person url by using 'facebook.com/' and adding
their username at the end
- Create an empty ArrayList of Posts
• Overload the constructor to accept the username, password, and the user’s
name. Chain previous constructor
- If the name entered has any characters that are not letters from the
alphabet, then the name is invalid. In this case print “invalid name” and assign the
name value to be ‘no name’
• Overload the constructor to accept the username, password, the user’s
name, age and number of friends. Chain previous constructor
- Only store the age and number of friends into the variables if they are valid
numbers.
- The age cannot be a negative number
- The number of friends cannot be negative or more than 5000.
If they are invalid print “Invalid (age/number of friends) and keep the values as
the default of 0.
• Implement all methods coming from Social Media class
o Direct messaging (String username, String message)
- print = %message sent to %username
o Post (Object body)
- Creates a Post object (the class we made earlier, and store the Post
objects to the ArrayList of Posts)
o Notifications ()
- Checks the current time. If the time is between 8 am - 5 pm print
"Notification", otherwise print "Sleep mode"
Note: use this code to get the current hour: LocalTime.now().getHour()
- The return value will be given in 24 hour format.
• Override the toString method to print all the information of a Facebook
• Create a sendFriendRequest method that will accept a Facebook object and
send them a friend request. The method should return a boolean:
if the friend request was sent (true) or if the friend request was not
sent (false).
- If your friend list is at the 5000 limit then do not send the
request and print “You have reached the limit of friends.”
- If the user you are trying to send the request to has already hit
the limit, then print “$theUsersName cannot accept any more friend
request.
- If both the user and you are under the limit print “Friend
request sent to $theUsersName” and increase your number of friends
by one.
     */
}
