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
    private String NName;
    private String NDirection;
    private String NImgName;
    private String NBlocked;
    private String EName;
    private String EDirection;
    private String EImgName;
    private String EBlocked;
    private String SName;
    private String SDirection;
    private String SImgName;
    private String SBlocked;
    private String WName;
    private String WDirection;
    private String WImgName;
    private String WBlocked;

    public Location(String name, String direction, String imgName, String blocked) {
        this.name = name;
        this.direction = direction;
        this.imgName = imgName;
        this.blocked = blocked;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirection() {
        return this.direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getImgName() {
        return this.imgName;
    }

    public boolean isBlocked(String blocked) {
        if (blocked.equalsIgnoreCase("false")) {
            return false;
        } else {
            return true;
        }
    }

    public void setBlocked(String blocked) {
        this.blocked = blocked;
    }
}
