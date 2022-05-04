package day45_custom_classes;

public class Offer {
    /*
        create a class called Offer

        - data:

            location, company, salary, is full time, number of PTO
    */


    String company;
    String location;
    double salary;
    boolean isFullTime;
    int numberOfPto;


    /*
        - constructor

            - create a constructor that creates an Offer object with the company and location

            - create a constructor that creates an Offer object with the company, location, and salary

            - create a constructor that creates an Offer object with the company, location, salary, is full time, and number of PTO

    */

    public Offer(String company, String location) {
        this.location = location;
        this.company = company;
    }

    public Offer(String company, String location, double salary) {
        this(location, company);
        this.salary = salary;
    }

    public Offer(String company, String location, double salary, boolean isFullTime, int numberOfPto) {
        this(location, company, salary);
        this.isFullTime = isFullTime;
        this.numberOfPto = numberOfPto;
    }

    /*
        - method:

            toString()
                print all the employees information

    Create a separate class to create and test the Offer objects
     */

    @Override
    public String toString() {
        return "\n Offer{" +
                "company='" + company + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                ", numberOfPto=" + numberOfPto +
                '}';
    }
}
