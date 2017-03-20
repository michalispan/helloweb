/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.util.List;

/**
 *
 * @author michael
 */
public class Aimodotes {

    private Integer am;
    private String lastName;
    private String name;
    private String address;
    private String phone;
    private String bloodType;
    private int totP; // Synolo fialon poy edose
    private int totL; // Synolo fialon pou pire
    private int ypol; // Ypoloipo pou tou menei
    private List<Prosfora> prosforaList;

    public Aimodotes() {
    }

    public Aimodotes(Integer am) {
        this.am = am;
    }

    public Integer getAm() {
        return am;
    }

    public void setAm(Integer am) {
        this.am = am;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public List<Prosfora> getProsforaList() {
        return prosforaList;
    }

    public void setProsforaList(List<Prosfora> prosforaList) {
        this.prosforaList = prosforaList;
    }

    public int getTotP() {
        totP = 0;
        for (Prosfora p : prosforaList) {
            totP += p.getBloodBottle();
        }
        return totP;
    }

    public int getTotL() {
        totL = 0;
        for (Prosfora p : prosforaList) {
            totL += p.getTheirsBlood();
        }
        return totL;
    }

    public int getYpol() {
        ypol = getTotP() - getTotL();
        return ypol;
    }

    
}
