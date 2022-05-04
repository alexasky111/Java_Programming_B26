package day22_04_27_2022.adressTask;

public class Address {
    /*
    Task 2: AddressTask

    Create a class named Address

        Private variables:
                street, city, state, zipCode,country

        encapsulate all the fields

        add a constructor that can set all the instances

        - The street name cannot be Empty
        - ZipCode length should be equal to 5
 */
    private String street, city, state, zipCode, country;

    public Address(String street, String city, String state, String zipCode, String country) {
        setStreet(street);
        this.city = city;
        this.state = state;
        setZipCode(zipCode);
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if (!street.isEmpty()) {
            this.street = street;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

//    public String getZipCode() {
//        return zipCode;
//    }

    public void setZipCode(String zipCode) {
        if (zipCode.length() == 5) {
            this.zipCode = zipCode;
        }
    }

    public String getCountry() {
        return country;
    }

//    public void setCountry(String country) {
//        this.country = country;
//    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
