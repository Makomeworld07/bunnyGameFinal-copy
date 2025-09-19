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
        UI.println("Whuuuu, reka rawa atu"); 
        bunny.displayBunny();
    }

    public void jumpBunny() {
        bunny.jump();
        UI.println("Ka rawe! Kua peke ā rāpeti");
    }
    
    public void digBunny() {
        bunny.dig();
        UI.println("Kei te kari ā rāpeti ki te māra");
        UI.println("Auē! He paru ā rāpeti");
    }
}