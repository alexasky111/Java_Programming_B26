package day58_exceptions.homework;

public class Runner {

    public static void main(String[] args) {
      Pen pen1 = new Pen();
      pen1.inkColor = "red";
      pen1.inkLevel = 20;

      try{
          pen1.changeColor("blue");
      }catch(InvalidColorException e){
          e.printStackTrace();
        }

      pen1.write();

      Pen pen2 = new Pen();
      pen2.inkLevel = 9;
      pen2.inkColor = "purple";

      try{
          pen2.write();
      }catch(OutOfInkException e){
          System.out.println(e.getMessage());
        }finally {
          System.out.println(pen2.inkLevel);
          System.out.println(pen2.inkColor);
      }

      Pen pen3 = new Pen();
      pen3.inkColor="orange";

      try{
          pen3.changeColor("dark");
      }catch(InvalidColorException e){
          System.out.println(e.getMessage());
      }




    }
}
