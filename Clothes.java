import java.awt.image.BufferedImage;

public class Clothes {
    private int ID;
    private int type;
    private double size;
    private BufferedImage image;
    private Clothes next; 

    // Constructor
    public Clothes(int ID, int type, BufferedImage image, double size, Clothes next) {
        this.ID = ID;
        this.type = type;
        this.image = image;
        this.size = size;
        this.next = next;
    }

    public String toString() {
        // Imp
        return "";
    }

    // Getter and setter methods

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }
}
