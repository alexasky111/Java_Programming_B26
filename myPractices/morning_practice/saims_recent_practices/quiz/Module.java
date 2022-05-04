package morning_practice.saims_recent_practices.quiz;

import morning_practice.saims_recent_practices.quiz.File;

import java.util.ArrayList;

public class Module {
    ArrayList<File> files = new ArrayList<>(); //why we don't do it inside

    public Module() {

    }

    public Module(ArrayList<File> file) { //Why ArrayList<File> not File file
        this();
        files.addAll(file);
    }

    public void addFile(File file) {
        files.add(file);
//        System.out.println(files);
    }

    public void removeFile(File file) {
        files.remove(file);
        System.out.println(files);
    }

    @Override
    public String toString() {
        return "Module{" +
                "files=" + files +
                '}';
    }
}
