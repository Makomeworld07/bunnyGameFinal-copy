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
    private Bunnys bunnys;     //declare cards instance
    private Bunny bunny;      //declare cards instance

    /**
     * Constructor for objects of class GUI.
     */
    public GUI()
    {
        // initialise instance variables
        bunnys = new Bunnys();           //instantiate the cards
        
        // Set up GUI
        UI.initialise();
        UI.addButton("", bunnys::printAllBunnys);
        UI.addButton("Eat", bunnys::addBunny);
        UI.addButton("Jump", bunnys::findBunny);
        UI.addButton("Dig",bunnys::hideBunnys);
        UI.addButton("Quit", UI::quit);
    }

    /**
     * Main routine.
     */
    public static void main(String[] args){
        new GUI();
    }
    }