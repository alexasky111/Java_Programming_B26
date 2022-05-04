package morning_practice.saims_recent_practices.quiz;

import java.util.ArrayList;

public class UsingCanvas {
    public static void main(String[] args) {
        Canvas canvas = new Canvas("OOP concepts");
        System.out.println(canvas.topic);
        System.out.println(canvas.quizzes);
        System.out.println(canvas.modules);

        System.out.println("----------------------------------------------");

        Quiz obj2 = new Quiz("Encapsulation", 25, 100);
        obj2.takeQuiz();
        System.out.println(obj2.topic);
        System.out.println(obj2.totalNumOfQuestions);
        System.out.println(obj2.totalPoints);
        System.out.println(obj2);
        Quiz obj3 = new Quiz("Inheritance", 20, 100);
        Quiz obj4 = new Quiz("Abstraction", 25, 100);

        System.out.println("----------------------------------------------");

        File obj1 = new File("Practice", 10); //creating obj1 of File
        obj1.openFile(); //using method from File Class
        System.out.println(obj1);
        File obj5 = new File("Recap", 10); //creating obj5 of File
        File obj6 = new File("Recap2", 10.9); //creating obj6 of File

        System.out.println("----------------------------------------------");

        Module module = new Module();
        module.addFile(obj1); //using method addFile() from Module Class -> adding File obj into ArrayList files from Module Class
        module.addFile(obj5);//using method addFile() from Module Class -> adding File obj into ArrayList files from Module Class
        module.addFile(obj6);//using method addFile() from Module Class -> adding File obj into ArrayList files from Module Class
        System.out.println(module.files); //printing an ArrayList 'files' from Module class with obj1 & obj5 as 'files' elements
        module.addFile(obj1);
        module.removeFile(obj6);
        System.out.println(module.files);

        System.out.println("----------------------------------------------");

        ArrayList<Quiz> quizzes = new ArrayList<>(); //to hold all the
        quizzes.add(obj2); //adding obj2 as an element of ArrayList from Canvas Class
        quizzes.add(obj3); //adding obj3 as an element of ArrayList from Canvas Class
        quizzes.add(obj4); //adding obj4 as an element of ArrayList from Canvas Class
        System.out.println(quizzes);



    }
}
