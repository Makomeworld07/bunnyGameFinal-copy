import ecs100.*;
/**
 * Code has been taken from my Pokemon project.
 * Support class for Bunnys.
 * A bunny has a name and an image.
 *
 * @author Korimako
 *
 */

public class Bunny {
    // fields
    private String name = "Te Puna"; // Sets the bunny name to Te Puna
    private String image = "card.png"; // Default image

    private int locX = 100; // Image x start position
    private int locY = 100; // Image y start position
      
    private static final double WIDTH = 100;
    private static final double HEIGHT = 100;

    /**
     * Constructor for obj class card.
     * This constructor sets default image to obj.
     * @param key, nm, auth, qty, img.
     */
    public Bunny()
    {
        
    }
    
    /**
     * Getter for img location X.
     */
    public int getLeft(){
        return locX;
    }

    /**
     * Getter for img location Y.
     */
    public int getTop(){
    return locY;
    }

    public double getRight(){
        double locaX = (double) locX;
        return locaX+WIDTH;
    }

    public double getBottom(){
        double locaY = (double) locY;
        return locaY+HEIGHT;
    }
    
    public void jump() {
        UI.println("jumps");
    }
    
    public void feed() {
        UI.println("fed");
    }
    
    public void dig() {
        UI.println("dug");
    }
    
    /**
     * Getter for name.
     * @return String card name.
     *
     */
    public String getName(){
        return this.name;
    }

    /**
     * Getter for image.
     */
    public String getImage() {
        return this.image;
    }
}