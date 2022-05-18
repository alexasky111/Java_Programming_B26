package day27_05_2022;

import day26_05_11_2022.driverTask.ChromeDriver;
import day26_05_11_2022.driverTask.FirefoxDriver;
import day26_05_11_2022.driverTask.SafariDriver;
import day26_05_11_2022.driverTask.WebDriver1;



public class P01_Intro {
    public static void main(String[] args) {
        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.get("www.google.com");


        WebDriver1 driver=new ChromeDriver();
        // Reference Type       Objects Type

        driver.get("www.google.com");
        // since we have overriden version of this method
        // it will executed from child class


        WebDriver1 safari=new SafariDriver();
        safari.get("www.google.com");
        // since it is not overriden it will execute code from parent (RemoteWebDriver)
        // safari.talk(); it is not accesible from safari reference type .We can do down casting to access it

        WebDriver1 firefox=new FirefoxDriver();
        firefox.get("www.google.com");
        // since it is not overriden it will execute code from parent (RemoteWebDriver)

    }
}
