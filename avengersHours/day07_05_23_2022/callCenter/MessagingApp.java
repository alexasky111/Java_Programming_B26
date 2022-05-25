package day07_05_23_2022.callCenter;

import javax.xml.namespace.QName;

public abstract class MessagingApp {
    public String name;
    protected boolean isFree;
    boolean allOSCompatible;
    private int count;

    public static final String APP_TYPE = "Messenger";

    public MessagingApp(String name, int count){
        this.name = name;
        this.count = count;
    }
    public MessagingApp(){

    }

    public abstract void sendMessage(String msn);

    void launch(){
        System.out.println("Messaging app is launching...");
    }
    public static void close(){
        System.out.println("Messaging app is closing");
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
