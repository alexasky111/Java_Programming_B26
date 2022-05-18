package day26_05_11_2022.driverTask;

public class ChromeDriver extends RemoteWebDriver{
//it inherited an abstract class w/ all the interfaces

    @Override
    public void get(String URL) {
        System.out.println("Opening in Chrome");
    }

}
