package day50_inheritance.book.discord_user;

public class DiscordUser {
    String role, name;
    long id;

    public DiscordUser(String role, String name, long id){
        this.role = role;
        this.name = name;
        this.id = id;
    }

    public String toString(){
        return "In Discord your role is "+role+"\nYour name is "+name+"\nYour id is "+id;
    }
}
