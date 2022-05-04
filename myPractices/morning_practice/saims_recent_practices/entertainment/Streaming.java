package morning_practice.saims_recent_practices.entertainment;

public class Streaming extends Entertainment{

    double duration;
    //to call the Parent Constructor->don't forget call it as a constructor w/ a name of current class
    public Streaming(String company, double duration){
        super("Streaming", company);
        this.duration = duration;
    }
}
