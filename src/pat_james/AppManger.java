/*
 * @AppManger Manger Class, All methods realting to Birds, Species, Logs and Database 
 */
package pat_james;

import java.awt.Image;
import java.io.FileReader;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author James Devine
 */
public class AppManger {

    private DBManger db = new DBManger();

    private ArrayList<Log> LogArr = new ArrayList<>();
    private ArrayList<Species> SpecciesArr = new ArrayList<>();
    private ArrayList<Bird> birdArr = new ArrayList<>();

    private int userID = 0;
    
    /**
     * Constructor default method
     */
    public AppManger() {
    }

    /**
     * creates an array of birds objects by reading the data from the database
     */
    public void createBirds() {
        try {
            ResultSet rs = db.queryTbl("SELECT * FROM tblBirds "
                    + "LEFT JOIN TBLSPECIES "
                    + "ON TBLBIRDS.SPECIESID = TBLSPECIES.SPECIESID");
            String name, colour, habitat, descrition, image;
            int BirdID, minsize, maxsize, BirdSpecies, BirdType;

            while (rs.next()) {
                BirdID = rs.getInt("BirdID");
                name = rs.getString("NAME");
                minsize = rs.getInt("MINSIZE");
                maxsize = rs.getInt("MAXSIZE");
                colour = rs.getString("COLOUR");
                habitat = rs.getString("HABITAT");
                descrition = rs.getString("BIRDDESCRIPTION");
                image = rs.getString("IMAGES");
                BirdSpecies = rs.getInt("SpeciesID");
                BirdType = rs.getInt("TypeID");

                birdArr.add(new Bird(BirdID, name, minsize, maxsize, colour, habitat, descrition, image, BirdSpecies, BirdType));
                
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(AppManger.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Returns an array of all bird objects
     *
     * @return birdArr
     */
    public ArrayList getBirdArr() {
        return birdArr;
    }

    /**
     * Read birds from a Json file and then adds them to the database
     */
    public void readbirds() {
//      creating the json reading varribles
        JSONParser jp = new JSONParser();
        JSONObject jo;

        try {
//          reading the data
            jo = (JSONObject) jp.parse(new FileReader("Birds.json"));
            JSONArray ja = (JSONArray) jo.get("Birds");

            Iterator i = ja.iterator();
//          looping through the data
            while (i.hasNext()) {
                jo = (JSONObject) i.next();
                String name = "";
                try {
//                  getting each feild from the file
                    name = (String) jo.get("name");
                    Long minsize = (Long) jo.get("minsize");
                    Long maxsize = (Long) jo.get("maxsize");
                    String colour = (String) jo.get("colour");
                    Long Species = (Long) jo.get("Species");
                    Long type = (Long) jo.get("Type");
                    String desc = (String) jo.get("Desc");
                    String images = (String) jo.get("images");

                    boolean newBird = true;

                    for (Bird bird : birdArr) {
//                      Checking if the bird is already in the database
                        if (bird.toString().equals(name)) {
                            newBird = false;
                        }
                    }
                    if (newBird) {
                        db.updateTbl("Insert Into tblBirds (name,minsize,maxsize,colour,SpeciesID,TypeID,birddescription,images) "
                                + "values ('" + name + "' , " + minsize + ", " + maxsize + " , '" + colour + "'," + Species
                                + "," + type + ", '" + desc + "','" + images + "')");
                    }

                } catch (SQLException | ClassCastException ex) {
                    System.out.println("Error with: " + name);
                    Logger.getLogger(AppManger.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (IOException | ParseException ex) {
            Logger.getLogger(AppManger.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * takes in information about a bird and then finds birds that match the
     * data and returns an array list of all those birds
     *
     * @param type the type of bird
     * @param size the size of the bird
     * @param habitat the habitat that the bird was seen in
     * @param colour the colours of the bird
     * @return FoundBirdsArr
     */
    public ArrayList findBird(int type, int size, String habitat, String colour) {
        ArrayList<Bird> FoundBirdsArr = new ArrayList<>();

        
        for (int i = 0; i < birdArr.size(); i++) {

            if (birdArr.get(i).getType() == type && birdArr.get(i).getColour().contains(colour)
                    && birdArr.get(i).getHabitat().contains(habitat)
                    && size > birdArr.get(i).getMinsize() - 10
                    && size < birdArr.get(i).getMaxsize() + 10) {

                FoundBirdsArr.add(birdArr.get(i));

                
            }

        }

        return FoundBirdsArr;
    }

    /**
     * Creates an array of all the Logs from the database
     */
    public void CreateLogs() {
        try {
            ResultSet rs = db.queryTbl("SELECT * FROM TBLLogs");
            String Date, descrition, location;
            int UserID, BirdID;

            while (rs.next()) {
                UserID = rs.getInt("User_ID");
                descrition = rs.getString("LogDescription");
                location = rs.getString("LogLocation");
                Date = rs.getString("LogDate");
                BirdID = rs.getInt("Bird_ID");
                
                LogArr.add(new Log(location, descrition, Date, BirdID, UserID));

            }
        } catch (SQLException ex) {
            Logger.getLogger(AppManger.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * returns an array list of all the logs
     *
     * @return LogArr
     */
    public ArrayList getLogArr() {
        return LogArr;
    }

    /**
     * Creates an array of all the Species from the database
     */
    public void CreateSpecies() {
        try {
            ResultSet rs = db.queryTbl("SELECT * FROM TBLSPECIES");
            String name, colour, habitat, beak, claw, descrition, image;
            int SpeciesID, minsize, maxsize, birdType;

            while (rs.next()) {
                SpeciesID = rs.getInt("SPECIESID");
                name = rs.getString("NAME");
                habitat = rs.getString("HABITAT");
                beak = rs.getString("BEAK");
                claw = rs.getString("CLAW");

                SpecciesArr.add(new Species(SpeciesID, name, claw, beak, habitat));

            }
        } catch (SQLException ex) {
            Logger.getLogger(AppManger.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns an array of all the Species
     *
     * @return SpecciesArr
     */
    public ArrayList getSpecciesArr() {
        return SpecciesArr;
    }

    /**
     * Reads Species from a Json file into the database
     */
    public void readSpecies() {

        JSONParser paser = new JSONParser();
        JSONObject Jobject;

        try {

            Jobject = (JSONObject) paser.parse(new FileReader("Species.json"));
            JSONArray ja = (JSONArray) Jobject.get("Species");

            Iterator i = ja.iterator();

            while (i.hasNext()) {
                Jobject = (JSONObject) i.next();

                String name = (String) Jobject.get("Name");
                String beak = (String) Jobject.get("Beak");
                String habitat = (String) Jobject.get("Habitat");
                String Claw = (String) Jobject.get("Claw");

                try {
                    db.updateTbl("Insert Into tblSpecies (NAME,HABITAT,BEAK,CLAW) values ('" + name + "' , '" + habitat + "', '" + beak + "' , '" + Claw + "')");
                } catch (SQLException ex) {
                    Logger.getLogger(AppManger.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (IOException | ParseException ex) {
            Logger.getLogger(AppManger.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Checks if there is a username and pin in the Database that matched the
     * entered ones, also stores the userID to a JSON file
     *
     * @param username the username entered
     * @param pin the entered pin
     * @return correct boolean varrible that is true when there is a username
     * and pin that match the enter ones
     */
    public boolean login(String username, int pin) {
        ResultSet rs = null;
        ResultSet rspass = null;

        boolean correct = false;

        try {

            rs = db.queryTbl("SELECT * FROM tbluser where USername = " + "'" + username + "'");

            if (rs.next()) {
                rspass = db.queryTbl("SELECT UserID FROM tbluser where USername = " + "'" + username + "' AND Pin = " + pin);
                if (rspass.next()) {
                    correct = true;
                    userID = rspass.getInt("UserID");

                }
            }
        } catch (SQLException ex) {

            Logger.getLogger(AppManger.class.getName()).log(Level.SEVERE, null, ex);
        }

        return correct;
    }

    /**
     *
     * @param u username entered
     * @param p pin entered
     * @param a boolean true if new user is an admin
     */
    public void newuser(String u, int p, boolean a) {

        try {
            db.updateTbl("Insert Into tblUser (Username,Pin,ADMIN) values ('" + u + "' , " + p + "," + a + ")");
        } catch (SQLException ex) {
            Logger.getLogger(AppManger.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Inserts a new log into the database
     *
     * @param user the User ID of the user who the log belongs to
     * @param bird the Bird ID of the bird in the log
     * @param date the Date of the Log
     * @param location The location that the bird was sighted
     * @param desc a description of the sighting
     */
    public void newlog(int user, int bird, String date, String location, String desc) {

        try {
            db.updateTbl("Insert Into tblLogs (User_ID,Bird_ID,LOGDATE,LOGLOCATION,LOGDESCRIPTION) values (" + user + " , " + bird + ", '" + date + "' , '" + location
                    + "', '" + desc + "')");
        } catch (SQLException ex) {
            Logger.getLogger(AppManger.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Checks if the current user is a admin
     *
     * @return admin boolean true if current user is an admin
     */
    public boolean isAdmin() {

        ResultSet rs = null;
        boolean admin = false;
        
        try {
            rs = db.queryTbl("SELECT * FROM tbluser where USerID = " + "" + userID + " AND admin = true");
            
            if (rs.next()) {
                admin = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(AppManger.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return admin;
    }

    /**
     * creates an array of the ID of all the Species
     *
     * @return idArr[]
     */
    public int[] gettypeID() {

        int[] idArr = new int[10];

        int size = 0;
        ResultSet rs = null;
        try {
            rs = db.queryTbl("SELECT TypeID FROM tblType");
            while (rs.next()) {
                idArr[size] = rs.getInt("TypeID");

                size++;

            }
        } catch (SQLException ex) {
            Logger.getLogger(AppManger.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(GUI.WIDTH);
        return idArr;
    }

    /**
     * creates an array of the ID of all the Species, creates 2D array when used
     * with gettypeID()
     *
     * @return nameArr[]
     */
    public String[] getTypeName() {
        String[] nameArr = new String[10];
        int size = 0;
        ResultSet rs = null;
        try {
            rs = db.queryTbl("SELECT NAME FROM tbltype");
            while (rs.next()) {
                nameArr[size] = rs.getString("name");

                size++;

            }
        } catch (SQLException ex) {
            Logger.getLogger(AppManger.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nameArr;
    }

    /**
     * Returns the current user ID
     *
     * @return userID
     */
    public int getUserID() {
        return userID;
    }

    /**
     * gets a image via the path and scales it down dynamically according to the
     * passed label
     *
     * @param link String containing the path to the image
     * @param label JLabel, the label that the image will be but into
     * @return scaledIcon
     */
    public ImageIcon Scaleimage(String link, JLabel label) {

        ImageIcon originalIcon = new ImageIcon(link);
        Image image = originalIcon.getImage();

        int width = originalIcon.getIconWidth();
        int height = originalIcon.getIconHeight();

        int lblwidth = (int) Math.round(label.getWidth() * 1.25);
        int lblheight = (int) Math.round(label.getHeight() * 1.25);

        if (width > height) {
            height = (int) (height / (width / lblwidth));
            image = image.getScaledInstance(lblwidth, height, 0);

        } else if (height > width) {
            width = (int) (width / (height / lblheight));
            image = image.getScaledInstance(width, lblheight, 0);
        } else {
            image = image.getScaledInstance(lblwidth, lblheight, 0);
        }

        ImageIcon scaledIcon = new ImageIcon(image);

        return scaledIcon;
    }

}
