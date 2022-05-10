package day25_05_10_2022.studentTask;

public class School {

    public static void main(String[] args) {
        //   Student student=new Student("",24);   not possible to init Abstract class

        OnlineStudent onlineStudent = new OnlineStudent("Mike", 25, "B26");
        onlineStudent.attendClass();
        onlineStudent.sleep();
    }
}