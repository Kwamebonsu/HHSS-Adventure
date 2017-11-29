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
    
    public void setName(String name){
        this.name = name;
    }

    public String getDirection() {
        return this.getDirection();
    }
    
    public void setDirection(String direction){
       this.direction = direction;
    }

    public String getImgName() {
        return this.getImgName();
    }

    public boolean isBlocked(String blocked) {
        if (blocked.equalsIgnoreCase("true")) {
            return true;
        } else {
            return false;
        }
    }
    
    public void setBlocked(String blocked){
        this.blocked = blocked;
    }
    
    
}
