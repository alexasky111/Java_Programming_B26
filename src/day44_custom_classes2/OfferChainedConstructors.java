package day44_custom_classes2;

public class OfferChainedConstructors {
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

    public OfferChainedConstructors(String company, String location) {
        this.location = location;
        this.company = company;
    }

    public OfferChainedConstructors(String company, String location, double salary) {
       this(location,company);
        this.salary = salary;
    }

    public OfferChainedConstructors(String company, String location, double salary, boolean isFullTime, int numberOfPto) {
        this(company,location,salary);
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
        return "Offer{" +
                "company='" + company + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                ", numberOfPto=" + numberOfPto +
                '}';
    }
}
