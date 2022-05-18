package day27_05_2022;

import day26_05_11_2022.driverTask.ChromeDriver;
import day26_05_11_2022.driverTask.SafariDriver;
import day26_05_11_2022.driverTask.WebDriver1;

public class P03_InstanceOf {

    //create a method that will return us a webDriver based on user inputs

    public static void main(String[] args) {
        WebDriver1 driver1 = DriveUtil.getDriver("safari");
        if(driver1 instanceof SafariDriver){
            ((SafariDriver) driver1).fast();
            ((SafariDriver) driver1).secure();
            ((SafariDriver) driver1).talk();
        }
        System.out.println("----------------------------------------");

        WebDriver1 driver2 = DriveUtil.getDriver("firefox");

        // WebDriver driver =new FirefoxDriver();
            if(driver2 instanceof ChromeDriver){
                ((ChromeDriver)driver2).get("www.google.com");
            } else if (driver2 instanceof SafariDriver) {
                ((SafariDriver) driver2).secure();
            }else {
                driver2.get("www.google.com");
            }

        }
    }




