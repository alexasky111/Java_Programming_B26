package day44_custom_classes2;

public class Song {
    String name;
    double length;
    String artist;
    String genre;

            //The main point to not repeat the code, that why this(instanceVarName) instead of this.instanceVarName

    public Song(String name){
        this.name = name;
    }

    public Song(String name, double length) {

//        this.name = name;
        //To call the constructor without repeating
        this(name);
        this.length = length;
    }

    public Song(String name, double length, String artist) {
//        this.name = name;
//        this.length = length;
        //To call the constructor without repeating
        this(name,length);
        this.artist = artist;
    }

    public Song(String name, double length, String artist, String genre) {

//        this.name = name;
//        this.length = length;
//        this.artist = artist;
        //To call the constructor without repeating
        this(name, length, artist);
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
