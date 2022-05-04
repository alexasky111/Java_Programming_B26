package morning_practice.saims_recent_practices.entertainment;

import java.util.ArrayList;

public class Youtube extends Streaming{
    String videoName, channelName;
    int viewCount;
    ArrayList<String> comments;

    public Youtube(String company, double duration, String videoName, String channelName, int viewCount, ArrayList<String> comments){
        super(company,duration);
        this.videoName=videoName;
        this.channelName=channelName;
        this.viewCount=viewCount;
        this.comments=comments;
    }
}
