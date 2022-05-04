package morning_practice.saims_recent_practices.entertainment;

public class LiveShow extends Entertainment{
    String location;

    public LiveShow(String company, String location) {
        super("Live Show",company);
        this.location = location;
    }
}
