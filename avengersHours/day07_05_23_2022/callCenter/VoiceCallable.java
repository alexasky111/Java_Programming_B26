package day07_05_23_2022.callCenter;

public interface VoiceCallable {
    boolean CAN_CALL = true;
    //instance var in Interface are final, so they have to be initialized

    void call(String contact);//abstract m-thod bc doesn't have a body

    static void decline(){
        System.out.println("Mike declined voice call...");
    }

    public default void accept(){//"default" is a keyword to specify that it is a default method, not the access modifier, the access modifier in interface methods are public
        System.out.println();
    }

}
