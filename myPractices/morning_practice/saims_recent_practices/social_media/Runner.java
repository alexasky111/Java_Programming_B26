package morning_practice.saims_recent_practices.social_media;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

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

        Instagram obj3 = new Instagram("alexasky", "alexasky", "Oleksandra G");
//        obj3.post(new Picture(new byte [] {1,3,4},".png","my photo" ));
        Instagram obj4 = new Instagram("victoria", "1243V", "Victoria M");

        obj2.setNumberOfFriends(5000);
        obj2.sendFriendRequest(obj1);

        obj1.setNumberOfFriends(1000);
        obj2.setNumberOfFriends(4890);
        obj2.sendFriendRequest(obj1);

        obj1.joinGroup("Obx locals");
        System.out.println(obj1.numberOfGroups);
        obj1.leaveGroup("Obx locals");
        System.out.println(obj1.numberOfGroups);

        ArrayList<SocialMedia> objects = new ArrayList<>(Arrays.asList(obj1, obj2, obj3, obj4));

        for (int i = 0; i < objects.size(); i++) {
            if(objects.get(i) instanceof Facebook){
                if (((Facebook) objects.get(i)).getNumberOfFriends() < 5000){
                    System.out.println(objects.get(i)+" friends less than 5000");
                }
            }
        }

        for(SocialMedia object : objects){
            if(object instanceof Instagram){
                ((Instagram) object).likePicture();
            }
        }


            String res = "";
            for (int i = 0; i < objects.size(); i++) {
                int count = 0;
                for (int j = 0; j < objects.size(); j++) {

                    if (objects.get(i).fullName.equals(objects.get(j).fullName)) {
                        count++;
                    }
                }
                if (count == 2) {
                    if(!res.contains(objects.get(i).fullName)){
                        res += objects.get(i).fullName;
                    }
                }
            }
        System.out.println(res);







          /*
        Create an ArrayList of Social Media objects to store both
Facebook and Instagram objects +
- Find all the Facebook objects that had less than 5000 friends to
they could be added +
- Go through all the Instagram objects and like a picture from each
object +
- Check which user has both Instagram and Facebook object by
comparing their full names +
         */


    }
}
