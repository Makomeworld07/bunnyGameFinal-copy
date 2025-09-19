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
    private String image = DEFAULT_IMAGE; 
    static final String DEFAULT_IMAGE = "bunnyPixelDefault.png"; // Set as bunny default image
    static final String DIG_IMAGE = "bunnyPixelDig.png"; // Bunny dig image
    static final String HEART_IMAGE = "bunnyPixelHeart.png"; // Bunny heart image
    static final String DIRTY_IMAGE = "bunnyPixelDirty.png"; // Bunny dirty image
    
    private int locX = 200;// Image x start position
    private int locY = 150; // Image y start position
      
    private static final double WIDTH = 250;
    private static final double HEIGHT = 250;

    /**
     * Constructor for obj class card.
     * This constructor sets default image to obj.
     * @param key, nm, auth, qty, img.
     */
   public Bunny() {
        this.image = DEFAULT_IMAGE;
    }
    

    /**
         * Display image on GUI
         */
        public void displayBunny() {
        UI.drawImage(this.image, locX, locY, WIDTH, HEIGHT);
      }
      
    /**
     * Getter for img location Y.
     */
    public int getTop(){
    return locY;
    }
    
    public void jump() {
        this.image = "bunnyPixelDefault.png";
    }
    
    public void feed() {
        this.image = "bunnyPixelHeart.png";
    }
    
    public void dig() {
        this.image = "bunnyPixelDig.png";
    }

}