package day07_05_23_2022.callCenter;

public class WhatsApp extends MessagingApp implements VideoCallable, VoiceCallable{



    //we have default constr here, super()-> it calls the non parameterized constructor of super class
    @Override
    public void sendMessage(String msn) {
        System.out.println("sending msg");
    }

    @Override
    public void videoCall() {
        System.out.println("making a video");
    }

    @Override
    public void call(String contact) {
        System.out.println("calling");
    }

    public void launch(){
        System.out.println("Launching mehtod in What's up");
    }
}
