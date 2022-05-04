package morning_practice.saims_recent_practices.entertainment;

public class Netflix extends Streaming{
    String showName;
    int episodeNumber, seasonNumber;

    public Netflix(String company, double duration, String showName, int episodeNumber, int seasonNumber){
        //if String name was hardcoded in Streaming class which is a parent class, it means it was already initialized
        super(company, duration);
        this.showName=showName;
        this.episodeNumber=episodeNumber;
        this.seasonNumber=seasonNumber;
    }
}
