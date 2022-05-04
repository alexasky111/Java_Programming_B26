package day50_inheritance.book.discord_user;

public class Student extends DiscordUser{

    public Student (String name, long id){
        super("Student", name, id);
    }

    public void sendMessage(){
        System.out.println("Sending a message to the class chat");
    }
}
