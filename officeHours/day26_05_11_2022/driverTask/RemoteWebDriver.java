package day26_05_11_2022.driverTask;

public class RemoteWebDriver implements WebDriver1,JavaScriptExecuter,TakeScreenShot{
    @Override
    public void executeScript(String script) {
        System.out.println("Executing Script");
    }

    @Override
    public void TakeScreenShot(String name) {
        System.out.println("Taking screenshot");
    }

    @Override
    public void get(String URL) {
        System.out.println("opening website");
    }

    @Override
    public void close() {
        System.out.println("closing browser");
    }

    @Override
    public void quit() {
        System.out.println("quiting the window");
    }
}
