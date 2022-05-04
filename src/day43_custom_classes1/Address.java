package day43_custom_classes1;

public class Address {
    String street, city,state, zipcode;

    //This is the Constructor
//    public Address(String inputStreet, String inputCity, String inputState, String inputZipcode) {
//        street = inputStreet;
//        city = inputCity;
//        state = inputState;
//        zipcode = inputZipcode;
//
//    }
    // Now instead of using different names for instance variables and local variables to the Constructor --> we used this. to keep all the variable the same name
    public Address(String street, String city, String state, String zipcode){
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }
}
