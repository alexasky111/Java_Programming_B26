package day15_switch;

import java.util.Scanner;

public class AuthorsBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Genre: ");
        String genre = input.nextLine();

        int pageLength = 0, profit = 0, sequels = 0, countries = 0;
        boolean isGenre = true;


        switch (genre) {
            case "Fantasy":
                pageLength =500;
                profit = 1_000_000;
                sequels = 5;
                countries = 50;
                break;
            case "Detective":
                pageLength = 350;
                profit =700_000;
                sequels =3;
                countries = 45;
                break;
            case "Science Fiction":
                pageLength = 720;
                profit = 900_500;
                sequels = 4;
                countries = 30;
                break;
            case "Short Story":
                pageLength = 150;
                profit = 300_000;
                sequels = 1;
                countries = 40;
                break;

            default:
                isGenre = false;
                System.out.println("There is no data based on this genre");
        }
        if(isGenre){
            System.out.println("Your genre is "+genre+"\npage lenghth = "+pageLength+"\nprofit = "+profit+"\nsequels = "+sequels+"\ncountries = "+countries);
        }


    }
}
