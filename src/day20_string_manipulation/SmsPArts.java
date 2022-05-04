package day20_string_manipulation;

public class SmsPArts {
    /*
    Given a String in the following format:
“Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and
problem solving}”
Separate these parts and print them separately:
Sender: actualSender
Number: actualNumber
Message: actualMessage”
     */
    public static void main(String[] args) {


        String msg = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}";

        int senderStart = msg.indexOf('<'); //I'm givivng the character to find the position
        int senderEnd = msg.indexOf('>');

        int numberStart = msg.indexOf('[');
        int numberEnd = msg.indexOf(']');

        int msgStart = msg.indexOf('{');
        int MsgEnd = msg.indexOf('}');

        System.out.println("Sender: "+msg.substring(senderStart+1,senderEnd));
        System.out.println("Message: "+msg.substring(numberStart+1,numberEnd));


    }

}
