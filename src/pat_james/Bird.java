/*
 * Bird Object Class
 */
package pat_james;

import java.util.Scanner;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author James Devine
 */
public class Bird extends DefaultMutableTreeNode {

    private String name, colour, habitat, descrition, image;
    private int birdID, minsize, maxsize, Species, Type;

    /**
     * This method is used to generate the bird object
     *
     * @param BirdID ID of the bird
     * @param name name of the bird
     * @param minsize min size of the bird
     * @param maxsize max size of the bird
     * @param colour color of the bird
     * @param habitat the location that the bird can be found in
     * @param descrition a description of the bird
     * @param image an Image of the bird
     * @param birdSpecies The Species ID of the bird
     * @param Type The type ID of the bird
     *
     */
    public Bird(int BirdID, String name, int minsize, int maxsize, String colour, String habitat, String descrition, String image, int birdSpecies, int Type) {
        this.birdID = BirdID;
        this.name = name;
        this.minsize = minsize;
        this.maxsize = maxsize;
        this.colour = colour;
        this.habitat = habitat;
        this.descrition = descrition;
        this.image = image;
        this.Species = birdSpecies;
        this.Type = Type;
    }

    /**
     * ToString returns all the bird object fields
     *
     * @return bird
     */
    @Override
    public String toString() {
        return name;
    }

    /**
     * returns a formated string for text area output
     *
     * @return name, colour, habitats
     */
    public String output() {
        Scanner scColour = new Scanner(colour).useDelimiter("#");
        String colours = "";
        while (scColour.hasNext()) {
            colours += scColour.next() + " ";

        }
        Scanner scHabitat = new Scanner(habitat).useDelimiter("#");
        String habitats = "";
        while (scHabitat.hasNext()) {
            habitats += scHabitat.next() + " ";

        }
        return name + "\n\nColouring: " + colours + "\nLocations found: " + habitats;
    }

    /**
     * returns the Bird ID
     *
     * @return birdID
     */
    public int getBirdID() {
        return birdID;
    }

    /**
     * returns the colour of the bird
     *
     * @return colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * returns the habitat of the bird
     *
     * @return habitat
     */
    public String getHabitat() {
        return habitat;
    }

    /**
     * returns the min size of the bird
     *
     * @return minsize
     */
    public int getMinsize() {
        return minsize;
    }

    /**
     * returns the max size of the bird
     *
     * @return maxsize
     */
    public int getMaxsize() {
        return maxsize;
    }

    /**
     * returns the Species of the bird
     *
     * @return Species
     */
    public int getSpecies() {
        return Species;
    }

    /**
     * returns the image path of the bird
     *
     * @return image
     */
    public String getImage() {
        return image;
    }

    /**
     * Returns the description formates so that it fits in a Text Area on
     * multiple lines
     *
     * @return temp
     */
    public String getDescrition() {
        String temp = "";
//        for loop that increases by the width of the Text Area
        for (int i = 0; i < descrition.length() - 1; i += 68) {

            try {
//              get a section of the descrption that will fit on the test area
                temp += descrition.substring(i, i + 40) + "\n";

            } catch (StringIndexOutOfBoundsException e) {
//              the last section will always be less therefore a try 
//              catch is needed
                temp += descrition.substring(i, descrition.length() - 1);
            }
        }
        return temp;
    }

    /**
     * returns the bird type of the bird
     *
     * @return type
     */
    public int getType() {
        return Type;
    }

}
