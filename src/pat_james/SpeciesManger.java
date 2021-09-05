/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pat_james;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
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
public class SpeciesManger {

    DBManger db = new DBManger();
    private ArrayList<Species> SpecciesArr = new ArrayList<>();

    public SpeciesManger() {
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
            Logger.getLogger(BirdsManger.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList getSpecciesArr() {
        return SpecciesArr;
    }

    public void writeToFile() {
        JSONObject obj = new JSONObject();

        JSONArray listP = new JSONArray();

//Cycle for passengers
        for (Species spec : SpecciesArr) {
            obj.put("ID", spec.getId());
            obj.put("Name", spec.getName());
            obj.put("Habitat", spec.getHabitat());
            obj.put("Beak", spec.getBeak());
            obj.put("Claw", spec.getClaw());

//            obj.put("",spec.getId(), list);
            listP.add(obj);
            obj = new JSONObject();
        }

// To build one passenger like json object 
// To add passenger to list of passengers
        try {

// Save to file
            FileWriter file = new FileWriter("Species.json");
            file.write(listP.toJSONString());
            file.flush();
            file.close();

        } catch (IOException e) {
            System.out.println("Error");
        }

//Print on console
        System.out.print(obj);
    }

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

}
