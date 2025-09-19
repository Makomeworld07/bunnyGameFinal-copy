import ecs100.*;
/**
 * GUI class.
 * Code has been taken from my book manager. 
 * Allows to add, print all, search, hide pokemon card.
 * Will display details: Name and value.
 *
 * @author Korimako
 */
public class GUI{
    // field
    private Game game;
    /**
     * Constructor for objects of class GUI.
     */
    public GUI()
    {
        // initialise instance variables
        game = new Game();           //instantiate the cards
        // Set up GUI
        UI.initialise();
        UI.addButton("Feed", game::feedBunny);
        UI.addButton("Jump", game::jumpBunny);
        UI.addButton("Dig",game::digBunny);
        UI.addButton("Quit", UI::quit);
    }

    /**
     * Main routine.
     */
    public static void main(String[] args){
        new GUI();
    }
    }