package day56_polymorphism.web_element;

public class Image implements WebElement{

    String extension;

    @Override
    public void click() {
        System.out.println("clicking the img");
    }

    @Override
    public String getText() {
        return "text description";
    }

    @Override
    public void sendKeys(String txt) {
        System.out.println("uploading img");
    }


}
