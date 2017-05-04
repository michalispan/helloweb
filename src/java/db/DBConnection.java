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
    
    private static String createAimodotes = "create table AIMODOTES" +
"	AM INTEGER not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 10000, INCREMENT BY 1)," +
"	LAST_NAME VARCHAR(30)," +
"	NAME VARCHAR(30)," +
"	ADDRESS VARCHAR(30)," +
"	PHONE VARCHAR(15)," +
"	BLOOD_TYPE VARCHAR(3))";
    
    private static String createProsfora = "create table PROSFORA" +
"	PK_P INTEGER not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1)," +
"	BLOOD_BOTTLE INTEGER," +
"	DATE DATE," +
"	THEIRS_BLOOD INTEGER," +
"	AM INTEGER references aimodotes(am)," +
"	SXOLIA VARCHAR(100))";
    
//    private static String driver = "org.apache.derby.jdbc.ClientDriver";
//    private static String url = "jdbc:derby://localhost:1527/sample";
//    private static String user = "app";
//    private static String pwd = "app";
    
    private static String driver = "org.apache.derby.jdbc.EmbeddedDriver";
    private static String url = "jdbc:derby:bloodbank;create=true";
    
//    private static String driver = "com.mysql.jdbc.Driver";
//    private static String url = "jdbc:mysql://localhost:3306/bloodbank";
//    private static String user = "app";
//    private static String pwd = "app";
    
    public static Connection getConnection() {
        if (conn == null) {
            try {
                Class.forName(driver);
                conn = DriverManager.getConnection(url);
                conn.createStatement().execute(createAimodotes);
                conn.createStatement().execute(createProsfora);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return conn;

    }
    
}
