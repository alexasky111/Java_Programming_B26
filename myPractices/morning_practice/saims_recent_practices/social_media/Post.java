package morning_practice.saims_recent_practices.social_media;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post {
    /*
    Create a class that has the following instance variable:
String body, and String dateTime
- Encapsulate body. Provide a public getter and setter
- Make dateTime final, private, read only (getter, but no setter)
• Create a constructor that will take and initialize the body instance variable.
Upon creation of the post the current date and time should be taken and
stored into the dateTime variable. Use the code given below
Note: Since we didn’t learn this class use the follow code:
 this.dateTime =
LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy
| hh:mm a"));
➔Need to have these two imports for the above code:
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
     */
    private String body;
    final private String dateTime;

    public Post(){
        this.body = getBody();
        this.dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy | hh:mm a"));
    }

    public String getDateTime() {
        return dateTime;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
