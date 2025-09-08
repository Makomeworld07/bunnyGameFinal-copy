import java.util.HashMap;
import java.util.Scanner;
import ecs100.*;

/**
 * Code has been taken from my book manager code.
 * Holds a collection of pokemon cards in a hashmap.
 * Allows a user to add, find, print all from a menu.
 * Prevents user from adding a duplicate.
 *
 * @author Korimako
 *
 */
public class Bunnys {
    // instance variables
    private HashMap<Integer, Bunny> carrot;  // Declaring hashmap
    private int currBunnyId;  // Store the current id of card being added
    private Bunny currBunny;  // Store the instance of the current card

    // private Scanner scanner;
    private int checkId;
    
    /**
     * Constructor for objects of class Books.
     */
    public Bunnys(){
        // innitiliase instance variables
        carrot = new HashMap<Integer, Bunny>(); // Initiliase hashmap
        
        // Creating Cards
        Bunny c1 = new Bunny(1, "Pikachu", 3, 1, "pikachu.png");
        Bunny c2 = new Bunny(2, "Diglett", 2, 2, "diglett.png");
        
        // Add cards to collection/hashmap
        carrot.put(1, c1); 
        carrot.put(2, c2);
        
        this.currBunnyId = 2; // Stores the current
    }

    /**
     * Set cardId.
     * Parameter int amount to increase card id. 
     */
    public void setBunnyId(){
        this.currBunnyId += 1;
    }

     /**
     * Add card to hashmap.
     * name, value, quantity.
     */
    public void addBunny(String name,int value, int qty){
        this.carrot.put(this.currBunnyId, new Bunny(this.currBunnyId, name, value, qty));
    }

    /**
     * Add pokemon card to the map and display the cover on canva.
     * @param name, value, qty, img.
     */
    public void addBunny(String name, int value, int qty, String img){
        this.setBunnyId();
        this.carrot.put(this.currBunnyId, new Bunny(this.currBunnyId, name, value, qty, img));
    }

    /**
     * Add card to collection.
     */
    public void addBunny(){
        final int MAX_QUANTITY = 99;
        int quantity;
        int value;

        String name = UI.askString("Name of pokemon card: ");
        if (this.findBunny(name) == true) {
            UI.print("The card exists!");
        } else {
            do {
                quantity = UI.askInt("Quantity: ");
                if ((quantity > 0) && (quantity <= MAX_QUANTITY)) {
                    UI.println("Added");
                } else if (quantity > MAX_QUANTITY) {
                    UI.println("Must be less than 100");
                } else if (quantity < 1) {
                    UI.println("Must be greater than 0");
                } else {
                    UI.println("Must be a number!");
                }
            } while (0 > quantity || quantity > MAX_QUANTITY);
            value = UI.askInt("Enter the value of the card: ");
            if (value <= 0){
                UI.println("Value must be greater than 0.");
                return;  // Exit method if invalid value
            }
            String imgFileName = UIFileChooser.open("Choose Image File: ");
            this.addBunny(name, value, quantity, imgFileName);
            UI.println("The pokemon card is Added");
        }
    }
    
    public Bunny getBunny() {
        return this.currBunny;
    }

    /**
     * Find a card based on name
     * Sets the current card instance if found
     * return boolean false if card not found
     */
    public boolean findBunny(String name){
        // Search for card in hasmap
        for (int  bunnyId: carrot.keySet()){
            if (carrot.get(bunnyId).getName().toLowerCase().equals(name)) {
                currBunny = carrot.get(bunnyId); // Set the current pokemon card
                carrot.get(bunnyId).displayBunny(); // Shows card cover
                return true;
            } else {
                currBunny = null;
            }
        }
        return false;
    }

    /**
     * Find card based on name.
     * If found will display details.
     */
    public void findBunny() {
        String bunnyName = UI.askString("Name of Pokemon Card: ");
        if (this.findBunny(bunnyName.toLowerCase().trim())) {
            UI.println("Pokemon has been found");
            currBunny = this.getBunny();
            currBunny.displayBunny();
            UI.println(" Value: $" + currBunny.getValue());
        } else {
            UI.println(" Pokemon isn't here");
        }
    }

    /**
     * Prints all cards out in a row.
     * Value/$ is printed underneath.
     */
    public void printAllBunnys() {
        int x = 50; 
        int y = 100;
        int spacing = 120; // space between each card
    
        for (Bunny bunny : this.carrot.values()) {
            UI.drawImage(bunny.getImage(), x, y, 100, 100);
            UI.drawString(bunny.getName(), x, y + 110);
            UI.drawString("Value :$" + bunny.getValue(), x, y + 120); // prints value 
            x += spacing; // space increases by each card
        }
    }

    /**
         * Hides pokemon card picture and value $.
         */
    public void hideBunnys() {
        UI.clearText();
        UI.clearGraphics();
        }
    }