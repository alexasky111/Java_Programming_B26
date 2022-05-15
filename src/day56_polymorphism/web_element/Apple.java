package day56_polymorphism.web_element;

import java.util.ArrayList;
import java.util.Arrays;

public class Apple {
    public static void main(String[] args) {
        Form obj = new Form();
        Link obj2 = new Link();
        Input obj3 = new Input();
        Image obj4 = new Image();

        ArrayList<WebElement>elements = new ArrayList<>();
        elements.add(obj);
        elements.add(obj2);
        elements.add(obj3);
        elements.add(obj4);

        elements.addAll(Arrays.asList(obj,obj2,obj3,obj4));

        //execution happens on the object side, whatever was defined in the getText() method in each subClass class thats what will be printed
        for (WebElement each : elements) {
            System.out.println(each.getText());

            if(each instanceof Form){//are you an obj of form, then do the casting, then call .submit() method
                //where are we casting to? to Form class+to prioritize group in () again
                ((Form)each).submit();
            }
        }

        WebElement logo = new Image();
        logo.click(); //is accessible by the WebElement interface ref, then execution happens on obj IMAGE() side
//        logo.extension = ".png";  WebElement interface doesn't have accessibility to the variable
        //MUST DOWNCAST -> TO IMAGE() CLASS
        //((Image)logo) --> cast the logo (WebElement reference) to an Image reference, then Image ref has access
        ((Image)logo).extension = ".png";

        //option 2
        Image logoAsImage = ((Image)logo);
        logoAsImage.extension = ".png";

        /*
        without instanceof part you'd be trying to cast all the objs to Form, but those objs don't have IS A RELATION to Form, they are siblings:

        (Form) link object
         (Form) image object
          (Form) input object
         */
    }
}
