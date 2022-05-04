package day22_04_27_2022.adressTask;

public class UsingAddress {
    public static void main(String[] args) {
       Address cydeo = new Address("7925 Jones Branch DR Suite 3300","McLean","VA", "223182", "USA");
        System.out.println(cydeo);

        //write data --> SETTER
        cydeo.setCity("Tysons");

        //read data --> GETTER
        System.out.println(cydeo.getCity());

        /*
        Make country name READ_ONLY
        - Delete Setter m-thod for country name
         */
//        cydeo.setCountry(""); --> it is READ_ONLY
        /*
        Make zipCode WRITE_ONLY
        - Delete Getter
         */
//        cydeo.getZipCode(""); --> it is WRITE_ONLY

    }
}
