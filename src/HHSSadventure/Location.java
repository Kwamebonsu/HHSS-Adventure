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

    private String name;
    private LOL north;
    private LOL east;
    private LOL south;
    private LOL west;

    public Location(String name, LOL n, LOL e, LOL s, LOL w) {
        this.name = name;
        this.north = n;
        this.east = e;
        this.south = s;
        this.west = w;
    }
}
