/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pat_james;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author james
 */
public class LogManger {

    private DBManger db = new DBManger();
    private ArrayList<Log> LogArr = new ArrayList<>();

    public LogManger() {
        try {
            ResultSet rs = db.queryTbl("SELECT * FROM TBLLogs");
            String Date,descrition, location;
            int UserID, BirdID;

            while (rs.next()) {
                UserID = rs.getInt("User_ID");
                descrition = rs.getString("LogDescription");
                location = rs.getString("LogLocation");
                Date = rs.getString("LogDate");
                BirdID = rs.getInt("Bird_ID");
                System.out.println(Date);
                LogArr.add(new Log(location, descrition, Date, BirdID, UserID));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(BirdsManger.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Log> getLogArr() {
        return LogArr;
    }

}
