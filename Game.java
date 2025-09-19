import ecs100.*;
/**
 * The game class
 * Ths is where the tasks are done
 */
public class Game {
    private Bunny bunny; // The bunny
    private String backgroundImage = "background.png"; // Background image file
     
    // Constructor
    public Game() {
        bunny = new Bunny(); // The bunny
        UI.initialise(); // Initiliase UI
        bunny.displayBunny(); // Displays bunny
        drawBackground(); // Displays background 
    }
    
    // Drawing background
    public void drawBackground() {
        // Draw the background 
        UI.drawImage(backgroundImage, 0, 0, 600, 400);
    }
    // Feed the bunny
    public void feedBunny() {
        bunny.feed();
        UI.println("Whuuuu, reka rawa atu"); 
        drawBackground();
        bunny.displayBunny();
    }

    public void jumpBunny() {
        bunny.jump();
        UI.println("Ka rawe! Kua peke ā rāpeti");
        drawBackground();
        bunny.displayBunny();
    }
    
    public void digBunny() {
        bunny.dig();
        UI.println("Kei te kari ā rāpeti ki te māra");
        UI.println("Auē! He paru ā rāpeti");
        drawBackground();
        bunny.displayBunny();
    }
}