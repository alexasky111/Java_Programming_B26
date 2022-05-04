package day46_static;

public class CydeoStudent {

    //belong to the object(new Cydeo Student) instance var belong to the object
    public String name;
    public int groupNumber;

    //Static Belongs to the Class but instance var belongs to an Object

    //what is smth that Cydeo Student shares
    public static int batchNumber;
    //(multiple information is represented by an arr variable)
    public static String[] instructors;
    public static String schoolName;

    //you can assign and declare at the same time, but it's not recommended we will use static block
    //block of code that runs one time in the beginning; it is related to static members/variables
    static {
        batchNumber = 26;
        instructors = new String []{"Nadir", "Mehmet", "Austin", "Aysun", "Saim"};
        schoolName = "Cydeo";
        printInfo();
    }

    public CydeoStudent(String name, int groupNumber) {
        this.name = name;
        this.groupNumber = groupNumber;
    }

    public static void printInfo(){
        System.out.println("SChool Name "+schoolName);
        System.out.println("Batch number "+batchNumber);
        System.out.println("Instructors "+instructors);
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
