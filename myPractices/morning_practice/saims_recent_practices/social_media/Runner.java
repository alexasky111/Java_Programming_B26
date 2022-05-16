package morning_practice.saims_recent_practices.social_media;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        /*
        Create an ArrayList of Social Media objects to store both
Facebook and Instagram objects
- Find all the Facebook objects that had less than 5000 friends to
they could be added
- Go through all the Instagram objects and like a picture from each
object
- Check which user has both Instagram and Facebook object by
comparing their full names
         */

        Facebook obj1 = new Facebook("alexasky","alexasky","Oleksandra P");
        System.out.println(obj1);
        System.out.println(obj1.platform);

        obj1.numberOfGroups = 5;
        obj1.setNumberOfFriends(5001);

        Facebook obj2 = new Facebook("alexasky","7511iyo","Oleksandra G");
        obj2.setAge(18);
        obj2.post(new Post("Welcome to Cydeo"));
        System.out.println(obj2.getPosts());

        System.out.println(obj2.platform);

        obj2.numberOfGroups = 10;
        obj2.setNumberOfFriends(5000);
        System.out.println(obj2);

    }
}
