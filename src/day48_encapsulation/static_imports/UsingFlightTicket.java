package day48_encapsulation.static_imports;

import day48_encapsulation.FlightTicket;

public class UsingFlightTicket {

    public static void main(String[] args) {
        FlightTicket ticket = new FlightTicket("First", "Miami","Chicago");
        System.out.println(ticket);
        ticket.setType("business");
        System.out.println(ticket.getType());
        ticket.setType("none");
        System.out.println(ticket.getType());
    }



}
