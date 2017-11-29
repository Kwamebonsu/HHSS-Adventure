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
    
    // reading in the file
    
    public mainGame() {
    
        // create a blank file reader
        FileReader file = null;
        try{
            
            //URL url = TextFileExample.class.getResource("input.txt");
            // creating the file reader
            file = new FileReader("input.txt");
        } catch(Exception e){
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
            String currentLocation = in.nextLine();
            for (int j = 0; j < 4; j++) {
                String direction = in.nextLine();
                String imageName = in.next();
                String isBlocked = in.next();
                if(isBlocked == "false") {
                    String nextLocation = in.next();
                    String nextDirection = in.next();
                }
            }
            
            
            
            
        }
        
        
}
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    }
}
