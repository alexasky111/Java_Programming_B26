package day56_polymorphism.web_element;

public interface WebElement {
    /*
    create an interface WebElement
    create abstract methods:
        void click()
        String getText()
        void sendKeys(String txt)
*/
    void click();
    String getText();
    void sendKeys(String txt);
}
