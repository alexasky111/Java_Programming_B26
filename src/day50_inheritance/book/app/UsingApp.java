package day50_inheritance.book.app;

public class UsingApp {

    public static void main(String[] args) {
        App app = new App("Generic app", 1.0);
//        System.out.println(app); -->can't print right away bc no toString()
        app.download();

        Instagram instagram = new Instagram(2.0);
        instagram.download();

        instagram.version = 3.0;
        instagram.download();
        instagram.postPicture();
//        instagram.watchVideo() --> error bc Instagram didn't inherit watchVideo() m-thod from Youtube
        Youtube youtube = new Youtube(5.0);
        youtube.watchVideo();
        youtube.download();
    }

}
