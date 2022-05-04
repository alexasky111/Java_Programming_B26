package day13_if_statements;

import java.util.Scanner;

public class Language {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please choose the number based on the language you want to use: \n\t1 - English\n\t2 - Spanish\n\t3 - Turkish\n\t4 - Russian\n\t5 - French");
        int num = input.nextInt();
        System.out.println("----------------Result------------------");
        String message;
//        if(num==1) {
//            message = "hello, thank you for your call";
//        } else if (num==2) {
//            message = "hola, gracias para llamar";
//        } else if (num==3) {
//            message="merhaba, aradiginiz icin tesekkurler";
//        } else if (num==4) {
//            message="privet, spasibo za vash zvonok";
//        } else if (num==5) {
//            message="Merci ,pour votre appel";
//        } else {
//            message="We will use English by default";
//        }

        message = num==1 ? "hello, thank you for your call" : num==2? "hola, gracias para llamar" : num==3? "merhaba, aradiginiz icin tesekkurler" : num==4? "privet, spasibo za vash zvonok" : num==5? "Merci ,pour votre appel": "We will use English by default";
        System.out.println(message);
    }
}
