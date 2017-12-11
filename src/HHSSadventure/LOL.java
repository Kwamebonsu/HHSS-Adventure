/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HHSSadventure;

/**
 *
 * @author bonsk5852
 */
public class LOL {

    // Create instance variables
    private String direction;
    private String imgName;
    private String isBlocked;
    private String isNext;
    private String nextDirection;

    // Constructor
    public LOL(String direction) {
        this.direction = direction;
    }

    // constructor 2
    public LOL(String direction, String imgName, String isBlocked, String isNext, String nextDirection) {
        this.direction = direction;
        this.imgName = imgName;
        this.isBlocked = isBlocked;
        this.isNext = isNext;
        this.nextDirection = nextDirection;
    }

    // Getters and Setters
    public String getDirection() {
        return this.direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getImgName() {
        return this.imgName;
    }

    public void setImgName(String n) {
        this.imgName = n;
    }

    public String getIsBlocked() {
        return isBlocked;
    }

    public void setBlocked(String b) {
        this.isBlocked = b;
    }

    public String getIsNext() {
        return this.isNext;
    }

    public void setIsNext(String n) {
        this.isNext = n;
    }

    public String getNextDirection() {
        return this.nextDirection;
    }

    public void setNextDirection(String direction) {
        this.nextDirection = direction;
    }
}
