/*
 * Some method
 */
package pat_james;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author james
 */
public class Species extends DefaultMutableTreeNode {

    String name, claw, beak, habitat;
    int id;

    public Species(int id, String name, String claw, String beak, String habitat) {
        this.name = name;
        this.claw = claw;
        this.beak = beak;
        this.habitat = habitat;
        this.id = id;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getHabitat() {
        return habitat;
    }
    public String output(){
        return name + "\n\nClaw Type: " + claw + "\nBeak type: " + beak + "\nLocation Found: " + habitat;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClaw() {
        return claw;
    }

    public String getBeak() {
        return beak;
    }
    
}
