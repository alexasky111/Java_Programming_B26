package day27_05_2022;

import day26_05_11_2022.driverTask.*;

public class P02_Casting {
    WebDriver1 driver1 = new ChromeDriver();

    public void setDriver1(WebDriver1 driver1) {

    /* UP CASTING

    - Smaller Type to Larger Type (Child to Parents )
    - Implicity

     */

        WebDriver1 driver= new ChromeDriver();
        driver.get("www.google.com");

        TakeScreenShot takeScreenshot=new ChromeDriver();
        takeScreenshot.TakeScreenShot("pic001");


        JavaScriptExecuter js=new ChromeDriver();
        js.executeScript("Executing Script");


        /*
        Why we use WebDriver instead of JS (2) / TakeScreenShot (1) as reference Type ?

            - has more methods
            - we dont need to more downcasting

         */

        /* DOWN  CASTING

        - Larger Type to Smaller Type (Parent to Child  )
        - Explicitly
        - To access features of object type which is not accesible from reference

     */

        WebDriver1 safari=new SafariDriver();
        ((SafariDriver)safari).secure(); //downCasting Exception
        ((SafariDriver)safari).talk(); //downCasting Exception
        ((SafariDriver)safari).fast(); //downCasting Exception


    /*
    NOTE :There must be IS A relation between object type and reference type
          Otherwise it will givce ClassCastException

     */

        WebDriver1 chrome=new ChromeDriver();
        ((SafariDriver)driver).get("www.google.com"); // We did this to get ClassCastException

    }
}
