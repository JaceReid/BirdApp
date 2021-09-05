/*
 * Species object class
 */
package pat_james;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author James Devine
 */
public class Species extends DefaultMutableTreeNode {

    String name, claw, beak, habitat;
    int id;
/**
 * Constructor for the Species class
 * @param id ID of the Species
 * @param name name of the Species
 * @param claw claw type of the Species
 * @param beak beak type of the Species
 * @param habitat habitats of the Species (separated by #)
 */
    public Species(int id, String name, String claw, String beak, String habitat) {
        this.name = name;
        this.claw = claw;
        this.beak = beak;
        this.habitat = habitat;
        this.id = id;
    }
/**
 * returns the name of the species
 * @return name
 */
    @Override
    public String toString() {
        return name;
    }
/**
 * returns the habitat of the species
 * @return habitat
 */
    public String getHabitat() {
        return habitat;
    }
/**
 * formats all the species data for a text area output
 * @return name, claw, beak, habitat
 */
    public String output() {
        return name + "\n\nClaw Type: " + claw + "\nBeak type: " + beak + "\nLocation Found: " + habitat;
    }
/**
 * returns the ID of the species
 * @return ID
 */
    public int getId() {
        return id;
    }



}
