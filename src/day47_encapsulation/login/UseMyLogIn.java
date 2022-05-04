package day47_encapsulation.login;


import day47_encapsulation.login.Login;

public class UseMyLogIn {
    public static void main(String[] args) {
        Login obj = new Login();
//        obj.username = "jamesbond";
//        obj.password = "1234";
// cannot access private variables directly

        obj.setUsername("jamesbond");
        obj.setPassword("123");

        System.out.println(obj.getUsername()); //to access the variables
        System.out.println(obj.getPassword());

        obj.setPassword("james007bond");//calling the setter method
        System.out.println(obj.getPassword());//We have to set after get
    }
}
