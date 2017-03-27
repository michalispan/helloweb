/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Μιχάλης
 */
public class dbmanager {

    Connection conn;

    public dbmanager() {
        conn = DBConnection.getConnection();
    }

    public void createDonor(Aimodotes donor) {
//        System.out.println("Created donor: " + donor.getAm() + "-" + donor.getLastName());
        try {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO AIMODOTES (LAST_NAME, "
                    + "NAME, ADDRESS, BLOOD_TYPE, PHONE) VALUES (?, ?, ?, ?, ?)");
            stmt.setString(1, donor.getLastName());
            stmt.setString(2, donor.getName());
            stmt.setString(3, donor.getAddress());
            stmt.setString(4, donor.getBloodType());
            stmt.setString(5, donor.getPhone());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(dbmanager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Aimodotes> getDonors() {
        List<Aimodotes> list = new ArrayList<>();

        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT AM, LAST_NAME, NAME, ADDRESS, PHONE, BLOOD_TYPE"
                    + " FROM AIMODOTES");
            ResultSet result = stmt.executeQuery();
            Aimodotes donor;
            while (result.next()) {
                donor = new Aimodotes();
                donor.setAm(result.getInt(1));
                donor.setLastName(result.getString(2));
                donor.setName(result.getString(3));
                donor.setAddress(result.getString(4));
                donor.setPhone(result.getString(5));
                donor.setBloodType(result.getString(6));
                list.add(donor);
            }
        } catch (SQLException ex) {
            Logger.getLogger(dbmanager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    public Aimodotes getDonor(int am) {
        Aimodotes donor = new Aimodotes();
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT AM, LAST_NAME, NAME, ADDRESS, PHONE, BLOOD_TYPE FROM AIMODOTES WHERE AM = ?");
            stmt.setInt(1, am);
            ResultSet result = stmt.executeQuery();
            result.next();
            donor.setAm(result.getInt(1));
            donor.setLastName(result.getString(2));
            donor.setName(result.getString(3));
            donor.setAddress(result.getString(4));
            donor.setPhone(result.getString(5));
            donor.setBloodType(result.getString(6));

            List<Prosfora> list = new ArrayList<>();
            stmt = conn.prepareStatement("SELECT AM, BLOOD_BOTTLE, DATE, THEIRS_BLOOD, PK_P ,SXOLIA FROM PROSFORA WHERE AM = ?");
            stmt.setInt(1, am);
            result = stmt.executeQuery();
            Prosfora doli;
            while (result.next()) {
                doli = new Prosfora();
                doli.setAm(result.getInt(1));
                doli.setBloodBottle(result.getInt(2));
                doli.setDate(result.getDate(3));
                doli.setTheirsBlood(result.getInt(4));
                doli.setPkP(result.getInt(5));
                doli.setSxolia(result.getString(6));
                list.add(doli);
            }

            donor.setProsforaList(list);

        } catch (SQLException ex) {
            Logger.getLogger(dbmanager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return donor;
    }

    public void updateDonor(Aimodotes donor) {
        try {
            PreparedStatement stmt = conn.prepareStatement("UPDATE AIMODOTES SET LAST_NAME = ?, NAME = ? , ADDRESS = ? ,BLOOD_TYPE = ? , PHONE = ? WHERE AM = ?");
            stmt.setString(1, donor.getLastName());
            stmt.setString(2, donor.getName());
            stmt.setString(3, donor.getAddress());
            stmt.setString(4, donor.getBloodType());
            stmt.setString(5, donor.getPhone());
            stmt.setInt(6, donor.getAm());
            stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(dbmanager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void createMovement(Prosfora dorea) {
        try {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO PROSFORA (AM, BLOOD_BOTTLE, DATE, THEIRS_BLOOD, SXOLIA) VALUES (?, ?, ?, ?, ?)");
            stmt.setInt(1, dorea.getAm());
            stmt.setInt(2, dorea.getBloodBottle());
            stmt.setDate(3, new java.sql.Date(dorea.getDate().getTime()));
            stmt.setInt(4, dorea.getTheirsBlood());
            stmt.setString(5, dorea.getSxolia());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(dbmanager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
