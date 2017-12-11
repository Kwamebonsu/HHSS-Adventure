/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HHSSadventure;

/**
 *
 * @author bonsk5852
 */
public class Location {

    // Instance variables
    private String name;
    private LOL north;
    private LOL east;
    private LOL south;
    private LOL west;

    // Constructor
    public Location(String name) {
        this.name = name;
    }
    // Constructor 2

    public Location(String name, LOL n, LOL e, LOL s, LOL w) {
        this.name = name;
        this.north = n;
        this.east = e;
        this.south = s;
        this.west = w;
    }
    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setNorth(LOL n) {
        this.north = n;
    }

    public void setEast(LOL e) {
        this.east = e;
    }

    public void setSouth(LOL s) {
        this.south = s;
    }

    public void setWest(LOL w) {
        this.west = w;
    }
    // Getters

    public String getName() {
        return this.name;
    }

    public LOL getNorth() {
        return north;
    }

    public LOL getEast() {
        return east;
    }

    public LOL getSouth() {
        return south;
    }

    public LOL getWest() {
        return west;
    }
}
