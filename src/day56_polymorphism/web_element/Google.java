package day56_polymorphism.web_element;

public class Google {
    public static void main(String[] args) {

        //To create a Link obj w/ WebElement reference
        WebElement link = new Link();

        //To create an Input obj w/ WebElement reference
        WebElement input = new Input();

        WebDriverUtil.clickElement(link);
        WebDriverUtil.clickElement(input);

        WebDriverUtil.clickElement(new Link());

        //To create an arr that stores obj from classes that implement the WebElement interface
        WebElement [] allElements = new WebElement[4];
        // [ null, null, null, null ]
        allElements[0] = link;  // [ LINK obj, null, null, null ]
        allElements[1] = input;  // [ LINK obj, INPUT obj, null, null ]
        allElements[2] = new Input();  // [ LINK obj, INPUT obj, INPUT obj, null ]
//      allElements[3] = new Link();
        allElements[3] = new Image(); // [ LINK obj, INPUT obj, INPUT obj, IMAGE obj ]
    }
}
