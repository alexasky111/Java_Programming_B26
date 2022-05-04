package day54_abstraction.creating;

public class Runner {
    public static void main(String[] args) {

//        Create obj = new Create(); --> cannot make obj of interfaces
        Book obj = new Book(); //Book is a normal, non-abstract Class
        obj.read();
        obj.write();
    }
}
