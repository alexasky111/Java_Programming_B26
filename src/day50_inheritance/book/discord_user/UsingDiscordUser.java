package day50_inheritance.book.discord_user;

public class UsingDiscordUser {
    public static void main(String[] args) {

        DiscordUser user = new DiscordUser("Discord member", "Alex", 73465756L);
        System.out.println(user);

        Student student =new Student("Sasha", 3845875L);

        student.sendMessage();
        System.out.println(student); //prints w/ toString() even though there are non in the Class Student

        Admin admin = new Admin("Hanna", 237595L);
        admin.createChannel();
        System.out.println(admin);//prints w/ toString() even though there are non in the Class Student


    }
}
