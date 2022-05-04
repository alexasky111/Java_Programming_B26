package day50_inheritance.book.computer;

public class Windows extends Computer{
    public Windows(int memory){
        super("Windows", memory);
    }
    //calls the parent constructor, which sets the os variable to be Windows, and sets the memory variable to be the argument from the Windows Constructor

}
//Windows is a Computer
