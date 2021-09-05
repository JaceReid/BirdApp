/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pat_james;

import java.io.FileReader;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author james
 */
public class BirdsManger {

    DBManger db = new DBManger();
    private ArrayList<Bird> birdArr = new ArrayList<>();
    private int size = 0;

    public BirdsManger() {
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

                size++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BirdsManger.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList getBirdArr() {
        return birdArr;
    }

    public void readbirds() {

        JSONParser jp = new JSONParser();
        JSONObject jo;

        try {

            jo = (JSONObject) jp.parse(new FileReader("Birds.json"));
            JSONArray ja = (JSONArray) jo.get("Birds");

            Iterator i = ja.iterator();

            while (i.hasNext()) {
                jo = (JSONObject) i.next();
                String name = "";
                try {
                    name = (String) jo.get("name");
                    Long minsize = (Long) jo.get("minsize");
                    Long maxsize = (Long) jo.get("maxsize");
                    String colour = (String) jo.get("colour");
                    Long Species = (Long) jo.get("Species");
                    Long type = (Long) jo.get("Type");
                    String desc = (String) jo.get("Desc");
                    String images = (String) jo.get("images");

                    db.updateTbl("Insert Into tblBirds (name,minsize,maxsize,colour,SpeciesID,TypeID,birddescription,images) values ('" + name + "' , " + minsize + ", " + maxsize + " , '" + colour + "'," + Species + "," + type + ", '" + desc + "','" + images + "')");

                } catch (SQLException ex) {
                    System.out.println("Error with: " + name);
                    Logger.getLogger(AppManger.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassCastException e) {
                    System.out.println("Error with: " + name);
                    Logger.getLogger(AppManger.class.getName()).log(Level.SEVERE, null, e);
                }
            }
        } catch (IOException | ParseException ex) {
            Logger.getLogger(AppManger.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void updatebirds() {
        JSONParser jp = new JSONParser();
        JSONObject jo;

        try {

            jo = (JSONObject) jp.parse(new FileReader("Birds.json"));
            JSONArray ja = (JSONArray) jo.get("Birds");

            Iterator i = ja.iterator();

            while (i.hasNext()) {
                jo = (JSONObject) i.next();

                String name = (String) jo.get("name");
                String images = (String) jo.get("images");

                try {
                    db.updateTbl("Update tblBirds set Images = '" + images + "' Where Name = '" + name + "'");
                } catch (SQLException ex) {
                    Logger.getLogger(AppManger.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (IOException | ParseException ex) {
            Logger.getLogger(AppManger.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Bird> findBird(int type, int size, String habitat, String colour) {
        ArrayList<Bird> BirdsArr = new ArrayList<>();

        int count = 0;
        for (int i = 0; i < birdArr.size(); i++) {

            if (birdArr.get(i).getType() == type && birdArr.get(i).getColour().contains(colour) && birdArr.get(i).getHabitat().contains(habitat) && size > birdArr.get(i).getMinsize()-10 && size < birdArr.get(i).getMaxsize()+10) {
                
                BirdsArr.add(birdArr.get(i));
                
                count++;
            }

        }
        
        return BirdsArr;
    }

    public String names() {
        String s = "";

        for (Bird birdArr1 : birdArr) {
            s += birdArr1.getName() + ",";
        }

        return s;
    }
}
