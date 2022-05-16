package morning_practice.saims_recent_practices.social_media;

public class Picture {
    private final byte [] image;
    private final String extension;
    private String caption;

    public byte[] getImage() {
        return image;
    }

    public String getExtension() {
        return extension;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Picture(byte[] image, String extension, String caption) {
        this.image = image;
        this.extension = extension;
        this.caption = caption;
    }

    /*
    • Create a class that has the following instance variable:
- byte [] image
- extension (String)
- caption
- Encapsulate the caption.
- make the image and extension final, private, and read-only (getter, but no
setter)
• Create a constructor that will take and initialize image, extension, and
caption
     */
}
