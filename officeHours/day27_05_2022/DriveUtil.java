package day27_05_2022;

import day26_05_11_2022.driverTask.ChromeDriver;
import day26_05_11_2022.driverTask.FirefoxDriver;
import day26_05_11_2022.driverTask.SafariDriver;
import day26_05_11_2022.driverTask.WebDriver1;

public class DriveUtil {

    public static WebDriver1 getDriver(String browserName) {

        WebDriver1 driver1;
        switch (browserName){
            case "chrome":
                //WebDriverManager.chromedriver.setup();
                driver1 = new ChromeDriver();
                break;
            case "safari":
                //WebDriverManager.safaridriver.setup();
                driver1 = new SafariDriver();
                break;
            case "firefox":
                //WebDriverManager.firefoxdriver.setup();
                driver1 = new FirefoxDriver();
                break;
            default:
                System.out.println("UNKNOWN BROWSER");
                driver1=null;

        }
        return driver1;
    }
}
