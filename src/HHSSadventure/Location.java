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
    private String direction;
    private String imgName;
    private String blocked;

    public Location(String name, String direction, String imgName, String blocked) {
        this.name = name;
        this.direction = direction;
        this.imgName = imgName;
        this.blocked = blocked;
    }

    public String getName() {
        return this.getName();
    }

    public String getDirection() {
        return this.getDirection();
    }
}
