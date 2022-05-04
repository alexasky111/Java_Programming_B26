package day48_encapsulation;

public class FlightTicket {
    private String type, departureLocation, arrivalLocation;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        switch(type.toLowerCase()){
            case "first":
            case "business":
            case "economy":
                this.type = type;
        }
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    @Override
    public String toString() {
        return "FlightTicket{" +
                "type='" + type + '\'' +
                ", departureLocation='" + departureLocation + '\'' +
                ", arrivalLocation='" + arrivalLocation + '\'' +
                '}';
    }

    public FlightTicket(String type, String departureLocation, String arrivalLocation){
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
        setType(type);






    }

}
