package day07_05_23_2022.callCenter;

public class CallCenter {
    public static void main(String[] args) {
        WhatsApp wa = new WhatsApp();

        wa.launch();
        wa.allOSCompatible = true;
        wa.isFree = true;
        wa.name = "What's up";

        //wa.count; -> private not accessible

        wa.call("Mehmet");
        wa.sendMessage("Thank you Mehmet");
        wa.videoCall();
        wa.accept();

        VoiceCallable.decline();




    }
}
