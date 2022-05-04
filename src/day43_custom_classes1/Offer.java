package day43_custom_classes1;

public class Offer {
    //location, company, salary, is full time, number of PTO
    String location, company;
    int salary, numberOfPTO;
    boolean isFullTime;

    public Offer(String company, String location) {
        this.company = company;
        this.location = location;
    }

    public Offer(String company, String location, int salary) {
        this.company = company;
        this.location = location;
        this.salary = salary;
    }

    public Offer(String company, String location, int salary, boolean isFullTime, int numberOfPTO) {
        this.company = company;
        this.location = location;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }

    public String toString() {
        String object = "The company's name is " + company + "\nIt's location is in " + location;
        if (salary != 0) {
            object += "\nYour approximate salary is " + salary;
        }
        if (isFullTime) {
            object += "\nYou are hired on a full time position";
        } if (numberOfPTO != 0){
            object+="\nIt looks like the number of PTO for your position is "+numberOfPTO+" days";
        }
        return object;
    }
}

