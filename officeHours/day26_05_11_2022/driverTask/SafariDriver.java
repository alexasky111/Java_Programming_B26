package day26_05_11_2022.driverTask;

public class SafariDriver extends RemoteWebDriver implements SmartBrowser{

    @Override
    public void talk() {
        System.out.println("talking");
    }

    @Override
    public void fast() {
        System.out.println("going fast");
    }

    @Override
    public void secure() {
        System.out.println("securing");
    }
}
