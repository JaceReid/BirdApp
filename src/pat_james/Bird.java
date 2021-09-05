/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pat_james;

import java.util.Scanner;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author james
 */
public class Bird extends DefaultMutableTreeNode{

    private String name, colour, habitat, descrition, image;
    private int birdID, minsize, maxsize, Species, Type ;

    /**
     * This method is used to generate the bird object
     *
     * @param BirdID
     * @param name name of the bird
     * @param minsize
     * @param maxsize
     * @param colour color of the bird
     * @param habitat the location that the bird can be found in
     * @param descrition a description of the bird
     * @param image an Image of the bird
     * @param birdType
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
    public String output(){
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

    public String getName() {
        return name;
    }

    public int getBirdID() {
        return birdID;
    }

    public String getColour() {
        return colour;
    }

    public String getHabitat() {
        return habitat;
    }

    public int getMinsize() {
        return minsize;
    }

    public int getMaxsize() {
        return maxsize;
    }

    public int getSpecies() {
        return Species;
    }

    public String getImage() {
        return image;
    }

    public String getDescrition() {
        String temp = "";
        for (int i = 0; i < descrition.length()-1; i+=68) {
            
            try {
                
               temp += descrition.substring(i,i+40) + "\n";

            } catch (StringIndexOutOfBoundsException e) {
                
               temp += descrition.substring(i,descrition.length()-1);
            }
        }
        return temp;
    }

    public int getType() {
        return Type;
    }
    
    


}
