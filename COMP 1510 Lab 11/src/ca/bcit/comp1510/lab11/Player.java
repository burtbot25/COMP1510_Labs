package ca.bcit.comp1510.lab11;

/**
 * Player class creates a new Player object.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class Player implements Comparable<Player> {

    /**
     * Name of the player.
     */
    private final String name;
    
    /**
     * Team name.
     */
    private final String teamName;
    
    /**
     * Jersey number.
     */
    private final int number;
    
    /**
     * Constructs an object of type Player.
     * @param name a String. Cannot be null or blank space.
     * @param teamName a String. Cannot be null or blank space.
     * @param number an int. Cannot be 0 or negative.
     */
    public Player(String name, String teamName, int number) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Player name " 
                + "cannot be null or blank");
        } else {
            this.name = name;
        }
        
        if (teamName == null || teamName.trim().isEmpty()) {
            throw new IllegalArgumentException("Team name " 
                + "cannot be null or blank");
        } else {
            this.teamName = teamName;
        }
        
        if (number <= 0) {
            throw new IllegalArgumentException("Number " 
                + "cannot be negative or 0");
        } else {
            this.number = number;
        }
    }

    /**
     * Returns the name for this Player.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the teamName for this Player.
     * @return teamName
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Returns the number for this Player.
     * @return number
     */
    public int getNumber() {
        return number;
    }
    
    /**
     * Compares the two player's numbers and returns a value.
     * 
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     * @param o
     * @return
     */
    @Override
    public int compareTo(Player player1) {
        int paramNum = player1.getNumber();
        
        if (this.number > paramNum) {
            return 1;
        } else if (this.number == paramNum) {
            return 0;
        } else {
            return -1;
        }
    }

    /**
     * Returns a String representation of the Player object.
     * @see java.lang.Object#toString()
     * @return a String representation of the player.
     */
    @Override
    public String toString() {
        return "Player [name=" + name + ", teamName=" + teamName 
            + ", number=" + number + "]";
    }


    /**
     * Determines if "this" object is equal to the object
     * being passed in.
     * @see java.lang.Object#equals(java.lang.Object)
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (getClass() != other.getClass()) {
            return false;
        }
        Player otherObj = (Player) other;
        if (name == null) {
            if (otherObj.name != null) {
                return false;
            }
        } else if (!name.equals(otherObj.name)) {
            return false;
        }
        if (number != otherObj.number) {
            return false;
        }
        if (teamName == null) {
            if (otherObj.teamName != null) {
                return false;
            }
        } else if (!teamName.equals(otherObj.teamName)) {
            return false;
        }
        return true;
    }
    
    
}
