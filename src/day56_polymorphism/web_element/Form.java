package day56_polymorphism.web_element;

public class Form implements  WebElement{
    @Override
    public void click() {
        System.out.println("clicking the form");
    }

    @Override
    public String getText() {
        return "sign up ";
    }

    @Override
    public void sendKeys(String txt) {
        System.out.println("filling up the form");
    }

    public void submit(){
        System.out.println("submitting a form");
    }
}
