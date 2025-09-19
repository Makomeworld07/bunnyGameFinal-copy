import ecs100.*;
/**
 * The game class
 * Ths is where the tasks are done
 */
public class Game {
    private Bunny bunny; // The bunny
    
    // Constructor
    public Game() {
        bunny = new Bunny(); // The bunny
        bunny.displayBunny();
    }
    // Feed the bunny
    public void feedBunny() {
        bunny.feed();
        UI.println(" Reka"); 
        bunny.displayBunny();
    }

    public void jumpBunny() {
        bunny.jump();
        UI.println("jump");
    }
    
    public void digBunny() {
        bunny.dig();
        UI.println("ka pai. dirty");
    }
}