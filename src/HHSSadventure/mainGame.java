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

    private String startLocation;
    private String startDirection;
    private Location[] locations;
    private LOL north;
    private LOL east;
    private LOL west;
    private LOL south;

    // reading in the file
    public mainGame() {

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
        this.startLocation = in.next();
        this.startDirection = in.nextLine();

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
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
}
