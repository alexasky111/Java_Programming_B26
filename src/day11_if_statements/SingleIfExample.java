package day11_if_statements;

public class SingleIfExample {
    public static void main(String[] args) {


                int year = 2022;
                boolean lockdown = year == 2020 || year == 2021;
                if(lockdown){
                    System.out.println("Stay at home");
                    System.out.println("Practice Java");
                    System.out.println("Wear a mask");
                }
                if(!lockdown){
                    System.out.println("Party");
                    System.out.println("Practice Java");
                }
            }
        }



