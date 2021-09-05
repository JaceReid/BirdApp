/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pat_james;

/**
 *
 * @author james
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManger {

    private Connection conn;
/**
 * Constructor Method for the Database manger class.
 * sets up the connection to the database
 */
    public DBManger() {
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            String dbURL = "jdbc:derby:DBBirds";
            conn = DriverManager.getConnection(dbURL);
            System.out.println("Connection successful");
        } catch (ClassNotFoundException ex) {
            System.out.println("Class not found - unable to load driver");
        } catch (SQLException ex) {
            System.out.println("Connection error");
        }
    }

    /**
     * Connects to database and commits SQL query to return results
     *
     * @param sqlStatement String containing SQL query
     * @return result set from committed SQL query
     */
    public ResultSet queryTbl(String sqlStatement) throws SQLException {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sqlStatement);
        return rs;
    }

    /**
     * Connects to database and commits SQL query to update, delete or add
     * records
     *
     * @param sqlStatement String containing SQL query
     */
    public void updateTbl(String sqlStatement) throws SQLException {
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sqlStatement);
        stmt.close();
    }

}
