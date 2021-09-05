/*
 * Log object class
 */
package pat_james;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author James Devine
 */
public class Log extends DefaultMutableTreeNode {

    private String location, description, date;
    private int BirdID, UserID;

    /**
     * Constructor for the Log class
     *
     * @param location location of the log
     * @param description description of the log
     * @param date date of th log
     * @param BirdID The ID of the bird
     * @param UserID The ID of the user that the log belongs to
     */
    public Log(String location, String description, String date, int BirdID, int UserID) {
        this.location = location;
        this.description = description;
        this.date = date;
        this.BirdID = BirdID;
        this.UserID = UserID;
    }

    /**
     * return the date plus the bird ID which is used as the name for the log
     *
     * @return Date + Bird
     */
    @Override
    public String toString() {

        return date + ": " + BirdID;
    }

    /**
     * Returns all the information to be displayed in a text area
     *
     * @return Date + location + description
     */
    public String output() {
        return date + "\n" + location + "\n" + description;
    }

    /**
     * returns the bird ID
     *
     * @return BirdID
     */
    public int getBirdID() {
        return BirdID;
    }

    /**
     * returns the user ID
     *
     * @return UserID
     */
    public int getUserID() {
        return UserID;
    }

}
