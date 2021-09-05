/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pat_james;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author james
 */
public class Log extends DefaultMutableTreeNode{
    private String location, description, date;
    private int BirdID, UserID;

    public Log(String location, String description, String date, int BirdID, int UserID) {
        this.location = location;
        this.description = description;
        this.date = date;
        this.BirdID = BirdID;
        this.UserID = UserID;
    }

    @Override
    public String toString() {
        
        return date + ": "+BirdID;
    }
    
   public String output(){
       return date + "\n"+ location + "\n" + description;
   }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public int getBirdID() {
        return BirdID;
    }

    public int getUserID() {
        return UserID;
    }
    
}
