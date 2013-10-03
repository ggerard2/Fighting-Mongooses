
import java.util.List;
import java.util.ArrayList;

public class Player {

    // instance variables
    private String name;
    private String race;
    private String color;
    private int money;
    private int food;
    private int energy;
    private int smithore;
    private int mules;
    private int row;
    private int column;
    private List<Tile> tiles;

    /**
     * Player class represents a game player
     * Throw a NullPointerException or IllegalArgumentException if the paramaters are invalid
     *
     * @param name The player's name.  Must be a String between 3 and 100 characters long
     * @param race The player's race.  Must be Human, Flapper, Bonzoid, Ugaite, or Buzzite
     * @param color The player's color.  Must be Red, Blue, Pink, Green, or Orange
     *
     */
    public Player(String name, String race, String color) {

        // sanity check on parameters
        if (name == null || race == null || color == null) {
            throw new NullPointerException("One of the parameters in the Player constructor was null");
        }

        if (name.length() <= 2 || name.length() > 100) {
            throw new IllegalArgumentException("Please ensure name is between 3 and 100 characters long");
        }

        if (!(color.equals("Red") || color.equals("Blue") || color.equals("Pink") || color.equals("Green") ||
            color.equals("Orange"))) {
            throw new IllegalArgumentException("Invalid color");
        }

        if (!(race.equals("Human") || race.equals("Flapper") || race.equals("Bonzoid") || race.equals("Ugaite") || 
            race.equals("Buzzite"))) {
            throw new IllegalArgumentException("Invalid race");
        }

        // set instance variables
        this.name = name;
        this.race = race;
        this.color = color;
        money = 0;
        food = 0;
        energy = 0;
        smithore = 0;
        mules = 0;
        row = 0;
        column = 0;
        tiles = new ArrayList<Tile>();
    }

    /**
     * Getter method for the player's name
     *
     * @return The player's name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter method for the player's race
     *
     * @return The player's race
     */
    public String getRace() {
        return race;
    }

    /**
     * Getter method for the player's color
     *
     * @return The player's color
     */
    public String getColor() {
        return color;
    }

    /**
     * Getter method for the player's money
     *
     * @return The player's money
     */
    public int getMoney() {
        return money;
    }

    /**
     * Getter method for the player's food
     *
     * @return The player's food
     */
    public int getFood() {
        return food;
    }

    /**
     * Getter method for the player's energy
     *
     * @return The player's energy
     */
    public int getEnergy() {
        return energy;
    }

    /**
     * Getter method for the player's smithore
     *
     * @return The player's smithore
     */
    public int getSmithore() {
        return smithore;
    }

    /**
     * Getter method for the player's mules
     *
     * @return The player's mules
     */
    public int getMules() {
        return mules;
    }

    /**
     * Getter method for the player's row
     *
     * @return The player's row
     */
    public int getRow() {
        return row;
    }

    /**
     * Getter method for the player's coumn
     *
     * @return The player's column
     */
    public int getColumn() {
        return column;
    }

    /**
     * Getter method for the player's tiles
     *
     * @return The player's tiles
     */
    public List<Tile> getTiles() {
        return tiles;
    }

    /**
     * Setter method for the player's money
     *
     * @param money The player's new money
     */
    public void setMoney(int money) {
        this.money = money;
    }

    /**
     * Setter method for the player's food
     *
     * @param food The player's new food
     */
    public void setFood(int food) {
        this.food = food;
    }

    /**
     * Setter method for the player's energy
     *
     * @param energy The player's new energy
     */
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    /**
     * Setter method for the player's smithore
     *
     * @param smithore The player's new smithore
     */
    public void setSmithore(int smithore) {
        this.smithore = smithore;
    }

    /**
     * Setter method for the player's mules
     *
     * @param mules The player's new mules
     */
    public void setMules(int mules) {
        this.mules = mules;
    }

    /**
     * Setter method for the player's row
     *
     * @param row The player's new row
     */
    public void setRow(int row) {
        this.row = row;
    }

    /**
     * Setter method for the player's column
     *
     * @param column The player's new column
     */
    public void setColumn(int column) {
        this.column = column;
    }

    /**
     * Add a tile to the player's list of tiles
     *
     * @param tile The tile to be added
     */
    public void addTile(Tile tile) {
        tiles.add(tile);
    }
}