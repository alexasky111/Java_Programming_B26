package day03_04_18_2022;

public class Book {
    /*
       -Create a class named Book,
        -5 Instance variables : String name, category, author, bookID;
                              int shelfNum(assign it with respect to categories );
*/
    String name, category, author, bookID;
    int shelfNum;
    static int bookCount;

    //    -1 Static variable :    int bookCount; (initiate it in a static block)

    static {
        bookCount = 0;
    }

    //    -3 constructors : name /// name + category /// name + category + author  (implement constructor chaining)
    public Book(String name) {
        this.name = name;
        bookCount++; //every obj creation will increase a count
    }

    public Book(String name, String category) {
        this(name);
        this.category = category;
    }

    public Book(String name, String category, String author) {
        this(name, category);
        this.author = author;
        IDgenerator(); // to not cal the m-thod every time, just put it in the Constructor
    }

    /*
                         2- IDgenerator() -> assign shelfNum and assign bookID with that format; ShelfNum_AuthorNameInitial_BookNameFirst2letters
                         (eg: adventure book =>  Moby Dick / Herman Melville; bookID= 1_H_Mo)

                                            Categories:  - Adventure (shelfNum = 1)
                                                         - Classics (shelfNum = 2)
                                                         - Comics (shelfNum = 3)
                                                         - Fantasy (shelfNum = 4)
                                                         - History (shelfNum = 5)
                                                         - Otherwise (shelfNum = 0)
     */
    public void IDgenerator() {

        switch (category.toLowerCase()) {
            case "adventure":
                shelfNum = 1;
                break;
            case "classics":
                shelfNum = 2;
                break;
            case "comics":
                shelfNum = 3;
                break;
            case "fantasy":
                shelfNum = 4;
                break;
            case "history":
                shelfNum = 5;
                break;
            default:
                shelfNum = 0;
        }
        bookID = "" + shelfNum + "_" + author.substring(0,1) +"_" + name.substring(0, 2);
    }

    /*  -2 methods : 1- toString()
     */

    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", author='" + author + '\'' +
                ", bookID=" + bookID +
                ", shelfNum=" + shelfNum +
                '}';
    }

}
