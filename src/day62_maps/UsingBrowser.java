package day62_maps;

public class UsingBrowser {
    public static void main(String[] args) {
        Browser browser = Browser.CHROME;

        switch (browser){
            case EDGE:
            case CHROME:
                System.out.println("Opening chromw browser");
                break;
            case SAFARI:
                System.out.println("Opening safari browser");
                break;
            case FIREFOX:

        }
    }

}
