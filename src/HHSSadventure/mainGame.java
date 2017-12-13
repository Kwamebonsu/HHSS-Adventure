/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HHSSadventure;

import jaco.mp3.player.MP3Player;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author bonsk5852
 */
public class mainGame {
    // Sound

    MP3Player footsteps = new MP3Player(ClassLoader.getSystemResource("Sound/Footsteps.mp3"));
    // Instance variables
    private String myLocation;
    private String myDirection;
    private String myImage;
    private Location[] locations;

    // reading in the text file
    public mainGame(gameDisplay d) {
        // create a blank file reader
        FileReader file = null;
        try {
            // creating the file reader
            file = new FileReader("input.txt");
        } catch (Exception e) {
            //handle any errors
            // print out the errors
            e.printStackTrace();
            // exit the program
            System.exit(0);
        }
        // Use a scanner with the file
        Scanner in = new Scanner(file);
        // Read in the starting position
        this.myLocation = in.next();
        in.nextLine();
        this.myDirection = in.next();
        // location data collector
        locations = new Location[100];

        // Fill the array
        for (int i = 0; i < 24; i++) {
            // initializing the directions
            LOL north = new LOL(null);
            LOL east = new LOL(null);
            LOL west = new LOL(null);
            LOL south = new LOL(null);

            in.nextLine();
            // stores name of the location
            String currentLocation = in.next();
            // reads in n, e, s, w information for that specific location
            for (int j = 0; j < 4; j++) {
                in.nextLine();
                String direction = in.next();
                String imageName = in.next();
                String isBlocked = in.next();
                // creating variables for later
                String nextLocation = null;
                String nextDirection = null;
                if (!isBlocked.equalsIgnoreCase("true")) {
                    // Read in the next location and direction
                    nextLocation = in.next();
                    nextDirection = in.next();
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

            if (myLocation.equalsIgnoreCase(currentLocation)) {
                myImage = north.getImgName();
            }
            // Store the created Location in an array
            Location c = new Location(currentLocation, north, east, south, west);

            locations[i] = c;
        }

    }

    public void move() {
        int counter = 0;
        // finding the position where
        while (!myLocation.equalsIgnoreCase(locations[counter].getName())) {
            counter++;
        }
        // changes direction and location to next position
        if (myDirection.equalsIgnoreCase("N")) {
            if (!locations[counter].getNorth().getIsBlocked().equalsIgnoreCase("true")) {
                myLocation = locations[counter].getNorth().getIsNext();
                myDirection = locations[counter].getNorth().getNextDirection();            // THIS WILL NOT WORK, MOVE ONTO NEXT POSITION NOT CURRENt
                counter = 0;
                while (!myLocation.equalsIgnoreCase(locations[counter].getName())) {
                    counter++;
                }
                System.out.println(counter);
                myImage = locations[counter].getNorth().getImgName();
            }
        } else if (myDirection.equalsIgnoreCase("E")) {
            if (!locations[counter].getEast().getIsBlocked().equalsIgnoreCase("true")) {
                myLocation = locations[counter].getEast().getIsNext();
                myDirection = locations[counter].getEast().getNextDirection();
            }
            counter = 0;
            while (!myLocation.equalsIgnoreCase(locations[counter].getName())) {
                counter++;
            }
            System.out.println(counter);
            myImage = locations[counter].getEast().getImgName();
        } else if (myDirection.equalsIgnoreCase("S")) {
            if (!locations[counter].getSouth().getIsBlocked().equalsIgnoreCase("true")) {
                myLocation = locations[counter].getSouth().getIsNext();
                myDirection = locations[counter].getSouth().getNextDirection();
            }
            counter = 0;
            while (!myLocation.equalsIgnoreCase(locations[counter].getName())) {
                counter++;
            }
            System.out.println(counter);
            myImage = locations[counter].getSouth().getImgName();
        } else if (myDirection.equalsIgnoreCase("W")) {
            if (!locations[counter].getWest().getIsBlocked().equalsIgnoreCase("true")) {
                myLocation = locations[counter].getWest().getIsNext();
                myDirection = locations[counter].getWest().getNextDirection();
            }
            counter = 0;
            while (!myLocation.equalsIgnoreCase(locations[counter].getName())) {
                counter++;
            }
            System.out.println(counter);
            myImage = locations[counter].getWest().getImgName();
        }

    }

    public void rightTurn() {

        int counter = 0;
        // finding the position where
        while (!myLocation.equalsIgnoreCase(locations[counter].getName())) {
            counter++;
        }

        // changes current direction to the right of it
        if (myDirection.equalsIgnoreCase("N")) {
            myDirection = "E";
            myImage = locations[counter].getEast().getImgName();
        } else if (myDirection.equalsIgnoreCase("E")) {
            myDirection = "S";
            myImage = locations[counter].getSouth().getImgName();
        } else if (myDirection.equalsIgnoreCase("S")) {
            myDirection = "W";
            myImage = locations[counter].getWest().getImgName();
        } else if (myDirection.equalsIgnoreCase("W")) {
            myDirection = "N";
            myImage = locations[counter].getNorth().getImgName();
        }
    }

    public void leftTurn() {
        int counter = 0;
        // finding the position where
        while (!myLocation.equalsIgnoreCase(locations[counter].getName())) {
            counter++;
        }

        // changes current direction to the one left of it
        if (myDirection.equalsIgnoreCase("N")) {
            myDirection = "W";
            myImage = locations[counter].getWest().getImgName();
        } else if (myDirection.equalsIgnoreCase("E")) {
            myDirection = "N";
            myImage = locations[counter].getNorth().getImgName();
        } else if (myDirection.equalsIgnoreCase("S")) {
            myDirection = "E";
            myImage = locations[counter].getEast().getImgName();
        } else if (myDirection.equalsIgnoreCase("W")) {
            myDirection = "S";
            myImage = locations[counter].getSouth().getImgName();
        }
    }

    public String getImage() {
        return myImage;
    }

    public String getLocation() {
        return myLocation;
    }

    public String getDirection() {
        return myDirection;
    }

    public void sound() {
        footsteps.play();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
}
