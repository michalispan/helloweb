/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author michael
 */
public class DBConnection {
    
    private static Connection conn = null;
    
//    private static String driver = "org.apache.derby.jdbc.ClientDriver";
//    private static String url = "jdbc:derby://localhost:1527/sample";
//    private static String user = "app";
//    private static String pwd = "app";
    
    private static String driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/bloodbank";
    private static String user = "app";
    private static String pwd = "app";
    
    public static Connection getConnection() {
        if (conn == null) {
            try {
                Class.forName(driver);
                conn = DriverManager.getConnection(url, user, pwd);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return conn;

    }
    
}
