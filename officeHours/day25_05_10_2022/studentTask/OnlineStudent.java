package day25_05_10_2022.studentTask;

public  class OnlineStudent extends Student {


    public OnlineStudent(String name, int age, String batchNumber) {
        super(name, age, batchNumber);
    }

    @Override
    public void sleep() {
        System.out.println("Online student is sleeping");
    }

    @Override
    public void attendClass() {
        System.out.println("Online student is attending Classes");
    }
}