package day25_05_10_2022.studentTask;

public abstract class Student extends Person{
     /*
      Student (abstract) inherits Person
                instance variables:      batchNumber
                abstract method:         attendClass()
                non-abstract method:     code(String language)
     */

    private String batchNumber;


    public Student(String name, int age, String batchNumber) {
        super(name, age);
        this.batchNumber = batchNumber;
    }

    public  abstract void attendClass();

    public  void code(String language){
        System.out.println("Student is using codin language "+language);
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }
}
