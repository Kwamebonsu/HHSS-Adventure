/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HHSSadventure;

import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author bonsk5852
 */
public class mainGame {

    private String myLocation;
    private String myDirection;
    private String myImage;
    private Location[] locations;
    private LOL north;
    private LOL east;
    private LOL west;
    private LOL south;

    // reading in the file
    public mainGame() {
        
        // initializing the directions
        north = null;
        east = null;
        west = null;
        south = null;
        
        // create a blank file reader
        FileReader file = null;
        try {
            //URL url = TextFileExample.class.getResource("input.txt");
            // creating the file reader
            file = new FileReader("input.txt");
        } catch (Exception e) {
            //handle any errors
            // print out the lovely red errors
            e.printStackTrace();
            // exit the program
            System.exit(0);
        }
        // Use a scanner with the file
        Scanner in = new Scanner(file);
        this.myLocation = in.next();
        this.myDirection = in.nextLine();
        
        int counter = 0;
        // finding the position where 
        while (myLocation != locations[counter].getName()) {
            counter++;
        }
        // beginning image is stored beforehand
        myImage = locations[counter].getNorth().getImgName();

        // location data collector
        locations = new Location[100];

        for (int i = 0; i < 24; i++) {
            // stores name of the location
            String currentLocation = in.nextLine();

            // reads in n, e, s, w information for that specific location
            for (int j = 0; j < 4; j++) {
                String direction = in.nextLine();
                String imageName = in.next();
                String isBlocked = in.next();
                // creating variables for later
                String nextLocation;
                String nextDirection;

                if (isBlocked == "false") {
                    nextLocation = in.next();
                    nextDirection = in.next();
                } else {
                    nextLocation = null;
                    nextDirection = null;
                }
                // parameters
                if (j == 0) {
                    north.setDirection(direction);
                    north.setImgName(imageName);
                    north.setBlocked(isBlocked);
                    north.setIsNext(nextLocation);
                    north.setNextDirection(nextDirection);
                } else if (j == 1) {
                    east.setDirection(direction);
                    east.setImgName(imageName);
                    east.setBlocked(isBlocked);
                    east.setIsNext(nextLocation);
                    east.setNextDirection(nextDirection);
                } else if (j == 2) {
                    south.setDirection(direction);
                    south.setImgName(imageName);
                    south.setBlocked(isBlocked);
                    south.setIsNext(nextLocation);
                    south.setNextDirection(nextDirection);
                } else if (j == 3) {
                    west.setDirection(direction);
                    west.setImgName(imageName);
                    west.setBlocked(isBlocked);
                    west.setIsNext(nextLocation);
                    west.setNextDirection(nextDirection);
                }

            }

            Location c = new Location(currentLocation, north, east, south, west);

            locations[i] = c;
        }
    }

    public void move() {
        int counter = 0;
        // finding the position where 
        while (myLocation != locations[counter].getName()) {
            counter++;
        }
        // changes direction and location to next position
        if (myDirection == "N") {
            if (locations[counter].getNorth().getIsBlocked() == "true") {
                myLocation = locations[counter].getNorth().getIsNext();
                myDirection = locations[counter].getNorth().getNextDirection();
                myImage = locations[counter].getNorth().getImgName();
            }
        } else if (myDirection == "E") {
            if (locations[counter].getEast().getIsBlocked() == "true") {
                myLocation = locations[counter].getEast().getIsNext();
                myDirection = locations[counter].getEast().getNextDirection();
                myImage = locations[counter].getEast().getImgName();
            }
        } else if (myDirection == "S") {
            if (locations[counter].getSouth().getIsBlocked() == "true") {
                myLocation = locations[counter].getSouth().getIsNext();
                myDirection = locations[counter].getSouth().getNextDirection();
                myImage = locations[counter].getSouth().getImgName();
            }
        } else if (myDirection == "W") {
            if (locations[counter].getWest().getIsBlocked() == "true") {
                myLocation = locations[counter].getWest().getIsNext();
                myDirection = locations[counter].getWest().getNextDirection();
                myImage = locations[counter].getWest().getImgName();
            }
        }


    }

    public void rightTurn() {
        
         int counter = 0;
        // finding the position where 
        while (myLocation != locations[counter].getName()) {
            counter++;
        }
        
        // changes current direction to the right of it
        if (myDirection == "N") {
            myDirection = "E";
            myImage = locations[counter].getEast().getImgName();
        } else if (myDirection == "E") {
            myDirection = "S";
            myImage = locations[counter].getSouth().getImgName();
        } else if (myDirection == "S") {
            myDirection = "W";
            myImage = locations[counter].getWest().getImgName();
        } else if (myDirection == "W") {
            myDirection = "N";
            myImage = locations[counter].getNorth().getImgName();
        }
    }

    public void leftTurn() {
        int counter = 0;
        // finding the position where 
        while (myLocation != locations[counter].getName()) {
            counter++;
        }

        // changes current direction to the one left of it
        if (myDirection == "N") {
            myDirection = "W";
            myImage = locations[counter].getWest().getImgName();
        } else if (myDirection == "E") {
            myDirection = "N";
            myImage = locations[counter].getNorth().getImgName();
        } else if (myDirection == "S") {
            myDirection = "E";
            myImage = locations[counter].getEast().getImgName();
        } else if (myDirection == "W") {
            myDirection = "S";
            myImage = locations[counter].getSouth().getImgName();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
}
