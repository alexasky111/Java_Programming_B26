package day56_polymorphism.web_element;

public class Link implements WebElement{
    /*
    create a class Link
    implement the WebElement interface and implement all abstract methods
     */

    @Override
    public void click() {
        System.out.println("Clicking on the current link");
    }

    @Override
    public String getText() {
        return "https://google.com";
    }

    @Override
    public void sendKeys(String txt) {
        System.out.println("sendKeys is: "+txt);
    }
}
