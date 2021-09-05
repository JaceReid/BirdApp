/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pat_james;

import java.awt.Image;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author james
 */
public class AppManger {

    DBManger db = new DBManger();
    static private int userID = 0;

    public AppManger() {
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

            Logger.getLogger(BirdsManger.class.getName()).log(Level.SEVERE, null, ex);
        }

        return correct;
    }

    public void newuser(String u, int p, boolean a) {

        try {
            db.updateTbl("Insert Into tblUser (Username,Pin,ADMIN) values ('" + u + "' , " + p + "," + a + ")");
        } catch (SQLException ex) {
            Logger.getLogger(BirdsManger.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void newlog(int user, int bird, String date, String location, String desc) {

        try {
            db.updateTbl("Insert Into tblLogs (User_ID,Bird_ID,LOGDATE,LOGLOCATION,LOGDESCRIPTION) values (" + user + " , " + bird + ", '" + date + "' , '" + location
                    + "', '" + desc + "')");
        } catch (SQLException ex) {
            Logger.getLogger(BirdsManger.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   

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

    public ArrayList<Integer> gettypeID() {

        ArrayList<Integer> idArr = new ArrayList<>();

        int size = 0;
        ResultSet rs = null;
        try {
            rs = db.queryTbl("SELECT TypeID FROM tblType");
            while (rs.next()) {
                idArr.add(rs.getInt("TypeID"));

                size++;

            }
        } catch (SQLException ex) {
            Logger.getLogger(AppManger.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(GUI.WIDTH);
        return idArr;
    }

    public ArrayList<String> getTypeName() {
        ArrayList<String> nameArr = new ArrayList<>();
        int size = 0;
        ResultSet rs = null;
        try {
            rs = db.queryTbl("SELECT NAME FROM tbltype");
            while (rs.next()) {
                nameArr.add(rs.getString("name"));

                size++;

            }
        } catch (SQLException ex) {
            Logger.getLogger(AppManger.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nameArr;
    }

    public int getUserID() {
        return userID;
    }

   public ImageIcon Scaleimage(String link) {
       
        ImageIcon originalIcon = new ImageIcon(link);
        Image image = originalIcon.getImage();
        

        int width = originalIcon.getIconWidth();
        int height = originalIcon.getIconHeight();

        if (width > height) {
            height = (int) (height / (width / 150.0));
            image = image.getScaledInstance(150, height, 0);

        } else if (height > width) {
            width = (int) (width / (height / 175.0));
            image = image.getScaledInstance(width, 175, 0);
        } else {
            image = image.getScaledInstance(150, 175, 0);
        }

        ImageIcon scaledIcon = new ImageIcon(image);
        
        return scaledIcon;
    }
    
    

}
