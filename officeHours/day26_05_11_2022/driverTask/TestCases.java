package day26_05_11_2022.driverTask;

public class TestCases {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.google.com");
        chromeDriver.TakeScreenShot("picture01");
        chromeDriver.close();

        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("https://www.google.com");
        firefoxDriver.TakeScreenShot("picture02");
        firefoxDriver.close();

        SafariDriver safariDriver = new SafariDriver();
        safariDriver.get("https://www.google.com");
        safariDriver.TakeScreenShot("picture03");
        safariDriver.close();
    }

}
