package array_list_practices;

public class HTMLGenerator {
    public static void main(String[] args) {
        System.out.println(htmGenerate("div^10"));
    }
    public static String htmGenerate(String str) {
        /*
        HTML Generator

Given a String in the following format take the number part of the generator the html tags.
	Tags are surrounded with diamond brackets. The number of times to repeat with be given as the number after the ^

	Ex:
		Input:
			div^2
		Output:
			<div></div> <div></div>

	Ex:
		Input:
			li^3
		Output:
			<li></li><li></li><li></li>
         */
        String[] parts = str.split("\\^");
        String html = "";
        int repeat = Integer.parseInt(parts[1]);
        for (int i = 0; i < repeat; i++) {
            html += "<" + parts[0] + "></" + parts[0] + "> ";

        }

        return html;

                      // How to use repeat method
        //html += "<" + parts[0] + "></" + parts[0] + "> ";
        //html.repeat(3) --> method

                     //String manipulation
        // String word = str.substring(0, str.indexOf("^")); == parts[0]
        // String number = str.substring(str.indexOf("^")+1) == parts[1]

    }
}
