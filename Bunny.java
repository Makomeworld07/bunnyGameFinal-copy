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
    
    private int health = 50; // Sets health to 50
    
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
     * Constructor for bunny class
     */
   public Bunny() {
        this.image = DEFAULT_IMAGE;
    }
    
    /**
         * Display bunny on GUI
         */
        public void displayBunny() {
        UI.drawImage(this.image, locX, locY, WIDTH, HEIGHT); // draws the bunny image
        UI.println("Rapeti hauora: " + health); // Displays health
      }
      
    public void jump() {
        this.image = "bunnyPixelDefault.png"; // sets image
    }
    
    public void feed() {
        this.image = "bunnyPixelHeart.png"; // sets image
        health += 10; // increase health
    }
    
    public void dig() {
        this.image = "bunnyPixelDig.png"; // sets image
        health -= 10; // decrease health
    }

}