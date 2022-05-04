package day31_arrays_continue;

public class AWS {
    public static void main(String[] args) {
        // app and we want to deploy on multiple zones
        String app = "etsy";
        String zones = "us-east1,us-west1,us-west2,us-west3";

        //1. to split by coma character
        String [] allZones = zones.split(",");

        //2. to make a loop to go through each element in an Array allZones
        for (String eachZone : allZones) {
            System.out.println(app+" is deploying on "+eachZone);

        }
        //original loop example
//        for (int i = 0; i < allZones.length; i++) {
//            System.out.println(app+" is deploying on "+allZones[i]);
//
//        }

















    }
}
